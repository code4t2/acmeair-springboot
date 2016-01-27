package com.acmeair.web.hystrixcommands;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.acmeair.entities.CustomerSession;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TokenService {

	private static final Log log = LogFactory.getLog(TokenService.class);

	@Autowired // Created automatically by Spring Cloud
	@LoadBalanced
	RestTemplate restTemplate;
	
	private static final String ACMEAIR_AUTH_SERVICE = "http://ACMEAIR-AUTH-SERVICE";

	///////////////////////
	// create token
	@HystrixCommand(fallbackMethod = "fallbackCreateToken")
	public CustomerSession createToken(String userid) {
		String url = ACMEAIR_AUTH_SERVICE + CommandConstants.ACME_AIR_AUTH_SERVICE_CONTEXT_AND_REST_PATH + "/authtoken/byuserid/" + userid;
		// FIXME: ClientFactory.getNamedClient(CommandConstants.ACME_AIR_AUTH_SERVICE_NAMED_CLIENT)
		CustomerSession s = restTemplate.postForObject(url, "", CustomerSession.class);
		return s;
	}

	public CustomerSession fallbackCreateToken(String userid) {
		log.error("calling CreateToken fallback for user: " + userid);
		return null;
	}

	///////////////////////
	// validate token
	@HystrixCommand(fallbackMethod = "fallbackValidateToken")
	public CustomerSession validateToken(String tokenid) {
		String url = ACMEAIR_AUTH_SERVICE + CommandConstants.ACME_AIR_AUTH_SERVICE_CONTEXT_AND_REST_PATH + "/authtoken/" + tokenid;
		// FIXME: ClientFactory.getNamedClient(CommandConstants.ACME_AIR_AUTH_SERVICE_NAMED_CLIENT)
		return restTemplate.getForObject(url, CustomerSession.class);
	}
	
	public CustomerSession fallbackValidateToken(String tokenid) {
		log.error("calling ValidateToken fallback for token: " + tokenid);
		return null;
	}

	///////////////////////
	// invalidate token
	@HystrixCommand(fallbackMethod = "fallbackInvalidateToken")
	public void invalidateToken(String tokenid) {
		String url = ACMEAIR_AUTH_SERVICE + CommandConstants.ACME_AIR_AUTH_SERVICE_CONTEXT_AND_REST_PATH + "/authtoken/" + tokenid;
		// FIXME: ClientFactory.getNamedClient(CommandConstants.ACME_AIR_AUTH_SERVICE_NAMED_CLIENT)
		restTemplate.delete(url);
	}

	public void fallbackInvalidateToken(String tokenid) {
		log.error("calling InvalidateToken fallback for token: " + tokenid);
	}

}

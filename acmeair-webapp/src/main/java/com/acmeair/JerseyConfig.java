package com.acmeair;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acmeair.config.AcmeAirConfiguration;
import com.acmeair.config.LoaderREST;
import com.acmeair.web.BookingsREST;
import com.acmeair.web.CustomerREST;
import com.acmeair.web.FlightsREST;
import com.acmeair.web.LoginREST;
import com.acmeair.web.RESTCookieSessionFilter;

@Configuration
public class JerseyConfig extends ResourceConfig {

//	@Bean(name="jerseyFilterRegistration")
//	public FilterRegistrationBean jerseyFilterRegistrationRegistrationBean() {
//	    FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//	    JerseyFilter f;
//	    RESTCookieSessionFilter restCookieSessionFilter = new RESTCookieSessionFilter();
//	    registrationBean.setFilter(restCookieSessionFilter);
//	    registrationBean.addUrlPatterns("/rest/*");
//	    registrationBean.setOrder(1);
//	    return registrationBean;
//	}

	public JerseyConfig() {
		// Due to bug #1468 (https://github.com/spring-projects/spring-boot/issues/1468), packages not work!
		// see: https://github.com/jersey/jersey/pull/196
		//packages("com.acmeair.web");
		
		register(BookingsREST.class);
		register(CustomerREST.class);
		register(FlightsREST.class);
		register(LoginREST.class);
		
		register(AcmeAirConfiguration.class);
		register(LoaderREST.class);

		property(ServletProperties.FILTER_FORWARD_ON_404, true);
	}

}
package com.acmeair.services.authService;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(AuthTokenREST.class);
	}
}

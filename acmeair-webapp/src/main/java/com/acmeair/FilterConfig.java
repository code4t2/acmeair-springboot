package com.acmeair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import com.acmeair.web.RESTCookieSessionFilter;

@Configuration
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
public class FilterConfig {
	
	@Autowired
	private RESTCookieSessionFilter restCookieSessionFilter;
	
	@Bean
	@Autowired
	public FilterRegistrationBean restCookieSessionFilterRegistrationBean() {
	    FilterRegistrationBean registrationBean = new FilterRegistrationBean();
	    //RESTCookieSessionFilter restCookieSessionFilter = new RESTCookieSessionFilter();
	    registrationBean.setFilter(restCookieSessionFilter);
	    registrationBean.addUrlPatterns("/rest/api/*");
	    registrationBean.setOrder(0);
	    return registrationBean;
	}
}

package com.acmeair;

import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.request.RequestContextListener;

import com.acmeair.service.DataService;
import com.acmeair.service.ServiceLocator;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}


	public static void main(String[] args) throws Exception {
		// SpringApplication.run(Application.class, args);
		ApplicationContext appContext = new Application().configure(new SpringApplicationBuilder(Application.class))
				.run(args);


	}


}

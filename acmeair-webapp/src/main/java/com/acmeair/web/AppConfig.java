package com.acmeair.web;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

import com.acmeair.config.AcmeAirConfiguration;
import com.acmeair.config.LoaderREST;

/**
 * Use JerseyConfig instead, for only one ResourceConfig could be supported by
 * SpringBoot.
 * 
 * See details in https://github.com/spring-projects/spring-boot/issues/3260
 * 
 * @author Xiao Xi Liu
 *
 */
@Deprecated
@ApplicationPath("/rest/info")
public class AppConfig extends Application {
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(LoaderREST.class, AcmeAirConfiguration.class));
    }
}

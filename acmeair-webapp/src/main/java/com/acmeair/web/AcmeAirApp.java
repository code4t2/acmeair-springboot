package com.acmeair.web;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

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
@ApplicationPath("/rest/api")
public class AcmeAirApp extends Application {
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(BookingsREST.class, CustomerREST.class, FlightsREST.class, LoginREST.class));
    }
}

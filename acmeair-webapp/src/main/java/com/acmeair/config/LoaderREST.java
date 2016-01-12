package com.acmeair.config;

import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.acmeair.loader.Loader;


//@Path("/loader")
@Path("/rest/info/loader")
public class LoaderREST {

//	private static Logger logger = Logger.getLogger(LoaderREST.class.getName());
	
	@Inject
	@Autowired
	private Loader loader;	
	
	@GET
	@Path("/query")
	@Produces("text/plain")
	public Response queryLoader() {			
		String response = loader.queryLoader();
		return Response.ok(response).build();	
	}
	
	
	@GET
	@Path("/load")
	@Produces("text/plain")
	public Response loadDB(@DefaultValue("-1") @QueryParam("numCustomers") long numCustomers) {	
		String response = loader.loadDB(numCustomers);
		return Response.ok(response).build();	
	}
}

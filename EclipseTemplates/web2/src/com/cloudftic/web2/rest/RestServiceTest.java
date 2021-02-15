package com.cloudftic.web2.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("ping")
public class RestServiceTest {

	@GET
	public Response get( ) {
		 return Response
	                .ok("ping")
	                .build();
	}
}

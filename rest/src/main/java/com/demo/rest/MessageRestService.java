package com.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class MessageRestService {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{param}")
	public String printMessage(@PathParam("param") String msg) {

		String result = "Restful example :D " + msg;

		return result;

	}
}

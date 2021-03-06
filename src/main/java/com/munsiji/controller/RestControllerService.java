package com.munsiji.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.munsiji.resource.reqres.LoginReq;
import com.munsiji.resource.reqres.ServerResponse;
import com.munsiji.service.LoginService;

@Path("/rest")
public class RestControllerService {

	@GET
	@Path("/gethealth")
	public String healthCheck(){
	   System.out.println("healthcheck method called");	
	   return "{\"status\":\"sucess\"}";
	}
	@POST
	@Path("/posthealth")
	public String healthCheck(String str){
	   System.out.println("healthcheck method called");	
	   return "{\"status\":\"sucess\"}";
	}
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ServerResponse login(LoginReq loginReq){
		System.out.println("login method excuted:"+loginReq.getUname());
		ServerResponse response=null;
		LoginService loginService=new LoginService();
		response=loginService.processReq(loginReq);
		return response;
		
	}
	
	
}

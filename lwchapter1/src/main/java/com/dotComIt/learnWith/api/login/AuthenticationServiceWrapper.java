package com.dotComIt.learnWith.api.login;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dotComIt.learnWith.conf.DatabaseConfig;
import com.dotComIt.learnWith.services.AuthenticationService;
import com.dotComIt.learnWith.vos.ResultObjectVO;
import com.dotComIt.learnWith.vos.UserVO;

@Path("login")
public class AuthenticationServiceWrapper {
	
	private DatabaseConfig dc; 
	
	private AuthenticationService as; 
	
	public AuthenticationServiceWrapper() {
		dc = new DatabaseConfig(); 
		as = new AuthenticationService(dc.opConnection());
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultObjectVO login(UserVO user) {
		
		return as.authenticate(user.getUsername(), user.getPassword()); 
	}

}

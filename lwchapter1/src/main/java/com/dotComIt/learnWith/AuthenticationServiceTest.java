package com.dotComIt.learnWith;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dotComIt.learnWith.conf.DatabaseConfig;
import com.dotComIt.learnWith.services.AuthenticationService;
import com.dotComIt.learnWith.vos.ResultObjectVO;

@Path("test/login")
public class AuthenticationServiceTest {

	private DatabaseConfig dc;

	private AuthenticationService as;

	public AuthenticationServiceTest() {
		dc = new DatabaseConfig();
		as = new AuthenticationService(dc.opConnection());
	}

	@GET
	@Path("success")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultObjectVO loadUserSuccess() {

		return as.authenticate("me", "AB86A1E1EF70DFF97959067B723C5C24");

	}
	
	@GET
	@Path("fail")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultObjectVO loadUserFail() {
	    // non hashed password so should fail
	    return as.authenticate("me","me");
	}


}

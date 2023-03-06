package com.vn.haitt.restfull.api.app.rest;

import com.vn.haitt.restfull.api.app.req.WelcomeReq;
import com.vn.haitt.restfull.api.app.res.WelcomeRes;
import com.vn.haitt.restfull.api.constant.ApiConstant;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = {ApiConstant.WELCOME_TAG})
public interface IApiWelcomeRest {
	
	@ApiOperation("Welcome Message")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success"), 
			@ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 402, message = "Forbidden"), 
            @ApiResponse(code = 500, message = "Internal server error"), })
	public String welcomeMsg(@ApiParam(name = "body", value = "Name") String name);
	
	@ApiOperation("Welcome Message")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success"), 
			@ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 402, message = "Forbidden"), 
            @ApiResponse(code = 500, message = "Internal server error"), })
	public WelcomeRes welcomeMsgPost(@ApiParam(name = "body", value = "welcome") WelcomeReq welcomeObj);
}

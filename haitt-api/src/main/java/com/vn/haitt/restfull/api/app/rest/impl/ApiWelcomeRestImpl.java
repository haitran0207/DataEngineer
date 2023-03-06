package com.vn.haitt.restfull.api.app.rest.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vn.haitt.restfull.api.app.req.WelcomeReq;
import com.vn.haitt.restfull.api.app.res.WelcomeRes;
import com.vn.haitt.restfull.api.app.rest.IApiWelcomeRest;

@RestController
public class ApiWelcomeRestImpl implements IApiWelcomeRest{
	
	@GetMapping("/welcome")
	public String welcomeMsg(String name) {
		return "welcome to HaiTT RestApi Project " + name ;
	}

	@PostMapping("/welcome-post")
	public WelcomeRes welcomeMsgPost(WelcomeReq welcome) {
		WelcomeRes welcomeRes = new WelcomeRes();
		welcomeRes.setWelcomeMessage("Welcom to HaiTT RestApi project " + welcome.getName());
		return welcomeRes;
	}
}

package com.sgnbs.system.basic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sgnbs.system.basic.bo.intf.AdminBO;

@Controller
public class MainLogin {
	
	@Autowired
	private AdminBO adminBO;  
	
	private static final Logger logger = LoggerFactory
			.getLogger(MainLogin.class);

	@RequestMapping(value = "/tolog", method = RequestMethod.GET)
	public String loginPage(Model model) {
		logger.info("Welcome home!.");

		return "admin/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginAction(Model model) {
		logger.info("Welcome home!.");

		return "admin/index";
	}
}

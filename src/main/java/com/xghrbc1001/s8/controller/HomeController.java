package com.xghrbc1001.s8.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/index1", method = RequestMethod.GET)
	public ModelAndView showSignUp(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("index1");
	}
	
	@RequestMapping(value = "/index2", method = RequestMethod.GET)
	public String list(Integer pageNumber, ModelMap model) {
		model.addAttribute("name","中国");
		return "/common/index1";
	}
}

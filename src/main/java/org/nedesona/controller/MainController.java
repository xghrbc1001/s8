package org.nedesona.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/")
	public ModelAndView getHome() {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("home", model);
	}
}

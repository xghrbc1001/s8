package org.nedesona.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nedesona.domain.BookmarkUser;
import org.nedesona.domain.User;
import org.nedesona.utils.BookmarkUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView showSignUp(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();
		BookmarkUser user = BookmarkUtils.getUser(request);
		return new ModelAndView("index", model);
	}
}

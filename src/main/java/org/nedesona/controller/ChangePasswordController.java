package org.nedesona.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nedesona.domain.BookmarkUser;
import org.nedesona.service.UserManager;
import org.nedesona.utils.BookmarkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChangePasswordController {

	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/changePassword", method = RequestMethod.GET)
	public ModelAndView showSignUp(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("changePassword", model);
	}

	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public @ResponseBody
	Object showSignUp(HttpServletRequest request,
			@RequestBody Map<String, Object> data) {
		Map<String, Object> model = new HashMap<String, Object>();
		String oldPassword = (String) data.get("oldPassword");
		String newPassword = (String) data.get("newPassword");
		BookmarkUser user = BookmarkUtils.getUser(request);
		if (user.getPassword().equals(oldPassword)) {
			user.setPassword(newPassword);
			user.setPassChanged(true);
			userManager.updatePassword(user);
			model.put("success", true);
		} else {
			model.put("success", false);
			model.put("error", "Old password provided by you is incorrect.");
		}
		return model;
	}
}

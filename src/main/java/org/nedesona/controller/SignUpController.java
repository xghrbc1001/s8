package org.nedesona.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nedesona.domain.BookmarkUser;
import org.nedesona.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignUpController {

	@Autowired
	private UserManager userManager;

	@Autowired
	private JavaMailSender mailSender;

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public ModelAndView showSignUp(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("signUp", model);
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public @ResponseBody
	Object showSignUp(HttpServletRequest request, @RequestBody BookmarkUser user) {
		Map<String, Object> model = new HashMap<String, Object>();
		try {

			String password = userManager.generateRandomPassword();
			user.setPassword(password);
			user.setPassChanged(false);
			userManager.addNewUser(user);
			SimpleMailMessage message = new SimpleMailMessage();

			message.setFrom("deep16aug@gmail.com");
			message.setTo(user.getEmail());
			message.setSubject("Welcome to Online Bookmark.");
			message.setText("Dear "
					+ user.getFullName()
					+ ",\r\n\n\n\t You are not member of Online Bookmark Family.Use \'"
					+ user.getPassword()
					+ "\' to login to application.\r\n\n\n\nThank\r\nDeepak Rathor");

			mailSender.send(message);
			model.put("success", true);
			model.put("msg",
					"You have successfully register with Online Bookmark");
		} catch (Exception e) {
			model.put("success", false);
			model.put("msg", "Error while processing your request.");
		}

		return model;
	}

}

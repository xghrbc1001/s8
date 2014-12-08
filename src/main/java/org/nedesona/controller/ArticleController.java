package org.nedesona.controller;

import java.util.HashMap;
import java.util.Map;

import org.nedesona.domain.Article;
import org.nedesona.service.ArticleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleManager manager;

	@RequestMapping(value = "/addPost")
	public ModelAndView getArticlePage() {
		Map<String, Object> model = new HashMap<String, Object>();
		return new ModelAndView("addArticle", model);
	}

	@RequestMapping(value = "/addPost/save", method = RequestMethod.POST)
	public @ResponseBody
	Object saveArticle(@RequestBody Article article) {
		Map<String, Object> model = new HashMap<String, Object>();
		manager.saveArticle(article);
		model.put("articleList", manager.getArticleList());
		//System.out.println();
		return model;

	}
}

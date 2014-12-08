package org.nedesona.service.impl;

import java.util.List;

import org.nedesona.dao.ArticleDao;
import org.nedesona.domain.Article;
import org.nedesona.service.ArticleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleManagerImpl implements ArticleManager {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public void saveArticle(Article article) {
		articleDao.saveArticle(article);

	}

	@Override
	public List<Article> getArticleList() {
		return articleDao.getArticleList();
	}

}

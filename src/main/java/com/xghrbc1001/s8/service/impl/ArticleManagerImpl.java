package com.xghrbc1001.s8.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xghrbc1001.s8.dao.ArticleDao;
import com.xghrbc1001.s8.domain.Article;
import com.xghrbc1001.s8.service.ArticleManager;

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

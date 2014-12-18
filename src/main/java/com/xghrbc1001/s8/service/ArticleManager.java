package com.xghrbc1001.s8.service;

import java.util.List;

import com.xghrbc1001.s8.domain.Article;

public interface ArticleManager {

	void saveArticle(Article article);

	List<Article> getArticleList();

}

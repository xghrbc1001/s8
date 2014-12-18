package com.xghrbc1001.s8.dao;

import java.util.List;

import com.xghrbc1001.s8.domain.Article;

public interface ArticleDao {

	void saveArticle(Article article);

	List<Article> getArticleList();

}

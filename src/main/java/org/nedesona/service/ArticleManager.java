package org.nedesona.service;

import java.util.List;

import org.nedesona.domain.Article;

public interface ArticleManager {

	void saveArticle(Article article);

	List<Article> getArticleList();

}

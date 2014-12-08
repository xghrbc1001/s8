package org.nedesona.dao;

import java.util.List;

import org.nedesona.domain.Article;

public interface ArticleDao {

	void saveArticle(Article article);

	List<Article> getArticleList();

}

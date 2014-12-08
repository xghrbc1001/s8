package org.nedesona.dao.impl;

import java.util.List;

import org.nedesona.dao.ArticleDao;
import org.nedesona.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDaoImpl implements ArticleDao {

	@Autowired(required = false)
	private MongoTemplate mongoTemplate;

	@Override
	public void saveArticle(Article article) {
		mongoTemplate.save(article);

	}

	@Override
	public List<Article> getArticleList() {
		return mongoTemplate.findAll(Article.class);
	}
}

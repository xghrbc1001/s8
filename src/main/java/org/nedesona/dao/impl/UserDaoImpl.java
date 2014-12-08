package org.nedesona.dao.impl;

import java.util.Map;

import org.nedesona.dao.UserDao;
import org.nedesona.domain.BookmarkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired(required = false)
	private MongoTemplate mongoTemplate;

	@Override
	public void addNewUser(BookmarkUser user) {
		mongoTemplate.save(user);
	}

	@Override
	public BookmarkUser validateUser(Map<String, Object> data) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userName").is(data.get("userName"))
				.and("password").is(data.get("password")));
		BookmarkUser user = mongoTemplate.findOne(query, BookmarkUser.class,
				"bookmarkuser");
		if (user != null) {
			return user;
		} else {
			return null;
		}

	}

	@Override
	public void updatePassword(BookmarkUser user) {
		mongoTemplate.save(user);
	}

}

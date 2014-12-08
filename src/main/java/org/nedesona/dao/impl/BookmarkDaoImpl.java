package org.nedesona.dao.impl;

import org.nedesona.dao.BookmarkDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookmarkDaoImpl implements BookmarkDao {
	@Autowired(required = false)
	private MongoTemplate mongoTemplate;
}

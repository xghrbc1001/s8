package com.xghrbc1001.s8.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.xghrbc1001.s8.dao.BookmarkDao;

@Repository
public class BookmarkDaoImpl implements BookmarkDao {
	@Autowired(required = false)
	private MongoTemplate mongoTemplate;
}

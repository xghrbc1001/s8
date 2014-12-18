package com.xghrbc1001.s8.dao;

import java.util.Map;

import com.xghrbc1001.s8.domain.BookmarkUser;

public interface UserDao {

	void addNewUser(BookmarkUser user);

	BookmarkUser validateUser(Map<String, Object> data);

	void updatePassword(BookmarkUser user);

}

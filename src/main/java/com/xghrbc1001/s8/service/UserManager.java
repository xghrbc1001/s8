package com.xghrbc1001.s8.service;

import java.util.Map;

import com.xghrbc1001.s8.domain.BookmarkUser;

public interface UserManager {

	void addNewUser(BookmarkUser user);

	BookmarkUser validateUser(Map<String, Object> data);
	
	String generateRandomPassword();

	void updatePassword(BookmarkUser user);

}

package org.nedesona.service;

import java.util.Map;

import org.nedesona.domain.BookmarkUser;

public interface UserManager {

	void addNewUser(BookmarkUser user);

	BookmarkUser validateUser(Map<String, Object> data);
	
	String generateRandomPassword();

	void updatePassword(BookmarkUser user);

}

package org.nedesona.dao;

import java.util.Map;

import org.nedesona.domain.BookmarkUser;

public interface UserDao {

	void addNewUser(BookmarkUser user);

	BookmarkUser validateUser(Map<String, Object> data);

	void updatePassword(BookmarkUser user);

}

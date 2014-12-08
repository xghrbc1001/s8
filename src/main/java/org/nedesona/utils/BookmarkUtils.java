package org.nedesona.utils;

import javax.servlet.http.HttpServletRequest;

import org.nedesona.domain.BookmarkUser;

public class BookmarkUtils {
	public static BookmarkUser getUser(HttpServletRequest request) {
		BookmarkUser user = (BookmarkUser) request.getSession().getAttribute("loggedInUser");
		return user;
	}
}

package com.xghrbc1001.s8.utils;

import javax.servlet.http.HttpServletRequest;

import com.xghrbc1001.s8.domain.BookmarkUser;

public class BookmarkUtils {
	public static BookmarkUser getUser(HttpServletRequest request) {
		BookmarkUser user = (BookmarkUser) request.getSession().getAttribute("loggedInUser");
		return user;
	}
}

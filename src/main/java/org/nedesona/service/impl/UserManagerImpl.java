package org.nedesona.service.impl;

import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;

import org.nedesona.dao.UserDao;
import org.nedesona.domain.BookmarkUser;
import org.nedesona.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerImpl implements UserManager {

	private static final Random RANDOM = new SecureRandom();
	public static final int PASSWORD_LENGTH = 8;

	@Autowired
	private UserDao userDao;

	@Override
	public void addNewUser(BookmarkUser user) {
		userDao.addNewUser(user);

	}

	@Override
	public BookmarkUser validateUser(Map<String, Object> data) {
		return userDao.validateUser(data);
	}

	@Override
	public String generateRandomPassword() {
		String letters = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789+@";
		String pw = "";
		for (int i = 0; i < PASSWORD_LENGTH; i++) {
			int index = (int) (RANDOM.nextDouble() * letters.length());
			pw += letters.substring(index, index + 1);
		}
		return pw;
	}

	@Override
	public void updatePassword(BookmarkUser user) {
		userDao.updatePassword(user);
		
	}

}

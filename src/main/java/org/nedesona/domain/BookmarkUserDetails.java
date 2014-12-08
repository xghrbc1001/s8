package org.nedesona.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookmarkuserdetails")
public class BookmarkUserDetails {

	@Id
	private String id;

	@DBRef
	private BookmarkUser userId;

	private String about;
	private String phone;
	private String mobile;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BookmarkUser getUserId() {
		return userId;
	}

	public void setUserId(BookmarkUser userId) {
		this.userId = userId;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}

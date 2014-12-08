package org.nedesona.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookmarkusercircle")
public class BookmarkUserCircle {

	@Id
	private String id;

	@DBRef
	private BookmarkUser userId;

	@DBRef
	private BookmarkUser friendId;

	@DBRef
	private CircleType circleType;

	private Boolean approved;
	private Date addedDate;
	private Date approvedDate;
	private String message;

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

	public BookmarkUser getFriendId() {
		return friendId;
	}

	public void setFriendId(BookmarkUser friendId) {
		this.friendId = friendId;
	}

	public CircleType getCircleType() {
		return circleType;
	}

	public void setCircleType(CircleType circleType) {
		this.circleType = circleType;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

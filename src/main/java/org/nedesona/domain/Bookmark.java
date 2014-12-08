package org.nedesona.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookmark")
public class Bookmark {

	@Id
	private String id;
	private String link;
	private String description;
	private Date posteddate;
	private Date lastviewdate;
	@DBRef
	private BookmarkSubCategory subCategory;
	private Integer like;
	private Integer dislike;
	private Integer viewCount;
	private boolean isprivate;
	@DBRef
	private BookmarkUser userId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPosteddate() {
		return posteddate;
	}

	public void setPosteddate(Date posteddate) {
		this.posteddate = posteddate;
	}

	public Date getLastviewdate() {
		return lastviewdate;
	}

	public void setLastviewdate(Date lastviewdate) {
		this.lastviewdate = lastviewdate;
	}

	public BookmarkSubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(BookmarkSubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public Integer getDislike() {
		return dislike;
	}

	public void setDislike(Integer dislike) {
		this.dislike = dislike;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public boolean isIsprivate() {
		return isprivate;
	}

	public void setIsprivate(boolean isprivate) {
		this.isprivate = isprivate;
	}

	public BookmarkUser getUserId() {
		return userId;
	}

	public void setUserId(BookmarkUser userId) {
		this.userId = userId;
	}

}

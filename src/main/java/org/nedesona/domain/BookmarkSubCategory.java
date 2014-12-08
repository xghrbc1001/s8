package org.nedesona.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookmarksubcategory")
public class BookmarkSubCategory {

	@Id
	private String id;
	private String description;
	@DBRef
	private BookmarkCategory category;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BookmarkCategory getCategory() {
		return category;
	}

	public void setCategory(BookmarkCategory category) {
		this.category = category;
	}

}

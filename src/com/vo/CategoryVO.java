package com.vo;

public class CategoryVO {
	private int category_id;
	private String category_name;
	private String parentcategory;
	
	public CategoryVO(){
		
	}

	public CategoryVO(int category_id, String category_name, String parentcategory) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.parentcategory = parentcategory;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getParentcategory() {
		return parentcategory;
	}

	public void setParentcategory(String parentcategory) {
		this.parentcategory = parentcategory;
	}

	@Override
	public String toString() {
		return "CategoryVO [category_id=" + category_id + ", category_name=" + category_name + ", parentcategory="
				+ parentcategory + "]";
	}
	
	
	
}
	

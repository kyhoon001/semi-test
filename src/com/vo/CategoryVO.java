package com.vo;

public class CategoryVO {
	private int CATEGORY_ID;
	private int CATEGORY_NAME;
	private int PARENTCATEGORY;
	
	public CategoryVO(){
		super();
	}
	
	public CategoryVO(int CATEGORY_ID, int CATEGORY_NAME, int PARENTCATEGORY) {
		super();
		this.CATEGORY_ID = CATEGORY_ID;
		this.CATEGORY_NAME = CATEGORY_NAME;
		this.PARENTCATEGORY = PARENTCATEGORY;
	}
	public int getCATEGORY_ID() {
		return CATEGORY_ID;
	}
	public void setCATEGORY_ID(int CATEGORY_ID) {
		this.CATEGORY_ID = CATEGORY_ID;
	}
	public int getCATEGORY_NAME() {
		return CATEGORY_NAME;
	}
	public void setCATEGORY_NAME(int CATEGORY_NAME) {
		this.CATEGORY_NAME = CATEGORY_NAME;
	}
	public int getPARENTCATEGORY() {
		return PARENTCATEGORY;
	}
	public void setPARENTCATEGORY(int PARENTCATEGORY) {
		this.PARENTCATEGORY = PARENTCATEGORY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CATEGORY_ID;
		result = prime * result + CATEGORY_NAME;
		result = prime * result + PARENTCATEGORY;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoryVO other = (CategoryVO) obj;
		if (CATEGORY_ID != other.CATEGORY_ID)
			return false;
		if (CATEGORY_NAME != other.CATEGORY_NAME)
			return false;
		if (PARENTCATEGORY != other.PARENTCATEGORY)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CategoryVO [CATEGORY_ID=" + CATEGORY_ID + ", CATEGORY_NAME=" + CATEGORY_NAME + ", PARENTCATEGORY="
				+ PARENTCATEGORY + "]";
	}
	
	
}

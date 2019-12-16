package com.vo;

public class CartVO {
	String basket_id;
	String email;
	int product_id;
	int count;
	public String getBasket_id() {
		return basket_id;
	}
	public void setBasket_id(String basket_id) {
		this.basket_id = basket_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public CartVO(String basket_id, String email, int product_id, int count) {
		super();
		this.basket_id = basket_id;
		this.email = email;
		this.product_id = product_id;
		this.count = count;
	}
	public CartVO() {
		super();
	}
	@Override
	public String toString() {
		return "CartVO [basket_id=" + basket_id + ", email=" + email + ", product_id=" + product_id + ", count=" + count
				+ "]";
	}
	
	
	
	
	
}

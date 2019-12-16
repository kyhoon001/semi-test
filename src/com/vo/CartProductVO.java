package com.vo;

public class CartProductVO {
	private int product_id;
	private String name;
	private int price;
	private int stock;
	private String img;
	private int category_id;
	private int soldamount;
	private String description;
	private String basket_id;
	private String email;
	private int count;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getSoldamount() {
		return soldamount;
	}
	public void setSoldamount(int soldamount) {
		this.soldamount = soldamount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public CartProductVO(int product_id, String name, int price, int stock, String img, int category_id, int soldamount,
			String description, String basket_id, String email, int count) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.img = img;
		this.category_id = category_id;
		this.soldamount = soldamount;
		this.description = description;
		this.basket_id = basket_id;
		this.email = email;
		this.count = count;
	}
	public CartProductVO() {
		super();
	}
	@Override
	public String toString() {
		return "CartProductVO [product_id=" + product_id + ", name=" + name + ", price=" + price + ", stock=" + stock
				+ ", img=" + img + ", category_id=" + category_id + ", soldamount=" + soldamount + ", description="
				+ description + ", basket_id=" + basket_id + ", email=" + email + ", count=" + count + "]";
	}
	
	
}

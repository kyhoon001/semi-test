package com.vo;

public class ProductVO {
	private int product_id;
	private String name;
	private int price;
	private int stock;
	private String img;
	private int category_id;
	private int soldamount;
	private String description;
	
	public ProductVO() {
		
	}
	
	public ProductVO(int product_id, String name, int price, int stock, String img, int category_id,
			int soldamount,String description) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.img = img;
		this.category_id = category_id;
		this.soldamount = soldamount;
		this.description = description;
	}

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

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + category_id;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((img == null) ? 0 : img.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + product_id;
		result = prime * result + soldamount;
		result = prime * result + stock;
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
		ProductVO other = (ProductVO) obj;
		if (category_id != other.category_id)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (img == null) {
			if (other.img != null)
				return false;
		} else if (!img.equals(other.img))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (product_id != other.product_id)
			return false;
		if (soldamount != other.soldamount)
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductVO [product_id=" + product_id + ", name=" + name + ", price=" + price + ", stock=" + stock
				+ ", img=" + img + ", category_id=" + category_id + ", soldamount=" + soldamount + ", description="
				+ description + "]";
	}


	
	
	

}

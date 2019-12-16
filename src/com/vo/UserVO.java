package com.vo;

import java.util.Date;

public class UserVO {
	private String email;
	private String pwd;
	private String name;
	private String address;
	private String phone;
	private Date b_date;
	private String sex;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getB_date() {
		return b_date;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "UserVO [email=" + email + ", pwd=" + pwd + ", name=" + name + ", address=" + address + ", phone="
				+ phone + ", b_date=" + b_date + ", sex=" + sex + "]";
	}
	public UserVO(String email, String pwd, String name, String address, String phone, Date b_date,
			String sex) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.b_date = b_date;
		this.sex = sex;
	}
	
	
	public UserVO() {
		super();
	}
}

package com.vo;

import java.util.Date;

public class BoardVO {
	String board_id;
	String email;
	String img;
	String board_contents;
	Date inp_board_dt;
	String inp_board_email;
	Date mdf_board_dt;
	String mdf_board_email;
	String board_category;
	
	public BoardVO() {
		
	}
	
	
	
	public BoardVO(String board_id, String board_contents, Date mdf_board_dt, String board_category) {
		this.board_id = board_id;
		this.board_contents = board_contents;
		this.mdf_board_dt = mdf_board_dt;
		this.board_category = board_category;
	}



	public BoardVO(String board_id, String email, String img, String board_contents, Date inp_board_dt,
			String inp_board_email, Date mdf_board_dt, String mdf_board_email, String board_category) {
		this.board_id = board_id;
		this.email = email;
		this.img = img;
		this.board_contents = board_contents;
		this.inp_board_dt = inp_board_dt;
		this.inp_board_email = inp_board_email;
		this.mdf_board_dt = mdf_board_dt;
		this.mdf_board_email = mdf_board_email;
		this.board_category = board_category;
	}

	
	
	public BoardVO(String email, String board_contents,Date inp_board_dt, Date mdf_board_dt, String board_category) {
		this.email = email;
		this.board_contents = board_contents;
		this.inp_board_dt =inp_board_dt;
		this.mdf_board_dt = mdf_board_dt;
		this.board_category = board_category;
	}



	public String getBoard_id() {
		return board_id;
	}
	public void setBoard_id(String board_id) {
		this.board_id = board_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getBoard_contents() {
		return board_contents;
	}
	public void setBoard_contents(String board_contents) {
		this.board_contents = board_contents;
	}
	public Date getInp_board_dt() {
		return inp_board_dt;
	}
	public void setInp_board_dt(Date inp_board_dt) {
		this.inp_board_dt = inp_board_dt;
	}
	public String getInp_board_email() {
		return inp_board_email;
	}
	public void setInp_board_email(String inp_board_email) {
		this.inp_board_email = inp_board_email;
	}
	public Date getMdf_board_dt() {
		return mdf_board_dt;
	}
	public void setMdf_board_dt(Date mdf_board_dt) {
		this.mdf_board_dt = mdf_board_dt;
	}
	public String getMdf_board_email() {
		return mdf_board_email;
	}
	public void setMdf_board_email(String mdf_board_email) {
		this.mdf_board_email = mdf_board_email;
	}
	public String getBoard_category() {
		return board_category;
	}
	public void setBoard_category(String board_category) {
		this.board_category = board_category;
	}
	
	@Override
	public String toString() {
		return "BoardVO [board_id=" + board_id + ", email=" + email + ", img=" + img + ", board_contents="
				+ board_contents + ", inp_board_dt=" + inp_board_dt + ", inp_board_email=" + inp_board_email
				+ ", mdf_board_dt=" + mdf_board_dt + ", mdf_board_email=" + mdf_board_email + ", board_category="
				+ board_category + "]";
	}
}

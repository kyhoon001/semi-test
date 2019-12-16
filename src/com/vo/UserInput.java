package com.vo;

public class UserInput {
	String search;
	int highlim;
	int lowlim;
	
	public UserInput() {
		
	}

	
	public UserInput(int highlim, int lowlim) {
		super();
		this.highlim = highlim;
		this.lowlim = lowlim;
	}


	public UserInput(String search) {
		super();
		this.search = search;
	
	}


	public String getSearch() {
		return search;
	}


	public void setSearch(String search) {
		this.search = search;
	}


	public int getHighlim() {
		return highlim;
	}


	public void setHighlim(int highlim) {
		this.highlim = highlim;
	}


	public int getLowlim() {
		return lowlim;
	}


	public void setLowlim(int lowlim) {
		this.lowlim = lowlim;
	}


	@Override
	public String toString() {
		return "UserInput [search=" + search + ", highlim=" + highlim + ", lowlim=" + lowlim + "]";
	}
	
	
	
}

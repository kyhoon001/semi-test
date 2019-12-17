package com.vo;

public class UserInput {
	String search;
	int highlim;
	int lowlim;
	int start_index;
	int end_index;
	
	public UserInput() {
		
	}

	
	public UserInput(int highlim, int lowlim,int start_index,int end_index) {
		super();
		this.highlim = highlim;
		this.lowlim = lowlim;
		this.start_index = start_index;
		this.end_index = end_index;
	}


	public UserInput(String search,int start_index,int end_index) {
		super();
		this.search = search;
		this.start_index = start_index;
		this.end_index = end_index;
	
	}
	
	public UserInput(int start_index,int end_index) {
		super();
		this.start_index = start_index;
		this.end_index = end_index;
	
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


	public int getStart_index() {
		return start_index+1;
	}


	public void setStart_index(int start_index) {
		this.start_index = start_index;
	}


	public int getEnd_index() {
		return end_index;
	}


	public void setEnd_index(int end_index) {
		this.end_index = end_index;
	}


	@Override
	public String toString() {
		return "UserInput [search=" + search + ", highlim=" + highlim + ", lowlim=" + lowlim + ", start_index="
				+ start_index + ", end_index=" + end_index + "]";
	}

	

	
	
}

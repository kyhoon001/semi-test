package com.vo;

public class SelectSql {
	private String column;
	private String table;
	private String where;
	private String group_by;
	private String order_by;

	public SelectSql(String column, String table, String where, String group_by, String order_by) {
		super();
		this.column = column;
		this.table = table;
		this.where = where;
		this.group_by = group_by;
		this.order_by = order_by;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public String getGroup_by() {
		return group_by;
	}

	public void setGroup_by(String group_by) {
		this.group_by = group_by;
	}

	public String getOrder_by() {
		return order_by;
	}

	public void setOrder_by(String order_by) {
		this.order_by = order_by;
	}

	@Override
	public String toString() {
		return "SelectSql [column=" + column + ", table=" + table + ", where=" + where + ", group_by=" + group_by
				+ ", order_by=" + order_by + "]";
	}
	
	
	
	

}

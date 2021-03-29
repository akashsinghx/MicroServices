package com.ltts.ShopInfo.Model;

public class Basket {
	
	private int bid;
	
	private String bname;
	
	private String bdate;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public Basket(int bid, String bname, String bdate) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bdate = bdate;
	}

	public Basket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Basket [bid=" + bid + ", bname=" + bname + ", bdate=" + bdate + "]";
	}
	
	

}

package com.ltts.ShopInfo.Model;

public class ShopInfo {
	
	private String iname;
	
	private double iprice;
	
	private int istock;
	
	private int bid;
	
	private String bname;
	
	private String bdate;

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public double getIprice() {
		return iprice;
	}

	public void setIprice(double iprice) {
		this.iprice = iprice;
	}

	public int getIstock() {
		return istock;
	}

	public void setIstock(int istock) {
		this.istock = istock;
	}

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

	public ShopInfo(String iname, double iprice, int istock, int bid, String bname, String bdate) {
		super();
		this.iname = iname;
		this.iprice = iprice;
		this.istock = istock;
		this.bid = bid;
		this.bname = bname;
		this.bdate = bdate;
	}

	public ShopInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ShopInfo [iname=" + iname + ", iprice=" + iprice + ", istock=" + istock + ", bid=" + bid + ", bname="
				+ bname + ", bdate=" + bdate + "]";
	}
	
	

}

package com.ltts.ShopInfo.Model;

public class Items {
	

	private String name;

	private Double price;

	private int stock;
	  
	private int bid;

	public Items()
	{
		super();
	}
	    
	@Override
	public String toString() 
	{
		return "Items [name=" + name + ", price=" + price + ", stock=" + stock + ", bid=" + bid + "]";
	}

	public Items(String name, Double price, int stock, int bid) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

}


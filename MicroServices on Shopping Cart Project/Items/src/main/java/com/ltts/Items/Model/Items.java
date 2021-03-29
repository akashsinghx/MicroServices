package com.ltts.Items.Model;

public class Items {

    private String name;

    private Double price;

    private int stock;
    
    private String out;

    public Items(){

    }

    public Items(String name, Double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // And also we need to add stock manally.
    public void add_stock(int add){
        this.stock+=add;
    }

    public String reduce_stock(int add){
        this.stock-=add;
        
        out = "Out of Stock. Please check the number of stocks";
        if (this.stock < 0)
        {
        	System.out.println(out);
        }
		return name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
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
}

package com.ltts.Basket.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.Basket.Model.Basket;

@Repository
public class BasketDao 
{
	public List<Basket> getAllItems()
	{
		List<Basket> li = new ArrayList<Basket>();
				
		li.add(new Basket (1,"Basket 1","20/1/2021"));
				
		li.add(new Basket (2,"Basket 2", "20/2/2021"));
		
		li.add(new Basket (3,"Basket 3","20/3/2021"));
			
		return li;
	}
}



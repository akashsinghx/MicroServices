package com.ltts.Items.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.Items.Model.Items;

	@Repository
	public class ItemsDao {
		
		public List<Items> getAllItems()
		{
			List<Items> li = new ArrayList<Items>();
			
			li.add(new Items ("Shampoo",100.0,120));
			
			li.add(new Items ("Soap",30.0,100));
			
			li.add(new Items ("Bucket",10.0,200));
			
			return li;
		}
}



package com.ltts.Items.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Items.Dao.ItemsDao;
import com.ltts.Items.Model.Items;

@RestController
public class ItemsController {

	@Autowired
	ItemsDao itd;
		
		@RequestMapping("/items")
		public List<Items> getAllItems()
		{
			return itd.getAllItems();
		}
		
}



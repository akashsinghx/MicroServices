package com.ltts.Basket.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Basket.Dao.BasketDao;
import com.ltts.Basket.Model.Basket;

@RestController
public class BasketController {

	@Autowired
	BasketDao bd;
			
	@RequestMapping("/basket")
	public List<Basket> getAllItems()
	{
		return bd.getAllItems();
	}
			
}


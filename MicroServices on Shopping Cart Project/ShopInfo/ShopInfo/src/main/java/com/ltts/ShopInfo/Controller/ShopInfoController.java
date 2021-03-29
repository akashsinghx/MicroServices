package com.ltts.ShopInfo.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.ShopInfo.Model.Items;

import com.ltts.ShopInfo.Model.Basket;

import com.ltts.ShopInfo.Model.ShopInfo;

@RestController
public class ShopInfoController {

	
	  private static final RequestMethod[] GET = null;
	  
	  @Autowired RestTemplate rt;
	 

		@RequestMapping("/shopdetailitems")
		public List<Items> getExternalTeam() {
			/*
			 * //List<Team> li=new ArrayList<Team> List<Team>
			 * li=rt.getForObject("http://localhost:8080/teams", Team.class); return li;
			 * 
			 */

			/*
			 * ResponseEntity<List<Team>> responseEntity =
			 * rt.exchange("http://localhost:8080/teams", HttpMethod.GET, null, new
			 * ParameterizedTypeReference<List<Team>>() { }); List<Team> li =
			 * Arrays.asList(responseEntity.getBody()); return li;
			 */

			ResponseEntity<Items[]> response = rt.getForEntity("http://localhost:8900/items/", Items[].class);

			Items[] items = response.getBody();
			List<Items> it = Arrays.asList(items);

			// player
			// plist array

			// List<Player> plt=Arrays.asList(players);

			// List<Combined> comlist
			// combine
			// return the combined list
			return it;
		}

		@RequestMapping("/shopdetailbasket")
		public List<Basket> getExternalPlayer() {

			ResponseEntity<Basket[]> responseplayer = rt.getForEntity("http://localhost:8901/basket/", Basket[].class);
			Basket[] basket = responseplayer.getBody();
			List<Basket> sb = Arrays.asList(basket);

			// player
			// plist array

			// List<Player> plt=Arrays.asList(players);

			// List<Combined> comlist
			// combine
			// return the combined list
			return sb;
		}

		@RequestMapping(value = "/shopdetailall", method = RequestMethod.GET)
		public List<ShopInfo> getEqualId() throws ServletException, IOException

		{

			// Scanner s = new Scanner(System.in);
			// System.out.println("TEAM ID:");

			/*
			 * int id = s.nextInt();
			 * 
			 * int id1 = Integer.parseInt(req.getParameter("id"));
			 */
			ResponseEntity<Items[]> responseitems = rt.getForEntity("http://localhost:8900/items/", Items[].class);

			ResponseEntity<Basket[]> responsebasket = rt.getForEntity("http://localhost:8901/basket/", Basket[].class);

			/*
			 * ResponseEntity<PlayerTeam[]> responsedetail = rt.getForEntity(
			 * "http://localhost:8086/detailwithid/", PlayerTeam[].class);
			 * 
			 * 
			 */
			Items[] items = responseitems.getBody();

			Basket[] basket = responsebasket.getBody();

			/*
			 * PlayerTeam[] playerteam = responsedetail.getBody();
			 * System.out.println(players);
			 */

			List<Items> sit = Arrays.asList(items);

			List<Basket> sb = Arrays.asList(basket);
			
			System.out.println(sit);
			System.out.println(sb);

			/* List<PlayerTeam> pt= Arrays.asList(playerteam); */

			List<ShopInfo> pt1 = new ArrayList<ShopInfo>();
			for (Items it : sit) {
				String bname = null;
				String bdate = null;
				for (Basket b : sb) {
					if (it.getBid() == b.getBid()) {
						bname = b.getBname();
						bdate = b.getBdate();
					}
				}
				
				pt1.add(new ShopInfo(it.getName(), it.getPrice(),it.getStock(),it.getBid(),bname, bdate));

				System.out.println(pt1);
			}
			/*
			 * for(Team i : teams) { if (i.getTeamNo()==id1) { pt.get(id1);
			 * 
			 * return pt; }
			 * 
			 * }
			 */

			return pt1;

		}

}


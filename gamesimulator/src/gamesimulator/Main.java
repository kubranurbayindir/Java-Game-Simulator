package gamesimulator;

import Entities.Campaign;
import Entities.Customer;
import Entities.GameSale;
import Entities.Gamer;
import Adapter.MernisAdapter;
import Concreate.CampaignManager;
import Concreate.CustomerManager;
import Concreate.GameSaleManager;
import Concreate.GamerManager;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1 , "Kübra Nur", "Bayýndýr", "123456789", 1998);
		CustomerManager customerManager = new CustomerManager(new MernisAdapter());
		customerManager.addMultiple(new Customer[] {customer});
		customerManager.delete(customer);
		customerManager.update(customer);
		customerManager.save(customer);
		
		
		Campaign campaignMom = new Campaign(1 , "Anneler Günü", "Mayýsýn ilk iki haftasý geçerli olacaktýr.", 01-05-2020, 15-05-2021, 10);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addMultiple(new Campaign[] {campaignMom});

		Gamer gamerOne = new Gamer(1, "Kübra Nur", "Bayýndýr", "nubble", 526.586, "123456789", 1998);
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamerOne);
		
		GameSale gameOne = new GameSale(1, "MAFIA", "Mafia Game", 25.50);
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.gameSale(gamerOne, gameOne);
		
		campaignManager. campaignGame(campaignMom, customer, gameOne);
		
		

	}

}

package Concreate;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Customer;
import Entities.GameSale;

public class CampaignManager implements ICampaignService {
	
	public void add(Campaign campaign) {
		System.out.println( campaign.getCampaignName() + " kapmanyasý veritabanýna eklendi. " );
	}
	
	public void delete(Campaign campaign) {
		System.out.println( campaign.getCampaignName() + " kapmanyasý veritabanýna eklendi. " );
	}
	
	public void update(Campaign campaign) {
		System.out.println( campaign.getCampaignName() + " kapmanyasý veritabanýna eklendi. " );
	}
	
	
	
	public void addMultiple(Campaign[] campaigns) {
		for (Campaign campaign : campaigns) {
			this.add(campaign);
		}
	}

	@Override
	public void campaignGame(Campaign campaign, Customer customer, GameSale gameSale) {
		
		System.out.println(campaign.getCampaignName() + " kampanyasýyla "+ customer.getFirstName() + 
				" adlý müþteri " + gameSale.getUnitPrice() + " fiyatlý " + gameSale.getGameName() +" oyunu yüzde " 
				+ campaign.getDiscountRate() +" indirimle almýþtýr.");
		
	}

}

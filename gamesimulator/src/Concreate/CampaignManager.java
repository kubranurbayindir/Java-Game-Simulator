package Concreate;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Customer;
import Entities.GameSale;

public class CampaignManager implements ICampaignService {
	
	public void add(Campaign campaign) {
		System.out.println( campaign.getCampaignName() + " kapmanyas� veritaban�na eklendi. " );
	}
	
	public void delete(Campaign campaign) {
		System.out.println( campaign.getCampaignName() + " kapmanyas� veritaban�na eklendi. " );
	}
	
	public void update(Campaign campaign) {
		System.out.println( campaign.getCampaignName() + " kapmanyas� veritaban�na eklendi. " );
	}
	
	
	
	public void addMultiple(Campaign[] campaigns) {
		for (Campaign campaign : campaigns) {
			this.add(campaign);
		}
	}

	@Override
	public void campaignGame(Campaign campaign, Customer customer, GameSale gameSale) {
		
		System.out.println(campaign.getCampaignName() + " kampanyas�yla "+ customer.getFirstName() + 
				" adl� m��teri " + gameSale.getUnitPrice() + " fiyatl� " + gameSale.getGameName() +" oyunu y�zde " 
				+ campaign.getDiscountRate() +" indirimle alm��t�r.");
		
	}

}

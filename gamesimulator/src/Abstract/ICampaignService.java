package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.GameSale;

public interface ICampaignService {
	void campaignGame (Campaign campaign, Customer customer, GameSale gameSale);
	

}

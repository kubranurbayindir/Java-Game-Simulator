package Entities;

public class Campaign {
	private int campaignId;
	private String campaignName;
	private String campaignDes;
	private int campaignStartDate;
	private int campaignEndDate;
	private double discountRate;
	
	public Campaign() {
		
	}
	
	public Campaign(int campaignId, String campaignName, String campaignDes, int campaignStartDate, int campaignEndDate,
			double discountRate) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDes = campaignDes;
		this.campaignStartDate = campaignStartDate;
		this.campaignEndDate = campaignEndDate;
		this.discountRate = discountRate;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignDes() {
		return campaignDes;
	}
	public void setCampaignDes(String campaignDes) {
		this.campaignDes = campaignDes;
	}
	public int getCampaignStartDate() {
		return campaignStartDate;
	}
	public void setCampaignStartDate(int campaignStartDate) {
		this.campaignStartDate = campaignStartDate;
	}
	public int getCampaignEndDate() {
		return campaignEndDate;
	}
	public void setCampaignEndDate(int campaignEndDate) {
		this.campaignEndDate = campaignEndDate;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	

}

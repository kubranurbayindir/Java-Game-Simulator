package Entities;

public class GameSale {
	private int saleId;
	private String gameName;
	private String gameDes;
	private double unitPrice;
	
	public GameSale() {
		
	}
	
	public GameSale(int saleId, String gameName, String gameDes, double unitPrice) {
		super();
		this.saleId = saleId;
		this.gameName = gameName;
		this.gameDes = gameDes;
		this.unitPrice = unitPrice;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameDes() {
		return gameDes;
	}
	public void setGameDes(String gameDes) {
		this.gameDes = gameDes;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	

}

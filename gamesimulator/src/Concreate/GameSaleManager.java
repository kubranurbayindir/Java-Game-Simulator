package Concreate;

import Abstract.IGameSaleService;
import Entities.GameSale;
import Entities.Gamer;

public class GameSaleManager implements IGameSaleService{

	@Override
	public void gameSale(Gamer gamer, GameSale gameSale) {
		System.out.println(gamer.getFirstName() + " isimli müþteri " + gameSale.getGameName() + 
				" adlý oyunu " +  gameSale.getUnitPrice() +  " fiyata satýn almýþtýr.");
		
	}



}

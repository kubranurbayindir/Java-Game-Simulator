package Concreate;

import Abstract.BaseManager;
import Entities.Gamer;

public class GamerManager extends BaseManager {
	
	public void add(Gamer gamer) {
		System.out.println("Kullanýcý " + gamer.getNickName() + " nick ile veritabanýna eklendi. " );
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Nick: " + gamer.getNickName() + " adlý kullanýcý veritabanýndan silindi. " );
	
	}


}

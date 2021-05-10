package Concreate;

import Abstract.BaseManager;
import Entities.Gamer;

public class GamerManager extends BaseManager {
	
	public void add(Gamer gamer) {
		System.out.println("Kullan�c� " + gamer.getNickName() + " nick ile veritaban�na eklendi. " );
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Nick: " + gamer.getNickName() + " adl� kullan�c� veritaban�ndan silindi. " );
	
	}


}

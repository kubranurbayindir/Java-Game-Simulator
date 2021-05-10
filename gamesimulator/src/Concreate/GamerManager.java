package Concreate;

import Abstract.BaseManager;
import Entities.Gamer;

public class GamerManager extends BaseManager {
	
	public void add(Gamer gamer) {
		System.out.println("Kullanıcı " + gamer.getNickName() + " nick ile veritabanına eklendi. " );
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Nick: " + gamer.getNickName() + " adlı kullanıcı veritabanından silindi. " );
	
	}


}

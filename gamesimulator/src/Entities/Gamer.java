package Entities;

public class Gamer extends Customer {
	
	private String nickName;
	private double totalScore;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, String nickName, double totalScore, String nationalityId,
			int birthDate) {
		super(id, firstName, lastName, nationalityId, birthDate);
		this.nickName = nickName;
		this.totalScore = totalScore;

	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public double getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	
}

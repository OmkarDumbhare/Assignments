package core_assignment;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Player {

	private String Name;
	private int Age;
	
	private Team team;

	
	@SuppressWarnings("deprecation")
	@Required
	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) {
		Age = age;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Team getTeam() {
		return team;
	}
	
	@Resource(name = "team2")
	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	public void getPlayersDetails() {
		System.out.println("Name : "+ getName());
		System.out.println("Age : " + getAge() );
	}
	
	public void getPlayersDetailsUsingResource() {
		System.out.println("Name : "+ getName());
		System.out.println("Age : "+ getAge());
		System.out.println("TeamName : "+ team.getTeamName());
		System.out.println("totalPlayers : "+team.getTotalPlayers());
	}
	
}

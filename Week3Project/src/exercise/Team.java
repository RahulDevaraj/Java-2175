package exercise;



public class Team {
	String schoolName;
	String sport;
	String teamName;
	
	public String getSchoolName() {
		return schoolName;
	}
	public String getSport() {
		return sport;
	}
	public String getTeamName() {
		return teamName;
	}
	public Team(String schoolName, String sport, String teamName) {
		
		this.schoolName = schoolName;
		this.sport = sport;
		this.teamName = teamName;
	}
	
	public Team() {
		
	}
	
	public final static String MOTTO(){
		return "Sportsmanship!";
	}
	
	public String toString() {
		return "schoolName=" + schoolName + ", sport=" + sport + ", teamName=" + teamName +", Motto :"+MOTTO();
	}
	

}

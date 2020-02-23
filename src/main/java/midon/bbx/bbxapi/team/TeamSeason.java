package midon.bbx.bbxapi.team;

public class TeamSeason {

	public TeamSeason() {}

	private String teamId;
    private String league;
    private String city;
    private String name;
    private int minSeason;
    private int maxSeason;
	
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinSeason() {
		return minSeason;
	}

	public void setMinSeason(int minSeason) {
		this.minSeason = minSeason;
	}

	public int getMaxSeason() {
		return maxSeason;
	}

	public void setMaxSeason(int maxSeason) {
		this.maxSeason = maxSeason;
	}
}

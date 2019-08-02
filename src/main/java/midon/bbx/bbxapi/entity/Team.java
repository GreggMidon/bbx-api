package midon.bbx.bbxapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name="TEAM")
@IdClass(TeamCompositeKey.class)
public class Team {

	public Team() {}
	
	@Id
	@Column(name="TEAM_ID", length=3, nullable=false, unique=false)
	private String teamId;
	
	@Id
	@Column(name="SEASON")
	private int season;
	
	@Column(name="AL_NL", length=1, nullable=false, unique=false)
    private String league;
    
	@Column(name="TEAM_CTY", length=64, nullable=false, unique=false)
    private String city;
    
	@Column(name="TEAM_NM", length=64, nullable=false, unique=false)
    private String name;

	
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
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

}

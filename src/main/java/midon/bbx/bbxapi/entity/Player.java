package midon.bbx.bbxapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name="ROSTER")
@IdClass(PlayerCompositeKey.class)
public class Player {

	public Player() {}
	
	@Id
	@Column(name="PLAYER_ID", length=16, nullable=false, unique=false)
	private String playerId;

	@Id
	@Column(name="TEAM_ID", length=8, nullable=false, unique=false)
	private String teamId;
	
	@Id
	@Column(name="SEASON")
	private int season;
	
	@Column(name="FIRST_NM", length=64, nullable=false, unique=false)
	private String firstName;
	
	@Column(name="LAST_NM", length=64, nullable=false, unique=false)
	private String lastName;
	
	@Column(name="BAT_HND", length=1, nullable=false, unique=false)
	private String battingHand;
	
	@Column(name="THROW_HND", length=1, nullable=false, unique=false)
	private String throwingHand;
	
	@Column(name="FLD_POS", length=8, nullable=false, unique=false)
	private String position;

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBattingHand() {
		return battingHand;
	}

	public void setBattingHand(String battingHand) {
		this.battingHand = battingHand;
	}

	public String getThrowingHand() {
		return throwingHand;
	}

	public void setThrowingHand(String throwingHand) {
		this.throwingHand = throwingHand;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}

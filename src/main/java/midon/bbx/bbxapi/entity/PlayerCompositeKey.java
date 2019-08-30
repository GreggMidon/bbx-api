package midon.bbx.bbxapi.entity;

import java.io.Serializable;
import java.util.Objects;

public class PlayerCompositeKey implements Serializable {

	private static final long serialVersionUID = 2611518443216989123L;
	
	private String playerId;
	private String teamId;
	private int season;
	
	public PlayerCompositeKey() {}
	
	public PlayerCompositeKey(String playerId, String teamId, int season) {
		this.playerId = playerId;
		this.teamId = teamId;
		this.season = season;
	}
	
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

	@Override
	public int hashCode() {
		return Objects.hash(teamId, season);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;

		if(!(obj instanceof TeamCompositeKey)) {
	        return false;
	    }
		
		PlayerCompositeKey other = (PlayerCompositeKey) obj;
		if(!playerId.equals(other.playerId))
			return false;
		
		if(!teamId.equals(other.teamId))
			return false;
		
		if(season != other.season)
			return false;
		
		return true;
	}
}

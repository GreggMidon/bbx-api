package midon.bbx.bbxapi.player;

import java.io.Serializable;
import java.util.Objects;

public class PlayerStatCompositeKey implements Serializable {

	private static final long serialVersionUID = 4039980315029292251L;

	private String playerId;
	private int season;
	
	public PlayerStatCompositeKey() {}
	
	public PlayerStatCompositeKey(String playerId, int season) {
		this.playerId = playerId;
		this.season = season;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(playerId, season);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;

		if(!(obj instanceof PlayerStatCompositeKey)) {
	        return false;
	    }
		
		PlayerStatCompositeKey other = (PlayerStatCompositeKey) obj;
		if(!playerId.equals(other.playerId))
			return false;
		
		if(season != other.season)
			return false;
		
		return true;
	}
	
}

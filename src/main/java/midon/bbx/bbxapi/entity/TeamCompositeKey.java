package midon.bbx.bbxapi.entity;

import java.io.Serializable;
import java.util.Objects;


public class TeamCompositeKey implements Serializable {

	private static final long serialVersionUID = 1L;
	private String teamId;
	private int season;

	public TeamCompositeKey() {}
	
	public TeamCompositeKey(String teamId, int season) {
		this.teamId = teamId;
		this.season = season;
	}

	public String getTeamId() {
		return teamId;
	}

	public int getSeason() {
		return season;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(teamId, season);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!(obj instanceof TeamCompositeKey)) {
	        return false;
	    }
		
		TeamCompositeKey other = (TeamCompositeKey) obj;
		if (!teamId.equals(other.teamId))
			return false;
		
		if (season != other.season)
			return false;
		
		return true;
	}

}

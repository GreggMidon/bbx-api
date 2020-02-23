package midon.bbx.bbxapi.player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="CT_PLAYER_STATS")
@IdClass(PlayerStatCompositeKey.class)
public class PlayerSeasonStats {

	public PlayerSeasonStats() {}
	
	@Id
	@Column(name="PLAYER_ID", length=16, nullable=false, unique=false)
	private String playerId;

	@Id
	@Column(name="SEASON")
	private int season;
	
	@Column(name="AB")
	private int atbats;
	
	@Column(name="SO")
	private int strikeOuts;
	
	@Column(name="SB")
	private int stolenBases;
	
	@Column(name="BB")
	private int walks;
	
	@Column(name="SGL")
	private int singles;
	
	@Column(name="DBL")
	private int doubles;
	
	@Column(name="TPL")
	private int triples;
	
	@Column(name="HR")
	private int homeRuns;

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

	public int getAtbats() {
		return atbats;
	}

	public void setAtbats(int atbats) {
		this.atbats = atbats;
	}

	public int getStrikeOuts() {
		return strikeOuts;
	}

	public void setStrikeOuts(int strikeOuts) {
		this.strikeOuts = strikeOuts;
	}

	public int getStolenBases() {
		return stolenBases;
	}

	public void setStolenBases(int stolenBases) {
		this.stolenBases = stolenBases;
	}

	public int getWalks() {
		return walks;
	}

	public void setWalks(int walks) {
		this.walks = walks;
	}

	public int getSingles() {
		return singles;
	}

	public void setSingles(int singles) {
		this.singles = singles;
	}

	public int getDoubles() {
		return doubles;
	}

	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}

	public int getTriples() {
		return triples;
	}

	public void setTriples(int triples) {
		this.triples = triples;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}
}

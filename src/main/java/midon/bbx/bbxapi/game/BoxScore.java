package midon.bbx.bbxapi.game;

import java.sql.Date;

public class BoxScore {
	private int season;
	private Date gameDate;
	private String homeTeam;
	private String visitTeam;
	private String homeLineScore;
	private String visitLineScore;
	private short homeScore;
	private short visitScore;
	private short homeHits;
	private short visitHits;
	private short homeErrors;
	private short visitErrors;
	
	public int getSeason() {
		return season;
	}
	
	public void setSeason(int season) {
		this.season = season;
	}
	
	public Date getGameDate() {
		return gameDate;
	}
	
	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}
	
	public String getHomeTeam() {
		return homeTeam;
	}
	
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	
	public String getVisitTeam() {
		return visitTeam;
	}
	
	public void setVisitTeam(String visitTeam) {
		this.visitTeam = visitTeam;
	}
	
	public String getHomeLineScore() {
		return homeLineScore;
	}
	
	public void setHomeLineScore(String homeLineScore) {
		this.homeLineScore = homeLineScore;
	}
	
	public String getVisitLineScore() {
		return visitLineScore;
	}
	
	public void setVisitLineScore(String visitLineScore) {
		this.visitLineScore = visitLineScore;
	}
	
	public short getHomeScore() {
		return homeScore;
	}
	
	public void setHomeScore(short homeScore) {
		this.homeScore = homeScore;
	}
	
	public short getVisitScore() {
		return visitScore;
	}
	
	public void setVisitScore(short visitScore) {
		this.visitScore = visitScore;
	}
	
	public short getHomeHits() {
		return homeHits;
	}
	
	public void setHomeHits(short homeHits) {
		this.homeHits = homeHits;
	}
	
	public short getVisitHits() {
		return visitHits;
	}
	
	public void setVisitHits(short visitHits) {
		this.visitHits = visitHits;
	}
	
	public short getHomeErrors() {
		return homeErrors;
	}
	
	public void setHomeErrors(short homeErrors) {
		this.homeErrors = homeErrors;
	}
	
	public short getVisitErrors() {
		return visitErrors;
	}
	
	public void setVisitErrors(short visitErrors) {
		this.visitErrors = visitErrors;
	}
}

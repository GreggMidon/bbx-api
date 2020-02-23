package midon.bbx.bbxapi.game;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CT_GAMES")
public class Game {

	@Id
	@Column(name="ID", nullable=false, unique=true)
	private Long Id;
	
	@Column(name="GAME_ID", length=16, nullable=false, unique=false)
	private String gameID;

	@Column(name="SEASON", nullable=false, unique=false)
	private int season;
	
	@Column(name="GAME_DT", nullable=false, unique=false)
	private Date gameDate;
	
	@Column(name="GAME_NUM", nullable=false, unique=false)
	private int gameNumber;

	@Column(name="HM_TEAM", length=3, nullable=false, unique=false)
	private String homeTeamId;
	
	@Column(name="HM_LEAG", length=2, nullable=false, unique=false)
	private String homeLeague;
	
	@Column(name="HM_SCORE", nullable=false, unique=false)
	private int homeScore;
	
	@Column(name="HM_LN_SCR", length=128, nullable=false, unique=false)
	private String homeLineScore;
	
	@Column(name="HM_HITS", nullable=false, unique=false)
	private int homeHits;
	
	@Column(name="HM_ERRS", nullable=false, unique=false)
	private int homeErrors;
	
	@Column(name="VIS_TEAM", length=3, nullable=false, unique=false)
	private String visitTeamId;

	@Column(name="VIS_LEAG", length=2, nullable=false, unique=false)
	private String visitLeague;
	
	@Column(name="VIS_SCORE", nullable=false, unique=false)
	private int visitScore;
	
	@Column(name="VIS_LN_SCR", length=128, nullable=false, unique=false)
	private String visitLineScore;
	
	@Column(name="VIS_HITS", nullable=false, unique=false)
	private int visitHits;
	
	@Column(name="VIS_ERRS", nullable=false, unique=false)
	private int visitErrors;

	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getGameID() {
		return gameID;
	}

	public void setGameID(String gameID) {
		this.gameID = gameID;
	}

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

	public int getGameNumber() {
		return gameNumber;
	}

	public void setGameNumber(int gameNumber) {
		this.gameNumber = gameNumber;
	}

	public String getHomeTeamId() {
		return homeTeamId;
	}

	public void setHomeTeamId(String homeTeamId) {
		this.homeTeamId = homeTeamId;
	}

	public String getHomeLeague() {
		return homeLeague;
	}

	public void setHomeLeague(String homeLeague) {
		this.homeLeague = homeLeague;
	}

	public int getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}

	public String getHomeLineScore() {
		return homeLineScore;
	}

	public void setHomeLineScore(String homeLineScore) {
		this.homeLineScore = homeLineScore;
	}

	public int getHomeHits() {
		return homeHits;
	}

	public void setHomeHits(int homeHits) {
		this.homeHits = homeHits;
	}

	public int getHomeErrors() {
		return homeErrors;
	}

	public void setHomeErrors(int homeErrors) {
		this.homeErrors = homeErrors;
	}

	public String getVisitTeamId() {
		return visitTeamId;
	}

	public void setVisitTeamId(String visitTeamId) {
		this.visitTeamId = visitTeamId;
	}

	public String getVisitLeague() {
		return visitLeague;
	}

	public void setVisitLeague(String visitLeague) {
		this.visitLeague = visitLeague;
	}

	public int getVisitScore() {
		return visitScore;
	}

	public void setVisitScore(int visitScore) {
		this.visitScore = visitScore;
	}

	public String getVisitLineScore() {
		return visitLineScore;
	}

	public void setVisitLineScore(String visitLineScore) {
		this.visitLineScore = visitLineScore;
	}

	public int getVisitHits() {
		return visitHits;
	}

	public void setVisitHits(int visitHits) {
		this.visitHits = visitHits;
	}

	public int getVisitErrors() {
		return visitErrors;
	}

	public void setVisitErrors(int visitErrors) {
		this.visitErrors = visitErrors;
	}
}
	

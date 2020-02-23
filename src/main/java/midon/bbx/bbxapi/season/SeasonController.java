package midon.bbx.bbxapi.season;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import midon.bbx.bbxapi.game.BoxScore;
import midon.bbx.bbxapi.game.BoxScoreService;
import midon.bbx.bbxapi.game.Game;
import midon.bbx.bbxapi.game.GameService;
import midon.bbx.bbxapi.player.Player;
import midon.bbx.bbxapi.roster.RosterService;
import midon.bbx.bbxapi.team.Team;
import midon.bbx.bbxapi.team.TeamService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/seasons")
public class SeasonController {
	
	private static final Logger logger = LoggerFactory.getLogger(SeasonController.class);
	
	@Autowired
	SeasonService service;
	
	@Autowired
	TeamService teamService;
	
	@Autowired
	RosterService rosterService;
	
	@Autowired
	GameService gameService;
	
	@Autowired
	BoxScoreService boxScoreService;
	
	
	@GetMapping()
	public ResponseEntity<List<Integer>> getSeasons() {
		logger.debug("Request: /seasons");
		return ResponseEntity.ok(service.getSeasons());
	}
	
	@GetMapping("/{season}/teams")
	public ResponseEntity<List<Team>> getTeamsBySeason(@PathVariable("season") int season) {
		logger.debug("Request: /seasons/" + season + "/teams");
		return ResponseEntity.ok(teamService.getTeamsBySeason(season));
	}
	
	@GetMapping("/{season}/teams/{team}/roster")
	public ResponseEntity<List<Player>> getTeamRosterBySeason(@PathVariable("season") int season, @PathVariable("team") String teamId) {
		logger.debug("Request: /seasons/" + season + "/teams/" + teamId + "/roster");
		return ResponseEntity.ok(rosterService.getRoster(teamId, season));
	}
	
	@GetMapping("/{season}/teams/{team}/boxscores")
	public ResponseEntity<List<BoxScore>> getBoxScoresBySeason(@PathVariable("season") int season, @PathVariable("team") String teamId) {
		logger.debug("Request: /seasons/" + season + "/teams/" + teamId + "/boxscores");
		return ResponseEntity.ok(boxScoreService.getBoxScores(teamId, season));
	}
	
	@GetMapping("/{season}/teams/{team}/games")
	public ResponseEntity<List<Game>> getGamesBySeason(@PathVariable("season") int season, @PathVariable("team") String teamId) {
		logger.debug("Request: /seasons/" + season + "/teams/" + teamId + "/games");
		return ResponseEntity.ok(gameService.getGamesBySeasonAndTeam(season, teamId));
	}
	
}
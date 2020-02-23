package midon.bbx.bbxapi.team;

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

import midon.bbx.bbxapi.player.Player;
import midon.bbx.bbxapi.roster.RosterService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/teams")
public class TeamController {
	
	private static final Logger logger = LoggerFactory.getLogger(TeamController.class);
	
	@Autowired
	TeamService service;
	
	@Autowired
	RosterService rosterService;
	
	@Autowired
	TeamSeasonService teamSeasonService;

	@GetMapping("/{season}")
	public ResponseEntity<List<Team>> getTeamsBySeason(@PathVariable("season") int season) {
		logger.debug("Request: /teams/" + String.valueOf(season));
		return ResponseEntity.ok(service.getTeamsBySeason(season));
	}

	@GetMapping("/{season}/roster/{teamId}")
	public ResponseEntity<List<Player>> getRoster(@PathVariable("season") int season, @PathVariable("teamId") String teamId) {
		logger.debug("Request: /teams/" + String.valueOf(season) + "/roster/" + teamId);
		return ResponseEntity.ok(rosterService.getRoster(teamId, season));
	}
	
	@GetMapping("/teamseasons")
	public ResponseEntity<List<TeamSeason>> getTeamSeasons() {
		logger.debug("Request: /teamseasons");
		return ResponseEntity.ok(teamSeasonService.getTeamSeasons());
	}

}

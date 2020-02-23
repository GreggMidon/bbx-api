package midon.bbx.bbxapi.player;

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


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/players")
public class PlayerController {
	
	private static final Logger logger = LoggerFactory.getLogger(PlayerController.class);
	
	@Autowired
	private PlayerStatService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<List<PlayerSeasonStats>> getTeams(@PathVariable("id") String playerId) {
		logger.debug("Request: /players/" + playerId);
		return ResponseEntity.ok(service.getPlayerSeasonStats(playerId));
	}

}

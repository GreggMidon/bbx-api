package midon.bbx.bbxapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import midon.bbx.bbxapi.service.SeasonService;


@RestController
@RequestMapping("/teams")
public class TeamController {
	
	private static final Logger logger = LoggerFactory.getLogger(SeasonController.class);
	
	@Autowired
	SeasonService service;

	@GetMapping("/{season}")
	public ResponseEntity<List<Integer>> getTeams(@PathVariable("season") int season) {
		logger.debug("Request: /teams/" + String.valueOf(season));
		return ResponseEntity.ok(service.getSeasons());
	}

}

package midon.bbx.bbxapi.stats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StatsController {

	private static final Logger logger = LoggerFactory.getLogger(StatsController.class);
	
	@Autowired
	GeneralStatsService service;
	
	@GetMapping("/stats/seasons/{season}/avgrunspergame")
	public ResponseEntity<?> getAvgRunsPerGame(@PathVariable("season") int season) {
		logger.debug("Request: /stats/seasons/" + season + "/avgrunspergame");
		return ResponseEntity.ok(service.getAvgRunsTimeSeries(season));
	}
}

package midon.bbx.bbxapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import midon.bbx.bbxapi.service.SeasonService;


@RestController
public class SeasonController {
	
	private static final Logger logger = LoggerFactory.getLogger(SeasonController.class);
	
	@Autowired
	SeasonService service;

	@GetMapping("/seasons")
	public ResponseEntity<List<Integer>> getSeasons() {
		logger.debug("Request: /seasons");
		return ResponseEntity.ok(service.getSeasons());
	}
	
	
}
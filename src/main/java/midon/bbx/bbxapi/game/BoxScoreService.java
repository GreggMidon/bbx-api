package midon.bbx.bbxapi.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoxScoreService {

	private BoxScoreRepository repository;
	
	@Autowired
	public BoxScoreService(BoxScoreRepository repository) {
		this.repository = repository;
	}
	
	public List<BoxScore> getBoxScores(String teamId, int season) {
		return repository.getBoxScores(teamId, season);
	}
}

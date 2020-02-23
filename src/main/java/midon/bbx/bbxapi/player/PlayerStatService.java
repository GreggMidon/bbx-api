package midon.bbx.bbxapi.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerStatService {

	private PlayerStatRepository repository;
	
	@Autowired
	public PlayerStatService(PlayerStatRepository repository) {
		this.repository = repository;
	}

	public List<PlayerSeasonStats> getPlayerSeasonStats(String playerId) {
		return repository.findByPlayerId(playerId);
	}
	
}

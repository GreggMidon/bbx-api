package midon.bbx.bbxapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import midon.bbx.bbxapi.entity.PlayerSeasonStats;
import midon.bbx.bbxapi.repository.PlayerStatRepository;

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

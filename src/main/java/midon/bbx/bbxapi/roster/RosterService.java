package midon.bbx.bbxapi.roster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import midon.bbx.bbxapi.player.Player;

@Service
public class RosterService {
	
	private RosterRepository repository;
	
	@Autowired
	public RosterService(RosterRepository repository) {
		this.repository = repository;
	}
	
	public List<Player> getRoster(String teamId, int season) {
		return repository.findByTeamIdAndSeason(teamId, season);
	}

}

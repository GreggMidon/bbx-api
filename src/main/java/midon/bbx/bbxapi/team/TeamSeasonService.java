package midon.bbx.bbxapi.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamSeasonService {

	private TeamSeasonRepository repository;
	
	@Autowired
	public TeamSeasonService(TeamSeasonRepository repository) {
		this.repository = repository;
	}
	
	public List<TeamSeason> getTeamSeasons() {
		return repository.getTeamSeasons();
	}
}

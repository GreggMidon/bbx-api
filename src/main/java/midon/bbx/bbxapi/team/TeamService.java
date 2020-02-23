package midon.bbx.bbxapi.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

	private TeamRepository repository;
	
	@Autowired
	public TeamService(TeamRepository repository) {
		this.repository = repository;
	}
	
	public List<Team> getTeamsBySeason(int season) {
		return repository.findBySeason(season);
	}
	
}

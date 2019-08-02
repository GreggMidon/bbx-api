package midon.bbx.bbxapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import midon.bbx.bbxapi.entity.Team;
import midon.bbx.bbxapi.repository.TeamRepository;

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

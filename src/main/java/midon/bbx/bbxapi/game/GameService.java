package midon.bbx.bbxapi.game;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class GameService {

	private GameRepository repository;
	
	@Autowired
	public GameService(GameRepository repository) {
		this.repository = repository;
	}
	
	public List<Game> getGames() {
		return repository.findAll();
	}
	
	public Optional<Game> getGameByGameIndex(long index) {
		return repository.findById(index);
	}
	
	public List<Game> getGamesBySeason(int season) {
		return repository.findBySeason(season);
	}
	
	public List<Game> getGamesBySeasonAndTeam(int season, String teamId) {
		return repository.findBySeasonAndTeamId(season, teamId, teamId);
	}
	
	public List<Game> getGamesByDate(String strDate) {
		//int year = Integer.parseInt(strDate.substring(0, 3));
		//int month = Integer.parseInt(strDate.substring(4, 5));
		//int day = Integer.parseInt(strDate.substring(6, 7));
		
		try {
			java.util.Date d = new SimpleDateFormat("yyyyMMdd").parse(strDate);
			//return repository.findByGameDate(d);
		}
		catch(ParseException e) {
			return null;
		}
		return null;
	}
}

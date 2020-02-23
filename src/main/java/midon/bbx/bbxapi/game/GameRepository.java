package midon.bbx.bbxapi.game;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
	
	List<Game> findBySeason(int season);
	
	List<Game> findByGameDate(Date gameDate);
	
	@Query("select g from Game g where g.season = ?1 and (g.homeTeamId = ?2 or g.visitTeamId = ?3)")
	List<Game> findBySeasonAndTeamId(int season, String homeTeamId, String visitTeamId);

}

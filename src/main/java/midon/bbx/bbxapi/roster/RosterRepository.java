package midon.bbx.bbxapi.roster;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import midon.bbx.bbxapi.player.Player;
import midon.bbx.bbxapi.player.PlayerCompositeKey;

@Repository
public interface RosterRepository extends JpaRepository<Player, PlayerCompositeKey> {

	List<Player> findByTeamIdAndSeason(String teamId, int season);
	
}

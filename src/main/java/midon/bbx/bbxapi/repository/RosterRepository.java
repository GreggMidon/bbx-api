package midon.bbx.bbxapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import midon.bbx.bbxapi.entity.Player;
import midon.bbx.bbxapi.entity.PlayerCompositeKey;

@Repository
public interface RosterRepository extends JpaRepository<Player, PlayerCompositeKey> {

	List<Player> findByTeamIdAndSeason(String teamId, int season);
	
}

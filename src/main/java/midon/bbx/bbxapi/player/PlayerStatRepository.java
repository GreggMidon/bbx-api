package midon.bbx.bbxapi.player;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerStatRepository extends JpaRepository<PlayerSeasonStats, PlayerStatCompositeKey> {
	
	List<PlayerSeasonStats> findByPlayerId(String playerId);

}

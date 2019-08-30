package midon.bbx.bbxapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import midon.bbx.bbxapi.entity.PlayerSeasonStats;
import midon.bbx.bbxapi.entity.PlayerStatCompositeKey;

@Repository
public interface PlayerStatRepository extends JpaRepository<PlayerSeasonStats, PlayerStatCompositeKey> {
	
	List<PlayerSeasonStats> findByPlayerId(String playerId);

}

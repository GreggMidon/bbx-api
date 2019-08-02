package midon.bbx.bbxapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import midon.bbx.bbxapi.entity.Team;
import midon.bbx.bbxapi.entity.TeamCompositeKey;

@Repository
public interface TeamRepository extends JpaRepository<Team, TeamCompositeKey> {

	public List<Team> findBySeason(int season);
}

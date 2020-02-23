package midon.bbx.bbxapi.team;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, TeamCompositeKey> {

	public List<Team> findBySeason(int season);
}

package midon.bbx.bbxapi.season;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SeasonRepository {

	@Autowired
    private EntityManager entityManager;
    
    @SuppressWarnings("unchecked")
    public List<Integer> getSeasons() {
        String sql = "select distinct season from game_hdr order by season";
        Query query = entityManager.createNativeQuery(sql);
        return query.getResultList();
    }
}

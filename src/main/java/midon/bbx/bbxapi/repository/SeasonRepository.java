package midon.bbx.bbxapi.repository;

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
        String sql = "select distinct season from game_hdr";
        Query query = entityManager.createNativeQuery(sql);
        return query.getResultList();
    }
/*    
    @SuppressWarnings("unchecked")
    public List<Bar> getBar(String s, Long l) {
        String sql = "select * from bar where s = ? and l = ?";
        Query qry = entityManager.createNativeQuery(sql);
        qry.setParameter(1, s);
        qry.setParameter(2, l);
        List<Object[]> objectArrays = qry.getResultList();
        List<Bean> beans = new ArrayList<FooBean>();
        for (Object[] objArr : objectArrays) {
            beans.add(new Value(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]));
        }
        return beans;
    }
*/
}


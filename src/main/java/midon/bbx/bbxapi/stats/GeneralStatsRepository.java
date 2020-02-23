package midon.bbx.bbxapi.stats;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GeneralStatsRepository {

	@Autowired
    private EntityManager entityManager;
  
    @SuppressWarnings("unchecked")
	public List<TimeSeries<Long>> averageRunsByGameBySeason(int season) {
    	List<TimeSeries<Long>> results = new ArrayList<TimeSeries<Long>>();
    	String sql = "select s.game_dt,s.games,s.hm_runs,s.vis_runs,(s.hm_runs + s.vis_runs) total_runs,(s.hm_runs + s.vis_runs) / games runs_per_gm " +
    				 "from ( " +
    				 "select game_dt,count(*) games,sum(hm_score) hm_runs,sum(vis_score) vis_runs from v_game_log where season = ? " +
    				 "group by game_dt " +
    				 "order by game_dt " + 
    				 ") s";
    	Query query = entityManager.createNativeQuery(sql);
    	query.setParameter(1, season);
    	
    	List<Object[]> records = query.getResultList();
        for(Object[] record: records) {
        	Date date = (Date) record[0];
        	//Integer games = (Integer) record[1];
        	//Integer homeRuns = (Integer) record[2];
        	//Integer visRuns = (Integer) record[3];
        	//Integer totlRuns = (Integer) record[4];
        	Long avgRuns = (Long) record[5];
        	
        	TimeSeries<Long> ts1 = new TimeSeries<>(date.toLocalDate(), avgRuns);
        	results.add(ts1);
        }
        return results;
    }

}

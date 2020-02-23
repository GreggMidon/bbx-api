package midon.bbx.bbxapi.game;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoxScoreRepository {

	@Autowired
    private EntityManager entityManager;
	
    @SuppressWarnings("unchecked")
	public List<BoxScore> getBoxScores(String teamId, int season) {
    	String sql = "select " + 
    				 "season,game_dt," + 
    				 "vis_team,vis_ln_scr,vis_score,vis_hits,vis_errs," + 
    				 "hm_team,hm_ln_scr,hm_score,hm_hits,hm_errs " + 
    				 "from v_game_log " + 
    				 "where season = ? " +
    				 "and (vis_team = ? or hm_team = ?)";
    	List<BoxScore> boxScores = new ArrayList<>();
    	
    	Query query = entityManager.createNativeQuery(sql);
    	query.setParameter(1, season);
    	query.setParameter(2, teamId);
    	query.setParameter(3, teamId);
    	
    	List<Object[]> records = query.getResultList();
        for(Object[] record: records) {
        	BoxScore b = new BoxScore();
        	b.setSeason((Integer) record[0]); 
        	b.setGameDate((Date) record[1]);
        	b.setVisitTeam(record[2].toString());
        	b.setVisitLineScore(record[3].toString());
        	b.setVisitScore((Short) record[4]);
        	b.setVisitHits((Short) record[5]);
        	b.setVisitErrors((Short) record[6]);
        	b.setHomeTeam(record[7].toString());
        	b.setHomeLineScore(record[3].toString());
        	b.setHomeScore((Short) record[4]);
        	b.setHomeHits((Short) record[5]);
        	b.setHomeErrors((Short) record[6]);
        	boxScores.add(b);
        }
        return boxScores;
    }
}

package midon.bbx.bbxapi.team;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamSeasonRepository {
	
	@Autowired
    private EntityManager entityManager;
	
    @SuppressWarnings("unchecked")
	public List<TeamSeason> getTeamSeasons() {
    	String sql = "select team_id,al_nl,team_cty,team_nm,min(season) min_seas,max(season) max_seas " + 
    				  "from team " +
    				  "group by team_id,al_nl,team_cty,team_nm " + 
    				  "order by team_id";
    	List<TeamSeason> teamSeasons = new ArrayList<>();
    	
    	Query query = entityManager.createNativeQuery(sql);
        List<Object[]> records = query.getResultList();
        for(Object[] record: records) {
        	TeamSeason t = new TeamSeason();
        	t.setTeamId(record[0].toString()); 
        	t.setLeague(record[1].toString());
        	t.setCity(record[2].toString());
        	t.setName(record[3].toString());
        	t.setMinSeason((Integer) record[4]);
        	t.setMaxSeason((Integer) record[5]);
        	teamSeasons.add(t);
        }
        return teamSeasons;
    }
}

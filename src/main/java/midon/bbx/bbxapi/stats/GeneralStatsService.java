package midon.bbx.bbxapi.stats;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralStatsService {

	private GeneralStatsRepository repository;
	
	@Autowired
	public GeneralStatsService(GeneralStatsRepository repository) {
		this.repository = repository;
	}
	
	public List<TimeSeries<Long>> getAvgRunsTimeSeries(int season) {
		return repository.averageRunsByGameBySeason(season);
	}
}

package midon.bbx.bbxapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import midon.bbx.bbxapi.repository.SeasonRepository;

@Service
public class SeasonService {

	private SeasonRepository repository;
	
	@Autowired
	public SeasonService(SeasonRepository repository) {
		this.repository = repository;
	}
	
	public List<Integer> getSeasons() {
		return repository.getSeasons();
		
	}
	
	
	
}

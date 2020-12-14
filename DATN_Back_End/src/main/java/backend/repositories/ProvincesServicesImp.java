package backend.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Provinces;

@Service
public class ProvincesServicesImp implements ProvincesService{
	
	@Autowired
	ProvincesRepository pre;

	@Override
	public Iterable<Provinces> findAll() {
		return pre.findAll();
	}
	
	@Override
	public String getIdByName(String province) {
		return pre.getIdByName(province);
	}

}

package backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Contracts;

@Service
public class ContractServiceslmp implements ContactServices {
  
	@Autowired
	ContractRepository contactrepository;
	
	@Autowired
	AdminsRepository adminrepository;
	
	
	@Override
	public Contracts save(Contracts entity) {
		return contactrepository.save(entity);
	}

	@Override
	public List<Contracts> saveAll(List<Contracts> entities) {
		return (List<Contracts>)contactrepository.saveAll(entities);
	}

	@Override
	public Optional<Contracts> findById(String id) {
		return contactrepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return contactrepository.existsById(id);
	}

	@Override
	public List<Contracts> findAll() {
		return (List<Contracts>)contactrepository.findAll();
	}

	@Override
	public List<Contracts> findAllById(Iterable<String> ids) {
		return (List<Contracts>)contactrepository.findAllById(ids);
	}

	@Override
	public void deleteById(String id) {
		contactrepository.deleteById(id);
	}

	@Override
	public void delete(Contracts entity) {
		contactrepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Contracts> entities) {
		contactrepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		contactrepository.deleteAll();
	}
	
	
}

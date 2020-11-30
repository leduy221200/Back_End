package backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Contracts;

@Service
public class ContractServiceslmp implements ContractServices {
  
	@Autowired
	ContractRepository ct;
	
	@Override
	public Contracts save(Contracts entity) {
		return ct.save(entity);
	}

	@Override
	public List<Contracts> saveAll(List<Contracts> entities) {
		return (List<Contracts>)ct.saveAll(entities);
	}

	@Override
	public Optional<Contracts> findById(String id) {
		return ct.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return ct.existsById(id);
	}

	@Override
	public List<Contracts> findAll() {
		return (List<Contracts>)ct.findAll();
	}

	@Override
	public List<Contracts> findAllById(Iterable<String> ids) {
		return (List<Contracts>)ct.findAllById(ids);
	}

	@Override
	public void deleteById(String id) {
		ct.deleteById(id);
	}

	@Override
	public void delete(Contracts entity) {
		ct.delete(entity);
	}

	@Override
	public void deleteAll(List<Contracts> entities) {
		ct.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		ct.deleteAll();
	}
	
	@Override
	public List<Contracts> getHostByAdmin(String idAdmin){
		return ct.getHostByAdmin(idAdmin); 
	}
	
	
}

package backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Admins;

@Service
public class AdminsServicesImp implements AdminsServices{
	@Autowired
	AdminsRepository ar;

	@Override
	public <S extends Admins> S save(S entity) {
		return ar.save(entity);
	}

	@Override
	public Optional<Admins> findById(String id) {
		return ar.findById(id);
	}

	@Override
	public Iterable<Admins> findAll() {
		return ar.findAll();
	}

	@Override
	public void deleteById(String id) {
		ar.deleteById(id);
	}
	
	@Override
	public List<Admins> getAllAdmin(){
		return ar.getAllAdmin();
	}
	
	
}

package backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Services;



@Service
public class ServicesServiceslmp implements ServicesServices{
	
	@Autowired
	ServicesRepository servicesrepository;
	
	@Autowired
	AdminsRepository adminrepository;
	
	@Override
	public Services save(Services entity) {
		return servicesrepository.save(entity);
	}

	@Override
	public List<Services> saveAll(List<Services> entities) {
		return (List<Services>)servicesrepository.saveAll(entities);
	}

	@Override
	public Optional<Services> findById(String id) {
		return servicesrepository.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return servicesrepository.existsById(id);
	}

	@Override
	public List<Services> findAll() {
		return (List<Services>)servicesrepository.findAll();
	}

	@Override
	public List<Services> findAllById(Iterable<String> ids) {
		return (List<Services>)servicesrepository.findAllById(ids);
	}

	@Override
	public void deleteById(String id) {
		servicesrepository.deleteById(id);
	}

	@Override
	public void delete(Services entity) {
		servicesrepository.delete(entity);
	}

	@Override
	public void deleteAll(List<Services> entities) {
		servicesrepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		servicesrepository.deleteAll();
	}

}

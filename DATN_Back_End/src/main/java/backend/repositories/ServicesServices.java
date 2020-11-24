package backend.repositories;

import java.util.List;
import java.util.Optional;

import backend.models.Services;



public interface ServicesServices {
	
	void deleteAll();

	void deleteAll(List<Services> entities);

	void delete(Services entity);

	void deleteById(String id);

	List<Services> findAllById(Iterable<String> ids);

	List<Services> findAll();

	boolean existsById(String id);

	Optional<Services> findById(String id);

	List<Services> saveAll(List<Services> entities);

	Services save(Services entity);

}

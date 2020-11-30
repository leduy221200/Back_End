package backend.repositories;

import java.util.List;
import java.util.Optional;

import backend.models.Contracts;

public interface ContractServices {

	void deleteAll();

	void deleteAll(List<Contracts> entities);

	void delete(Contracts entity);

	void deleteById(String id);

	List<Contracts> findAllById(Iterable<String> ids);

	List<Contracts> findAll();

	boolean existsById(String id);

	Optional<Contracts> findById(String id);

	List<Contracts> saveAll(List<Contracts> entities);

	Contracts save(Contracts entity);

	List<Contracts> getHostByAdmin(String idAdmin);

}

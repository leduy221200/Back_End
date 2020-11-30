package backend.repositories;

import java.util.List;
import java.util.Optional;

import backend.models.Admins;

public interface AdminsServices {

	void deleteById(String id);

	Iterable<Admins> findAll();

	Optional<Admins> findById(String id);

	<S extends Admins> S save(S entity);

	List<Admins> getAllAdmin();

}

package backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import backend.models.Admins;

public interface AdminsRepository extends CrudRepository<Admins, String>{

	@Query(value = "SELECT * FROM admins", nativeQuery = true)
	List<Admins> getAllAdmin();
}

package backend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import backend.models.Provinces;

public interface ProvincesRepository extends CrudRepository<Provinces, String>{

	@Query(value = "SELECT p.id_province FROM provinces p WHERE p.name_province like ?1", nativeQuery = true)
	String getIdByName(String province);
}

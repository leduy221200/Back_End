package backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import backend.models.Contracts;

@Repository
public interface ContractRepository extends CrudRepository<Contracts, String> {
	@Query(value = "SELECT * FROM contracts WHERE id_admin=?1", nativeQuery = true)
	List<Contracts> getHostByAdmin(String idAdmin);

}

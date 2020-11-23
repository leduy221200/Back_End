package backend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import backend.models.Customers;

public interface CustomersRepository extends CrudRepository<Customers, String>{

	@Query(value = "SELECT COUNT(c.user_name) FROM customers c WHERE c.user_name = ?1", nativeQuery = true)
	Integer findByUserName(String userName);
	
}

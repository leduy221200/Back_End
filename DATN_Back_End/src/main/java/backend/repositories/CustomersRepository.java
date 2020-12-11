package backend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import backend.models.Customers;

public interface CustomersRepository extends CrudRepository<Customers, Integer>{

	@Query(value = "SELECT * FROM customers c WHERE c.user_name = ?1", nativeQuery = true)
	List<Customers> findByUserName(String userName);
	
	@Query(value = "SELECT * FROM customers c WHERE c.user_name = ?1 and c.pass_word = ?2", nativeQuery = true)
	List<Customers> loginCustomer(String userName, String passWord);
	
	@Query(value = "SELECT * FROM customers c WHERE c.user_name = ?1 and c.email = ?2", nativeQuery = true)
	Optional<Customers> findCustomerByEmailUserName(String userName, String email);
}

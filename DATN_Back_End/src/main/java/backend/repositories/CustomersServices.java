package backend.repositories;

import java.util.List;
import java.util.Optional;

import backend.models.Customers;

public interface CustomersServices {

	void deleteById(Integer id);

	Iterable<Customers> findAll();

	Optional<Customers> findById(Integer id);

	<S extends Customers> S save(S entity);

	List<Customers> findByUserName(String userName);
	
	List<Customers> loginCustomer(String userName, String passWord);
	
	Optional<Customers> findCustomerByEmailUserName(String username, String email);
	
	Optional<Customers> findCustomerByUserName(String userName);
}

package backend.repositories;

import java.util.Optional;

import backend.models.Customers;

public interface CustomersServices {

	void deleteById(String id);

	Iterable<Customers> findAll();

	Optional<Customers> findById(String id);

	<S extends Customers> S save(S entity);
	
}

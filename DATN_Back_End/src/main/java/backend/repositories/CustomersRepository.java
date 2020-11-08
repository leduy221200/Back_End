package backend.repositories;

import org.springframework.data.repository.CrudRepository;

import backend.models.Customers;

public interface CustomersRepository extends CrudRepository<Customers, String>{

}

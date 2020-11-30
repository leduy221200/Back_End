package backend.repositories;

import org.springframework.data.repository.CrudRepository;

import backend.models.Bills;

public interface BillsRepository extends CrudRepository<Bills, String>{

}

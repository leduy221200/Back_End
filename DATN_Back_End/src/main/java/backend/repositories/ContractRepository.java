package backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import backend.models.Contracts;

@Repository
public interface ContractRepository extends CrudRepository<Contracts, String> {

}

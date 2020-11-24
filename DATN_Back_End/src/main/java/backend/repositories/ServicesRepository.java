package backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import backend.models.Services;

@Repository
public interface ServicesRepository extends CrudRepository<Services, String> {

}

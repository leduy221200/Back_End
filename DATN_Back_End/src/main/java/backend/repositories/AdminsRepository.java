package backend.repositories;

import org.springframework.data.repository.CrudRepository;

import backend.models.Admins;

public interface AdminsRepository extends CrudRepository<Admins, String>{

}

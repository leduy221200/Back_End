package backend.repositories;

import org.springframework.data.repository.CrudRepository;

import backend.models.Posts;

public interface PostsRepository extends CrudRepository<Posts, String>{

}

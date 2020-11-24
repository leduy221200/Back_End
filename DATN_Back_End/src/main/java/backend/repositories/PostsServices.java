package backend.repositories;

import java.util.Optional;

import backend.models.Posts;

public interface PostsServices {

	void deleteById(String id);

	Iterable<Posts> findAll();

	Optional<Posts> findById(String id);

	<S extends Posts> S save(S entity);

}

package backend.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Posts;

@Service
public class PostsServicesImp implements PostsServices{

	@Autowired
	PostsRepository pr;

	@Override
	public <S extends Posts> S save(S entity) {
		return pr.save(entity);
	}

	@Override
	public Optional<Posts> findById(String id) {
		return pr.findById(id);
	}

	@Override
	public Iterable<Posts> findAll() {
		return pr.findAll();
	}

	@Override
	public void deleteById(String id) {
		pr.deleteById(id);
	}
	
}

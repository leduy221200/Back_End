package backend.repositories;


import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import backend.models.Post_Detail;

public interface PostsDetailRepository extends MongoRepository<Post_Detail, ObjectId>{

	List<Post_Detail> findByProvinceId(String provinceId, Pageable pageable);
	
	List<Post_Detail> findByProvinceId(String provinceId);
	
	List<Post_Detail> findByIdPost(Integer idPost);
	
}

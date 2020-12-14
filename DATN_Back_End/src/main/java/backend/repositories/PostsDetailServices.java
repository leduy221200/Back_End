package backend.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;

import backend.models.Post_Detail;

public interface PostsDetailServices {

	List<Post_Detail> findAll();

	List<Post_Detail> findByProvinceId(String provinceId, Pageable pageable);
	
	List<Post_Detail> findByProvinceId(String provinceId);

	List<Post_Detail> findByIdPost(Integer idPost);
	
	List<Post_Detail> findByProvinceLike(String keyWord);

}

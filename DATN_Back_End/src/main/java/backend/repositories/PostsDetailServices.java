package backend.repositories;

import java.util.List;

import backend.models.Post_Detail;

public interface PostsDetailServices {

	List<Post_Detail> findAll();

	List<Post_Detail> findByProvinceId(String provinceId);

	List<Post_Detail> findByIdPost(Integer idPost);

}

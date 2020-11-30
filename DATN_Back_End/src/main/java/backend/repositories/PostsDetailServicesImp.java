package backend.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.models.Post_Detail;

@Service
public class PostsDetailServicesImp implements PostsDetailServices{
	@Autowired
	PostsDetailRepository pdr;

	@Override
	public List<Post_Detail> findAll() {
		return pdr.findAll();
	}

	@Override
	public List<Post_Detail> findByProvinceId(String provinceId) {
		return pdr.findByProvinceId(provinceId);
	}
	
	@Override
	public List<Post_Detail> findByIdPost(Integer idPost) {
		return pdr.findByIdPost(idPost);
	}
	
}

package backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.models.Post_Detail;
import backend.repositories.PostsDetailServices;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class PostsDetailController {
	
	@Autowired
	PostsDetailServices pds;
	
	@RequestMapping(value = "/posts/ProviceId", method = RequestMethod.GET)
	public List<Post_Detail> postDetailByIdProvice (@RequestParam String provinceId){
		List<Post_Detail> ls = pds.findByProvinceId(provinceId);
		return ls;
	}
	
	@RequestMapping(value = "/posts/detail", method = RequestMethod.GET)
	public List<Post_Detail> postDetailByIdPost (@RequestParam Integer idPost){
		List<Post_Detail> ls = pds.findByIdPost(idPost);
		return ls;
	}
}

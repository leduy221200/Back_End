package backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value = "/posts/length/ProviceId", method = RequestMethod.GET)
	public List<Post_Detail> lengthPostDetailByIdProvice (@RequestParam String provinceId){
		try {
			List<Post_Detail> ls = pds.findByProvinceId(provinceId);	
			return ls;
		} catch (Exception e) {
			System.out.println("postDetailByIdProvice: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/posts/ProviceId", method = RequestMethod.GET)
	public List<Post_Detail> postDetailByPage (@RequestParam String provinceId, @RequestParam Integer page){
		try {
			List<Post_Detail> ls = pds.findByProvinceId(provinceId, PageRequest.of(page, 20, Sort.by("postDate").descending()));	
			return ls;
		} catch (Exception e) {
			System.out.println("postDetailByPage: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/posts/insert", method = RequestMethod.POST)
	public String insertPostDetail (@RequestBody Post_Detail model){
		try {
			pds.insert(model);
			return "Thêm mới bài viết thành công!";
		} catch (Exception e) {
			System.out.println("postDetailByIdPost: " + e);
			return "Thêm mới bài viết thất bại!";
		}
	}
	
	@RequestMapping(value = "/posts/detail", method = RequestMethod.GET)
	public List<Post_Detail> postDetailByIdPost (@RequestParam Integer idPost){
		try {
			List<Post_Detail> ls = pds.findByIdPost(idPost);
			return ls;
		} catch (Exception e) {
			System.out.println("postDetailByIdPost: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/posts/find/province", method = RequestMethod.POST)
	public List<Post_Detail> postFindByProvince (@RequestParam String keyWord){
		try {
			List<Post_Detail> ls = pds.findByProvinceLike(keyWord);
			return ls;
		} catch (Exception e) {
			System.out.println("postFindByProvince: " + e);
			return null;
		}
	}
	
	@RequestMapping(value = "/posts/Provice", method = RequestMethod.GET)
	public List<Post_Detail> postDetailKeyWordByPage (@RequestParam String keyWord, @RequestParam Integer page){
		try {
			List<Post_Detail> ls = pds.findByProvinceLikePage(keyWord, PageRequest.of(page, 20));	
			return ls;
		} catch (Exception e) {
			System.out.println("postDetailByPage: " + e);
			return null;
		}
	}
}

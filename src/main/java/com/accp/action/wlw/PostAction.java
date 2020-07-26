package com.accp.action.wlw;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wlw.PostBiz;
import com.accp.pojo.Post;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/wlw")
public class PostAction {
	@Autowired
	private PostBiz postBiz;
	
	//分页查询全部
	@GetMapping("queryPost/{pageNum}/{pageSize}")
	public PageInfo<Post> queryByAuction(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		System.out.println("进入yixia1");
		System.out.println("qqq");
		return postBiz.queryByPost(pageNum, pageSize);
	}
	
	//新增
	@PostMapping("addPost")
	@ResponseBody
	public Map<String, Object> addPost(@RequestBody Post post){
		System.out.println(JSON.toJSONString(post));
		int count=postBiz.addPost(post);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//修改
	@PostMapping("updatePost")
	@ResponseBody
	public Map<String, Object> updateRuleFrom(@RequestBody Post post){
		System.out.println(JSON.toJSONString(post));
		int count=postBiz.updatePost(post);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//根据id查询
	@GetMapping("queryByid/{postid}")
	public Post queryByUser(@PathVariable Integer postid) {
		Post post=postBiz.queryByid(postid);
		return post;
	}
	
	//删除
	@GetMapping("deletePost/{postid}")
	public Map<String, Object> deleteRuleFrom(@PathVariable Integer postid){
		int count=postBiz.deletePost(postid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;	
	}
}

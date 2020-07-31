package com.accp.biz.wlw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import com.accp.dao.PostMapper;
import com.accp.pojo.Post;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PostBiz {
	@Autowired
	private PostMapper postMapper;
	
	//查询全部
	public PageInfo<Post> queryByPost(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Post>(postMapper.queryPost());
	}
	
	//根据id查询
	public Post queryByid(Integer postid) {
		Post list=postMapper.queryByid(postid);
		return list;
	}
	
	//新增
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addPost(Post post) {
		int count = postMapper.addPost(post);
		return count;
	}
	
	//修改
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updatePost(Post post) {
		int count = postMapper.updatePost(post);
		return count;
	}
	
	//删除
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deletePost(Integer  postid) {
		int count = postMapper.deleteByid(postid);
		return count;
	}
	
	//查询全部
	public List<Post> queryByPosts(){
		List<Post> list=postMapper.queryPost();
		return list;
	}
}

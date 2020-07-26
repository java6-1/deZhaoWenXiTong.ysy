package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.pojo.Post;

public interface PostMapper {
    //新增
	@Insert("insert into post(postid,sectionbh,postname,bz1,bz2,bz3)values(#{postid},#{sectionbh},#{postname},#{bz1},#{bz2},#{bz3})")
	int addPost(Post post);
	
	//查询全部
	@Select("select * from post")
	List<Post> queryPost();
	
	//根据id查询
	@Select("select * from post where postid=#{postid}")
	Post queryByid(Integer postid);
	
	//修改
	@Update("update post set postname=#{postname} where postid=#{postid}")
	int updatePost(Post post);
	
	//删除
	@Delete("delete from post where postid=#{postid}")
	int deleteByid(Integer postid);
	
	//s
}
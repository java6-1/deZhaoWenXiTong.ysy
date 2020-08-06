package com.accp.action.wlw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.wlw.SectionBiz;
import com.accp.biz.wlw.StaffBizs;
import com.accp.pojo.Post;
import com.accp.pojo.Section;
import com.accp.pojo.Staff;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/wlw")
public class StaffActions {
	@Autowired
	private StaffBizs staffBizs;
	
	@Autowired
	private SectionBiz sectionBiz;
	
	//查询全部员工信息
	@GetMapping("queryStaff/{pageNum}/{pageSize}")
	public PageInfo<Staff> queryByAuction(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		System.out.println("进入yixia1");
		return staffBizs.queryByStaff(pageNum, pageSize);
	}
	
	//新增部门
	@PostMapping("addSection")
	@ResponseBody
	public Map<String, Object> addSection(@RequestBody Section section){
		System.out.println(JSON.toJSONString(section));
		int count = sectionBiz.addSection(section);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//查询所有部门
	@GetMapping("querySection")
	public List<Section> querySection(){
		List<Section> list=sectionBiz.querySection();
		return list;
	}
	
	//新增员工
	@PostMapping("addStaff")
	@ResponseBody
	public Map<String, Object> addStaff(@RequestBody Staff staff){
		System.out.println(JSON.toJSONString(staff));
		int count = staffBizs.addStaff(staff);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//根据id查询
	@GetMapping("queryByStaff/{staffid}")
	public Staff queryByStaff(@PathVariable Integer staffid) {
		Staff staff = staffBizs.queryByStaff(staffid);
		return staff;
	}
	
	//根据id删除
	@GetMapping("deleteStaff/{staffid}")
	public Map<String, Object> deleteByStaff(@PathVariable Integer staffid) {
		int count = staffBizs.deleteStaff(staffid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//修改
	@PostMapping("updateStaff")
	@ResponseBody
	public Map<String, Object> updateRuleFrom(@RequestBody Staff staff){
		System.out.println(JSON.toJSONString(staff));
		int count= staffBizs.updateStaff(staff);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//查询全部部根据分页
	@GetMapping("query")
	public List<Staff> query(){
		List<Staff> list = staffBizs.query();
		return list;
	}
	
	//离职查询
	@GetMapping("queryStaffs/{pageNum}/{pageSize}")
	public PageInfo<Staff> queryByAuctions(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		System.out.println("进入yixia1");
		return staffBizs.queryByStaffs(pageNum, pageSize);
	}
	
	//离职登记
	@PostMapping("XgStaff")
	@ResponseBody
	public Map<String, Object> XgStaff(@RequestBody Staff staff){
		System.out.println(JSON.toJSONString(staff));
		int count= staffBizs.XgStaff(staff);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//离职删除
	@GetMapping("DeStaff/{staffid}")
	public Map<String, Object> DeStaff(@PathVariable Integer staffid){
		int count= staffBizs.DeStaff(staffid);
		System.out.println("");
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//根据名字模糊查询离职
	@GetMapping("queryByName/{staffname}")
	public List<Staff> queryByName(@PathVariable String staffname){
		String staffnames="%"+staffname+"%";
		List<Staff> list = staffBizs.queryByname(staffnames);
		return list;
	}
	
	//根据名字模糊查询员工
	@GetMapping("queryByNames/{staffname}")
	public List<Staff> queryByNames(@PathVariable String staffname){
		String staffnames="%"+staffname+"%";
		List<Staff> list = staffBizs.queryBynames(staffnames);
		return list;
	}
}

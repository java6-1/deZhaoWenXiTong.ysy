package com.accp.action.hl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.validator.internal.util.stereotypes.ThreadSafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.hl.ChexingBiz;
import com.accp.biz.hl.QxkzBiz;
import com.accp.biz.hl.SstaffBiz;
import com.accp.biz.hl.WaiqinBiz;
import com.accp.biz.hl.WxxmBiz;
import com.accp.pojo.Qxkz;
import com.accp.pojo.Staff;
import com.accp.pojo.Waiqin;
import com.accp.pojo.Wxxm;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/api/hl") // 命名空间
public class HlAction {
	@Autowired
	private ChexingBiz chexingBiz;
	
	@Autowired
	private QxkzBiz qxkzBiz;
	
	@Autowired
	private SstaffBiz staffBiz;
	
	@Autowired
	private WaiqinBiz waiqinBiz;
	
	@Autowired
	private WxxmBiz wxxmBiz;
	
	/**查询全部权限**/
	@GetMapping("/selec")
	public List<Qxkz> select() {	
		List<Qxkz> list = qxkzBiz.select();
		return  list;
	}
	
	/**查询全部权限**/
	@GetMapping("/selecl")
	public List<Wxxm> selec() {	
		List<Wxxm> list = wxxmBiz.selec();
		return  list;
	}
	
	
	/*
	 * @GetMapping("query/{pageNum}/{pageSize}/{staffname}") public PageInfo<Staff>
	 * selectBy(@PathVariable Integer pageNum,@PathVariable Integer
	 * pageSize,@PathVariable String staffname) { return staffBiz.selec(pageNum,
	 * pageSize,staffname); }
	 */
	
	
	
	@GetMapping("query")
	public PageInfo<Staff> selectBy(HttpServletRequest request, HttpServletResponse response) {
		String strPageNum = request.getParameter("pageNum");
		Integer pageNum = strPageNum == null ? 1 : Integer.parseInt(strPageNum);
		String strPageSize = request.getParameter("pageSize");
		Integer pageSize = strPageSize == null ? 1 : Integer.parseInt(strPageSize);	
		String staffname = request.getParameter("staffname");
		System.out.println(staffname);
		return staffBiz.selec(pageNum, pageSize,staffname);
	}
	
	
	
	
	/**根据ID查询**/
	@GetMapping("/selectByPrimaryKey/{staffID}")
	public Qxkz selectByPrimaryKey(@PathVariable Integer staffID) {	
		System.out.println(staffID);
		Qxkz qxkz = qxkzBiz.selectByPrimaryKey(staffID);
		System.out.println(qxkz+"11111");
		return  qxkz;
	}
	
	
	/**根据ID查询**/
	@PostMapping("/insert")
	public int  insert(@RequestBody Qxkz record) {	
		int count = qxkzBiz.insert(record);
		return  count;
	}
	
	/**修改会员权限**/
	@PutMapping("/updateByPrimaryKeySelective")
	public Map<String, Object>  updateByPrimaryKeySelective(@RequestBody Qxkz record) {	
		qxkzBiz.updateByPrimaryKeySelective(record);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return  message;
	}
	
	/**查询全部权限**/
	@GetMapping("/selectByjiescph/{jiescph}")
	public List<Waiqin> selectByjiescph(@PathVariable String jiescph) {	
		List<Waiqin> list = waiqinBiz.selectByjiescph(jiescph);
		return  list;
	}
	
	
}

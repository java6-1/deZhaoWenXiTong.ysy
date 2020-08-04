package com.accp.action.hl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Delete;
import org.hibernate.validator.internal.util.stereotypes.ThreadSafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.hl.ChexingBiz;
import com.accp.biz.hl.ClppBiz;
import com.accp.biz.hl.KehuBiz;
import com.accp.biz.hl.KhclBiz;
import com.accp.biz.hl.QxkzBiz;
import com.accp.biz.hl.SstaffBiz;
import com.accp.biz.hl.WaiqinBiz;
import com.accp.biz.hl.WeixiujlBiz;
import com.accp.biz.hl.WeixiuspBiz;
import com.accp.biz.hl.WxtypeBiz;
import com.accp.biz.hl.WxxmBiz;
import com.accp.pojo.Clpp;
import com.accp.pojo.Kehu;
import com.accp.pojo.Khcl;
import com.accp.pojo.Qxkz;
import com.accp.pojo.Staff;
import com.accp.pojo.Waiqin;
import com.accp.pojo.Weixiujl;
import com.accp.pojo.Weixiusp;
import com.accp.pojo.Wxtype;
import com.accp.pojo.Wxxm;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/api/hl") // 命名空间
public class HlAction {

	
	@Autowired
	private QxkzBiz qxkzBiz;
	
	@Autowired
	private SstaffBiz staffBiz;
	
	@Autowired
	private WaiqinBiz waiqinBiz;
	
	@Autowired
	private WxxmBiz wxxmBiz;
	
	
	@Autowired
	private ClppBiz clppBiz;
	
	@Autowired
	private KhclBiz khclBiz;
	
	
	@Autowired
	private KehuBiz kehuBiz;
	
	@Autowired
	private WeixiujlBiz weixiujlBiz;
	
	
	@Autowired
	private WeixiuspBiz weixiuspBiz;
	
	
	@Autowired
	private WxtypeBiz wxtypeBiz;
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
	
	
	/**查询班组技工**/
	@GetMapping("/selecBybzjg")
	public List<Staff> selecBybzjg(){		
		return staffBiz.selecBybzjg();
	}
	
	
	/**查询车辆品牌**/
	@GetMapping("/selectpp")
	public List<Clpp> selectpp(){		
		return clppBiz.select();
	}
	
	
	/**查询全部权限**/
	@GetMapping("/select1/{queryString}")
	public List<Khcl> select1(@PathVariable String queryString) {	
		List<Khcl> list = khclBiz.select(queryString);
		return  list;
	}
	
	
	/**查询全部权限**/
	@GetMapping("/selectByPrimaryKey1/{khclid}")
	public Khcl selectByPrimaryKey1(@PathVariable Integer khclid) {	
		Khcl list = khclBiz.selectByPrimaryKey(khclid);
		return  list;
	}
	
	
	/**查询全部权限**/
	@GetMapping("/selectByPrimaryKey2/{kehuid}")
	public Kehu selectByPrimaryKey2(@PathVariable Integer kehuid) {	
		Kehu list = kehuBiz.selectByPrimaryKey(kehuid);
		return  list;
	}
	
	
	/**新增维修记录表 **/
	@PostMapping("/insertSelect")
	public Map<String, Object>  insertSelect(@RequestBody Weixiujl record) {	
		
		weixiujlBiz.insertSelective(record);
		System.out.println(record);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200"); 
		message.put("weixiujlid",record.getWeixiujlid());
		 
		
		return  message;
	}
	
	/**新增维修记录表 **/
	@PostMapping("/insertlist/{weixiujlid}")
	public Map<String, Object>  insertlist(@RequestBody List<Weixiusp> record,@PathVariable Integer weixiujlid) {
		
		List<Weixiusp> list = new ArrayList<Weixiusp>();
		list = JSONObject.parseArray(JSONObject.toJSONString(record), Weixiusp.class);
		for (Weixiusp weixiusp : list) {
			weixiusp.setWeixiujlid(weixiujlid);
		}
		weixiuspBiz.insertlist(list);

		Map<String, Object> message = new HashMap<String, Object>();
		 message.put("code", "200"); 
		return  message;
	}
	
	
	/**查询维修员工和费用**/
	@GetMapping("/selecBystaff/{weixiuzrr}") 
	public Staff   selecBystaff(@PathVariable String weixiuzrr) {
		Staff staff = staffBiz.selecBybzj(weixiuzrr);
		System.out.println(staff);
		return staff;
	}
	
	/**新增维修记录表 **/
	@GetMapping("/selectByKey/{weixiujlid}")
	public List<Weixiusp> selectstaff(@PathVariable Integer weixiujlid){
		return weixiuspBiz.selectByKey(weixiujlid); 
	 }
	
	
	/**新增维修记录表 **/
	@GetMapping("/selectByP")
	public List<Wxxm> selectByP(HttpServletRequest request){
		Integer wxtypeid = Integer.valueOf(request.getParameter("wxtypeid"));
		return wxxmBiz.selectByP(wxtypeid);
	 }
	
	
	/**新增维修记录表 **/
	@GetMapping("/insertSele/{wxxmname}/{bzjia}/{weixiujlid}")
	public Map<String, Object>  insertSelective(@PathVariable String wxxmname,@PathVariable Double bzjia,@PathVariable Integer weixiujlid) {	
		Weixiusp recor = new Weixiusp(weixiujlid,wxxmname,bzjia);
		weixiuspBiz.insertSelective1(recor);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		return  message;
	}
	
	
	
	
	
	//删除
	@GetMapping("deleteBs/{weixiusp}")
	public Map<String, Object> deleteByPrimaryKey(@PathVariable Integer weixiusp){
		weixiuspBiz.deleteByPrimaryKey(weixiusp);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		return  message;	
	}
	
	@GetMapping("selecBybzj/{staffna}")
	public Staff selecBybzj(@PathVariable String staffna) {
		return staffBiz.selecBybzj(staffna);
	}
	
	@GetMapping("selectWxtype")
	public List<Wxtype> selectWxtype() {
		return wxtypeBiz.select();
	}
	
	
	@GetMapping("updateBy/{bz1}/{wxxmid}")
	public Map<String, Object> updateBy(@PathVariable Integer bz1,@PathVariable Integer wxxmid) {
		wxxmBiz.updateBy(bz1,  wxxmid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		return  message;
	}
}

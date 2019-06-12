package com.jiachengyu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiachengyu.service.MyService;
import com.jiachengyu.utils.PageUtil;
/**
 * 
 * @ClassName: MyController 
 * @Description: TODO
 * @author: 86183
 * @date: 2019年6月11日 上午10:37:37
 */
@Controller
public class MyController {
@Autowired
private MyService ms;
@RequestMapping("list")
/**
 * 查询
 * @Title: getlist 
 * @Description: TODO
 * @param request
 * @param model
 * @param page
 * @param mname
 * @param startdatea
 * @param enddatea
 * @param author
 * @param startprice
 * @param endprice
 * @param years
 * @param starthours
 * @param endhours
 * @return
 * @return: String
 */
public String getlist(HttpServletRequest request,Model model,@RequestParam(defaultValue="1")int page,@RequestParam(defaultValue="")String mname,
		@RequestParam(defaultValue="")String startdatea,@RequestParam(defaultValue="")String enddatea,
		@RequestParam(defaultValue="")String author,@RequestParam(defaultValue="0")Double startprice,
		@RequestParam(defaultValue="0")Double endprice,@RequestParam(defaultValue="0")int years,
		@RequestParam(defaultValue="0")int starthours,@RequestParam(defaultValue="0")int endhours
		,@RequestParam(defaultValue="1")int flag,@RequestParam(defaultValue="asc")String m1,
		@RequestParam(defaultValue="asc")String m2,@RequestParam(defaultValue="asc")String m3) {

	PageHelper.startPage(page, 4);
	List list=ms.getlist(mname,startdatea,enddatea,author,startprice,endprice,years,starthours,endhours,flag,m1,m2,m3);
	PageInfo info=new PageInfo(list);
	String url="";
	PageUtil.page(request, url, 4, list, info.getTotal(), page);
	model.addAttribute("list", list);
	model.addAttribute("m1", m1);
	model.addAttribute("m2", m2);
	model.addAttribute("m3", m3);
	return "list";
	
}
@RequestMapping("del")
@ResponseBody
/**
 * 删除
 * @Title: del 
 * @Description: TODO
 * @param mid
 * @return
 * @return: boolean
 */
public boolean del(@RequestParam(defaultValue="")String mid) {
	return ms.del(mid)>0;
	
}
@RequestMapping("xj")
@ResponseBody
/**
 * 下架功能
 * @Title: xj 
 * @Description: TODO
 * @param mid
 * @return
 * @return: boolean
 */
public boolean xj(int mid) {
	return ms.xj(mid)>0;
}
@RequestMapping("sj")
@ResponseBody
/**
 * 上架功能
 * @Title: sj 
 * @Description: TODO
 * @param mid
 * @return
 * @return: boolean
 */
public boolean sj(int mid) {
	return ms.sj(mid)>0;
}
/**
 * 进入查看页面
 * @Title: tock 
 * @Description: TODO
 * @return
 * @return: String
 */
@RequestMapping("tock")
public String tock() {
	return "ck";
	
}
}

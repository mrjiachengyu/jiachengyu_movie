package com.jiachengyu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiachengyu.mapper.MovieMapper;
@Service
public class MyServiceImp implements MyService {
@Autowired
private MovieMapper mapper;
//查询
	@Override
	public List getlist(String mname, String startdatea, String enddatea, String author, Double startprice, Double endprice, int years, int starthours, int endhours, int flag, String m1, String m2, String m3) {
		// TODO Auto-generated method stub
		return mapper.getlist(mname,startdatea,enddatea,author,startprice,endprice,years,starthours,endhours,flag,m1,m2,m3);
	}
//批量删除
	@Override
	public int del(String mid) {
		// TODO Auto-generated method stub
		return mapper.del(mid);
	}
//下架
	@Override
	public int xj(int mid) {
		// TODO Auto-generated method stub
		return mapper.xj(mid);
	}
	//上架
	@Override
	public int sj(int mid) {
		// TODO Auto-generated method stub
		return mapper.sj(mid);
	}

}

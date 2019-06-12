package com.jiachengyu.service;

import java.util.List;

public interface MyService {
	//查询
	List getlist(String mname, String startdatea, String enddatea, String author, Double startprice, Double endprice, int years, int starthours, int endhours, int flag, String m1, String m2, String m3);
	//批量删除
	int del(String mid);
	//下架
	int xj(int mid);
	//上架
	int sj(int mid);

}

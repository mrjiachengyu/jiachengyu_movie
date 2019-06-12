package com.jiachengyu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MovieMapper {

	// 查询
	List getlist(@Param("mname") String mname, @Param("startdatea") String startdatea,
			@Param("enddatea") String enddatea, @Param("author") String author, @Param("startprice") Double startprice,
			@Param("endprice") Double endprice, @Param("years") int years, @Param("starthours") int starthours,
			@Param("endhours") int endhours, @Param("flag") int flag, @Param("m1") String m1, @Param("m2") String m2,
			@Param("m3") String m3);

	// 批量删除
	int del(@Param("mid") String mid);

	// 下架
	int xj(@Param("mid") int mid);

	// 上架
	int sj(@Param("mid") int mid);

}

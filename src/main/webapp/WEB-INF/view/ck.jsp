<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/index2.css">
<script type="text/javascript" src="/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
</head>
<body>
电影名称：<input type="text" name="mname"/> 上映时间：<input type="text" name="startdatea" onclick="WdatePicker()">--<input type="text" name="enddatea" onclick="WdatePicker()"><br>
导演：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="author"/>  价格：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="startprice"/>--<input type="text" name="endprice"/><br>
电影年代：<input type="text" name="years"/> 电影时长：<input type="text" name="starthours"/>--<input type="text" name="endhours"/><br>
<input type="button" value="查询影片" onclick="cck()"/>
<input type="reset" value="重置查询"/>
</body>
<script type="text/javascript">
function cck(){
	var mname=$("input[name=mname]").val()
	var startdatea=$("input[name=startdatea]").val()
	var enddatea=$("input[name=enddatea]").val()
	var author=$("input[name=author]").val()
	var startprice=$("input[name=startprice]").val()
	var endprice=$("input[name=endprice]").val()
	var years=$("input[name=years]").val()
	var starthours=$("input[name=starthours]").val()
	var endhours=$("input[name=endhours]").val()
	location.href="/list?mname="+mname+"&&startdatea="+startdatea+"&&enddatea="+enddatea
	+"&&author="+author+"&&startprice="+startprice+"&&endprice="+endprice+"&&years="+years
	+"&&starthours="+starthours+"&&endhours="+endhours;
	
}

</script>
</html>
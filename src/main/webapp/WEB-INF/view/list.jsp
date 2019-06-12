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
<input type="button" value="查询影片" onclick="tock()"/>
<input type="button" value="添加影片"/>
<input type="button" value="删除影片" onclick="plsc()"/>
<table>
	<tr>
		<td><input type="checkbox" name="fx" onclick="fx()"></td>
		<td>影片名</td>
		<td>导演</td>
		<td><a href="/list?m1=${m1=='asc'?'desc':'asc' }&flag=1">票价</a></td>
		<td><a href="/list?m2=${m2=='asc'?'desc':'asc' }&flag=2">上映时间</a></td>
		<td><a href="/list?m3=${m3=='asc'?'desc':'asc' }&flag=3">时长</a></td>
		<td>类型</td>
		<td>年代</td>
		<td>区域</td>
		<td>状态</td>
		<td>操作</td>
	</tr>
	
		<c:forEach items="${list}" var="m">
		<c:if test="${m.struts==1 }">
			<tr>
				<td><input type="checkbox" value="${m.mid }" name="mid"/></td>
				<td>${m.mname }</td>
				<td>${m.author }</td>
				<td>${m.price }</td>
				<td>${m.sydatea }</td>
				<td>${m.hours }</td>
				<td>${m.tname }</td>
				<td>${m.years }</td>
				<td>${m.addr }</td>
				<td>
					即将上映
				</td>
				<td>
					<input type="button" value="详情"/>
					<input type="button" value="编辑"/>
					<input type="button" value="下架" onclick="xj(${m.mid})"/>
				</td>
			</tr>
			</c:if>
		</c:forEach>
	
	
		<c:forEach items="${list}" var="m">
		<c:if test="${m.struts==2 }">
			<tr>
				<td><input type="checkbox" value="${m.mid }" name="mid"/></td>
				<td>${m.mname }</td>
				<td>${m.author }</td>
				<td>${m.price }</td>
				<td>${m.sydatea }</td>
				<td>${m.hours }</td>
				<td>${m.tname }</td>
				<td>${m.years }</td>
				<td>${m.addr }</td>
				<td>
					正在热映
				</td>
				<td></td>
			</tr>
			</c:if>
		</c:forEach>
	
	
		<c:forEach items="${list}" var="m">
		<c:if test="${m.struts==0 }">
			<tr>
				<td><input type="checkbox" value="${m.mid }" name="mid"/></td>
				<td>${m.mname }</td>
				<td>${m.author }</td>
				<td>${m.price }</td>
				<td>${m.sydatea }</td>
				<td>${m.hours }</td>
				<td>${m.tname }</td>
				<td>${m.years }</td>
				<td>${m.addr }</td>
				<td>
					已经下架
				</td>
				<td>
				<input type="button" value="详情"/>
				<input type="button" value="编辑"/>
				<input type="button" value="上架" onclick="sj(${m.mid})"/>
				</td>
			</tr>
			</c:if>
		</c:forEach>
	<tr>
		<td colspan="11">${page }</td>
	</tr>
</table>
<script type="text/javascript">
function plsc(){
	var mid="";
	$("input[name=mid]:checked").each(function(){
		mid+=","+$(this).val()
	})
	mid=mid.substring(1)
	$.ajax({
		url:"/del",
		type:"post",
		dataType:"json",
		data:{"mid":mid},
		success:function(obj){	
				if(obj){
					alert("删除成功");
					location.href="/list"
				}
		}
	})
}
function fx(){
	
		$("input[name=mid]").each(function(){
			this.checked=!this.checked
		})
	
}
function xj(mid){
	$.ajax({
		url:"/xj",
		type:"post",
		dataType:"json",
		data:{"mid":mid},
		success:function(obj){	
				if(obj){
					alert("下架成功");
					location.href="/list"
				}
		}
	})
}
function sj(mid){
	$.ajax({
		url:"/sj",
		type:"post",
		dataType:"json",
		data:{"mid":mid},
		success:function(obj){	
				if(obj){
					alert("上架成功");
					location.href="/list"
				}
		}
	})
}
function tock(){
	location.href="/tock";
}
</script>
</body>
</html>
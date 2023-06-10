<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<%@include file="../include/header.jsp"%>

	<div class="box-header with-border">
		<h3 class="box-title">LIST ALL PAGE</h3>
	</div>
			
	<table >
		<tr>
			<th style="width: 50px">BNO</th>
			<th style="width: 300px">TITLE</th>
			<th style="width: 300px">WRITER</th>
			<th style="width: 200px">REGDATE</th>
			<th style="width: 50px">VIEWCNT</th>
		</tr>
	
	
	<c:forEach items="${list}" var="boardVO">
	
		<tr>
			<td>${boardVO.bno}</td>
			<td><a href='/board/read?bno=${boardVO.bno}'>${boardVO.title}</a></td>
			<td>${boardVO.writer}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
					value="${boardVO.regdate}" /></td>
			<td>${boardVO.viewcnt }</td>
		</tr>
	
	</c:forEach>
	
</table>

	
<%@include file="../include/footer.jsp"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<%@include file="../include/header.jsp"%>
<html>
	<h3><center><b>게시물 목록</b></center></h3>
	<table>
		<tr>
			<th style="width: 50px"> BNO </th>
			<th style="width: 300px"> 제 목 </th>
			<th style="width: 300px"> 글쓴이 </th>
			<th style="width: 200px"> 등록시간 </th>
			<th style="width: 50px"> 조회수 </th>
		</tr>
		
		<c:forEach items="${list}" var="boardVO">
			<tr>
				<td>${boardVO.bno}</td>
				<td>
					<a href="/board/read?bno=${boardVO.bno}">
						${boardVO.title}
					</a>
				</td>
				<td>${boardVO.writer}</td>
				<td>
					<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate}" />
				</td>
				<td>${boardVO.viewcnt}</td>
			</tr>	
		</c:forEach>	
	</table>
</html>
<%@include file="../include/footer.jsp"%>

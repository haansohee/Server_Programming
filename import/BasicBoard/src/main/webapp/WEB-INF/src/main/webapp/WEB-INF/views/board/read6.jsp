<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<html>
	<center><b>게시물 열람</b></center>
	<div>
		<label>제목</label>
		<input type="text" name='title' value="${boardVO.title}" readonly="readonly">
	</div>
	</br>
	<div>
		<label>내용</label>
		<textarea name='content' rows="5" readonly="readonly">
			"${boardVO.content}"
		</textarea> 
	</div>
	</br>
	<div>
		<label>글쓴이</label>
		<input type="text" name='writer' value="${boardVO.writer}" readonly="readonly">
	</div>
	</br>
</html>

<%@include file="../include/footer.jsp"%>

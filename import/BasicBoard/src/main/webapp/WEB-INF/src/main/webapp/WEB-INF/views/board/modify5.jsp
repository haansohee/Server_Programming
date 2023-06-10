<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>
<html>
	<h3><b><center>게시물 수정</center></b></h3>
	<form role="form" method="post">
		<div>
			<lable>게시물 번호</lable>
			<input type="text" name="bno" value="${boardVO.bno}" readonly="readonly">	
			</br>
		</div>
		<div>
			<lable>게시물 제목</lable>
			<input type="text" name="title" value="${boardVO.title}" >	
			</br>
		</div>
		<div>
			<lable>게시물 내용</lable>
			<textarea rows="5" name="content">${boardVO.content}</textarea>	
			</br>
		</div>
		<div>
			<lable>작성자</lable>
			<input type="text" name="writer" value="${boardVO.writer}" >	
			</br>
		</div>
		<button> 저 장 </button>
	</form>
	<a href="/board/listAll">
		<button> 취 소 </button>
	</a>
	
</html>
<%@include file="../include/footer.jsp"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>
<html>
		<h3><b><center>게시물 수정</center></b></h3>
		<form role="form" method="post">
			<div>
				<label> 게시물 번호</label>
				<input type="text" name="bno" value="${boardVO.bno}" readonly="readonly">
				</br>
			</div>
			<div>
				<label> 제 목</label>
				<input type="text" name="title" value="${boardVO.title}">
				</br>
			</div>
			<div>
				<label> 내 용</label>
				<textarea rows="5" name="content"> ${boardVO.content}"</textarea>
				</br>
			</div>
			<div>
				<label> 글쓴이</label>
				<input type="text" name="writer" value="${boardVO.writer}" readonly="readonly">
				</br>
			</div>
			<button type="submit"> 저 장 </button>
		</form>
		<a href="/board/listAll">
			<button> 목록보기 </button>
		</a>
</html>
<%@include file="../include/footer.jsp"%>

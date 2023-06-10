<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<html>
	<h3><b><center>게시물 수정</center></b></h3>

</html>


	<form role="form" method="post">
		<label>BNO</label> 
		<input type="text"	name='bno' value="${boardVO.bno}"	readonly="readonly">
		</br>

		<label>Title</label> 
		<input type="text" name='title' value="${boardVO.title}">
		</br>
		
		<label>Content</label>
		<textarea name="content" rows="5">${boardVO.content}</textarea>
		</br>
		
		<label>Writer</label> 
		<input	type="text" name="writer" value="${boardVO.writer}">
		</br>
		
		
		<button type="submit">저장</button>
		<a href="/board/listAll">
	        <button>취소</button>
	    </a>
	</form>

	


</html>
<%@include file="../include/footer.jsp"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

	<div>
		<h3 class="box-title">READ BOARD</h3>
	</div>

	<form role="form" method="post">
	
		<input type='hidden' name='bno' value="${boardVO.bno}">
	
	</form>
	
	<div>
		<div>
			<label>Title</label> 
			<input type="text"	name='title' value="${boardVO.title}"
				readonly="readonly">
		</div>
		<div>
			<label>Content</label>
			<textarea name="content" rows="5" readonly="readonly">
			${boardVO.content}</textarea>
		</div>
		<div>
			<label>Writer</label> 
			<input type="text"
				name="writer" value="${boardVO.writer}"
				readonly="readonly">
		</div>
	</div>
	<!-- /.box-body -->
	
	<div>
		<button type="submit" class="btn btn-warning">Modify</button>
		<button type="submit" class="btn btn-danger">REMOVE</button>
		<button type="submit" class="btn btn-primary">LIST ALL</button>
	</div>


				<script>
				
$(document).ready(function(){
	
	var formObj = $("form[role='form']");
	
	console.log(formObj);
	
	$(".btn-warning").on("click", function(){
		formObj.attr("action", "/board/modify");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	$(".btn-danger").on("click", function(){
		formObj.attr("action", "/board/remove");
		formObj.submit();
	});
	
	$(".btn-primary").on("click", function(){
		self.location = "/board/listAll";
	});
	
});

</script>




			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>

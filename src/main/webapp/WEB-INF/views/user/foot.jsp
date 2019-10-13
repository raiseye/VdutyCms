<%@ page contentType="text/html;charset=utf-8"%>

</div>
<!-- pagegroup end -->


 <script  src="${pageContext.request.contextPath}/public/lib/sui/sm.min.js" charset='utf-8' ></script>
  <script src="${pageContext.request.contextPath}/public/lib/sui/sm-extend.min.js" charset='utf-8'></script>
</body>
 

<script>
$(function(){
	 $(document).on("pageInit", "#page_main", function(e, id, page) {
	
		$("#aUsername").click(function() {

			var buttons1 = [ {
				text : '请选择操作',
				label : true
			}, {
				text : '修改密码',
				bold : true,

				onClick : function() {
					$.alert("你选择了“修改密码“");
				}
			}, {
				text : '退出登录',
				color : 'danger',
				onClick : function() {
					//$.alert("你选择了“退出登录“");

					$.confirm('你确定要退出登录吗?', function() {
						$.alert('你点击了确定按钮!');
						location.href = "/user/logout"
					});

				}
			} ];
			var buttons2 = [ {
				text : '取消',
				bg : 'danger'
			} ];
			var groups = [ buttons1, buttons2 ];
			$.actions(groups);
		});
	});
	$.init();
});
</script>
</html>
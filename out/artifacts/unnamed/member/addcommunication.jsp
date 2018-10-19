<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#infoshow {
	color: red;
	font-size: 15px;
}
</style>
<link
	href="${pageContext.request.contextPath}/tableTemplet/css/H-ui.min.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/layer/layer-v2.0/layer/layer.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/tableTemplet/lib/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" charset="utf-8"
	src="${pageContext.request.contextPath}/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8"
	src="${pageContext.request.contextPath}/ueditor/ueditor.all.js"></script>
<script type="text/javascript" charset="utf-8"
	src="${pageContext.request.contextPath}/ueditor/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript">
$(function(){
	var ue = UE.getEditor('editor',{
		enableAutoSave: false
	});
	$("[type='button']").click(function(){
		//获取会员id
		var mid=$("[name='id']").val();
		//获取时间
		var time=$.trim($("#time").val());
		if (time == ""){
			var mydate = new Date();
		}
		else{
			var arr = time.split(/[- :]/);
			var mydate = new Date(arr[0], arr[1]-1, arr[2]); 
		}
		//获取内容
		var contents=UE.getEditor('editor').getContent();
		if(contents == "" ){
			$("#infoshow").html("沟通内容不能为空");
			return false;
		}
		$.ajaxSetup({async:false});
		$.post("${pageContext.request.contextPath}/experience/addCommunication.action",{mid:mid,time:mydate,content:contents},function(data){
			if(data=="1"){			
				layer.msg('添加成功', {
				    icon: 1,
				    time: 1000
				}, function(){
	 				var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
					parent.layer.close(index);
				});
			}
			else{
				layer.open({
 					  type: 2,
 					  title: '登录',
 					  area: ['600px', '361px'],
 					  closeBtn: 0, //不显示关闭按钮
 					  shift: 1,
 					  shade: 0.5, //开启遮罩关闭
 					  content: '${pageContext.request.contextPath}/admin/communicationlogin.jsp',
 					  end: function(){
  	     					parent.layer.msg('登录成功', {
	    					    icon: 1,
	    					    time: 1000
	    					});
 					    }
 					});
			}	
		});
	})	
})
</script>
</head>
<body>
	<input type="hidden" name="id" value="${param.id }">
	<input type="hidden" name="name" value="${param.name }">
	<div class="text-c">
		<h1>添加沟通信息</h1>
		添加与【${param.name }】会员的沟通信息..<br>
	</div>
	<br>
	<div style="margin-left: 5%">
		沟通时间：<input type="text" id="time"
			onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',isShowClear:true,minDate:'%y-{%M-1}-%d',maxDate:'%y-%M-%d'})"
			class="input-text Wdate" style="width: 120px;">&nbsp;&nbsp;*默认为今天<br>
		<br>
		<script id="editor" type="text/plain"
			style="width:200px;height: 200px;"></script>
	</div>
	<br>
	<input type="button" value="确认" class="btn btn-default"
		style="margin-left: 80%">
	<br>
	<span id="infoshow" style="margin-left: 45%"></span>

</body>
</html>
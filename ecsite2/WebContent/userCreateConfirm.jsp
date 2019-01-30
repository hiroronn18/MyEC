<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="desctiption" content=""/>
	<meta name="keywords" content=""/>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<title>UserCreateConfirm画面</title>

	<style type="text/css">
		body{
			margin:0;
			padding:0;
			line-height:1.6;
			letter-spacing:1px;
			font-familiy:Verdana,Helvetica,sans-serif;
			font-size:12px;
			color:#333;
			background:#fff;
		}
		table{
			text-align:center;
			margin:0 auto;
		}

		#top{
			width:780px;
			margin:30px auto;
			border:1px solid #333;
		}

		#header{
			width:100%;
			height:80px;
			background-color:black;
		}

		#main{
			width:100%;
			height:500px;
			text-align:center;
		}

		#footer{
			width:100%;
			height:80px;
			background-color:black;
			clear:both;
		}

		#text-center{
			display:inline-block;
			text-align:center;
		}
	</style>
	<script type="text/javascript">
		function submitAction(url){
			$('form').attr('action',url);
			$('form').submit();
		}
	</script>
</head>
<body>
	<div id ="header">
		<div id = "pr"></div>
	</div>
	<div id = "main">
		<div id = "top">
			<p>UserCreateConfirm</p>
		</div>
		<div>
			<h3>登録する内容は以下でよろしいですか。</h3>
			<table>
				<s:form action = "UserCreateCompleteAction">

					<tr id = "box">
						<td>
							<label>ログインID</label>
						</td>
						<td>
							<s:property value="loginUserId" escape="false"/>
						</td>
					</tr>
					<tr id = "box">
						<td>
							<label>ログインPASS</label>
						</td>
						<td>
							<s:property value="loginPassword" escape="false"/>
						</td>
					</tr>
					<tr id = "box">
						<td>
							<label>ユーザー名</label>
						</td>
						<td>
							<s:property value="userName" escape="false"/>
						</td>
					</tr>
					<tr>
						<td><input type ="button" value="戻る" onclick="submitAction('UserCreateAction')"/></td>
						<td><input type ="button" value="完了" onclick="submitAction('UserCreateCompleteAction')"/></td>
					</tr>
				</s:form>
			</table>
		</div>
	</div>
	<div id = "footer">
		<div id = "pr"></div>
	</div>

</body>
</html>
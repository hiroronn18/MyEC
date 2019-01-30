<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="desctiption" content=""/>
	<meta name="keywords" content=""/>
	<title>UserList画面</title>

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
</head>
<body>
	<div id ="header">
		<div id = "pr"></div>
	</div>
	<div id = "main">
		<div id = "top">
			<p>UserList</p>
		</div>
		<div>
			<s:if test="userInfoList == null"><h3>商品情報はありません。</h3>
			</s:if>
			<s:elseif test="userInfoList != null">
				<h3>ユーザー情報一覧</h3>
				<table border="1">
				<tr>
					<th>ID名</th>
					<th>パスワード</th>
					<th>ユーザー名</th>
					<th>登録日</th>
					<th>更新日</th>
				</tr>
				<s:iterator value="userInfoList">
					<tr>
						<td><s:property value="loginId"/></td>
						<td><s:property value="loginPass"/></td>
						<td><s:property value="userName"/></td>
						<td><s:property value="insertDate"/></td>
						<td><s:property value="updatedDate"/></td>
					</tr>
				</s:iterator>
				</table>
				<s:form action = "UserListDeleteConfirmAction">
					<s:submit value="削除"/>
				</s:form>
			</s:elseif>
			<div id = "text-right">
				<p>管理画面へ戻る場合は<a href = '<s:url action = "AdminAction"/>'>こちら</a></p>
			</div>

		</div>

	</div>
	<div id = "footer">
		<div id = "pr"></div>
	</div>

</body>
</html>
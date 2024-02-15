<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.my.dto.BoardDto"%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f8f8;
        padding: 20px;
    }
    h1 {
        color: #333;
        font-size: 24px;
        margin-bottom: 20px;
    }
    form {
        background-color: #fff;
        padding: 20px;
        width:810px;
        border-radius: 5px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }
	input[name="title"] {
	    width: 600px;
	    height: 36px;
	    padding: 10px;
	    border: 1px solid #ccc;
	    border-radius: 5px;
	    font-size: 15px;
	    margin-bottom: 10px;
    }
    textarea{
	    width: 600px;
	    height: 171px;
	    padding: 10px;
	    border: 1px solid #ccc;
	    border-radius: 5px;
	    font-size: 15px;
	    margin-bottom: 40px;
	    margin-left: 45px;
    }
    input[type="submit"] {
        background-color: #4CAF50;
        margin-left: 706px;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 14px;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
<body>
	<h1>게시글 수정하기</h1>
	<form action="${pageContext.request.contextPath}/board/modify/action" method="post">
		<input type="hidden" name="bno" value="${dto.bno }"/>
		제목 : <input type="text" name="title" value="${dto.title }"/> <br/>
		<textarea name="content">${dto.content}</textarea> <br/>
		<input type="submit" value="수정완료"/>
	</form>
</body>
</html>
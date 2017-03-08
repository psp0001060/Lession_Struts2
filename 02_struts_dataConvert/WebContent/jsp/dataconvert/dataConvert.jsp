<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>数据转换</title>
</head>
<body>
<form action="paramsIntercepterAction" method = "post">
<h1>基本类型(类属性):</h1><br>
电话：<input type="text" name = "phoneNumber"><br>

<h1>复合类型(Person属性):</h1>
	姓名：<input type="text" name = "person.name"><br>
		生日：<input type="text" name = "person.birthday"><br>1992-11-11
	薪资：<input type="text" name = "person.salary"><br>
	爱好：篮球 <input type="checkbox" name="person.fav" value="篮球">排球 
	<input type="checkbox" name="person.fav" value="排球">足球
	 <input type="checkbox" name="person.fav" value="足球"><br>
	性别：男<input type="radio" name="person.sex" value="男">&nbsp;&nbsp;&nbsp;&nbsp;
	女<input type="radio" name="person.sex" value="女">

		<input type="submit" value= "提交">
</form>

	<!-- 生日：<input type="text" name = "birthday"><br>
	薪资：<input type="text" name = "salary"><br>
	爱好：篮球 <input type="checkbox" name="fav" value="篮球">篮球 <input type="checkbox" name="fav" value="足球">足球 <input type="checkbox" name="fav" value="足球">
	性别：男<input type="radio" name="sex" value="女">&nbsp;&nbsp;&nbsp;&nbsp;女<input type="radio" name="sex" value="女">
 -->
</body>
</html>
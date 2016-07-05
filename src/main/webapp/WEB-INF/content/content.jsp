<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>

<style type="text/css">
body, table {
	width: 1280px;
	heght: 1024px;
	font-size: 12px;
}

th, td {
	word-wrap: break-word;
	overflow: hidden /* for ff2 */
}

table {
	width: 900px;
	table-layout: fixed;
	empty-cells: show;
	border-collapse: collapse;
	margin: 0 auto;
	table-layout: fixed;
}

table {
	border: 1px solid #000;
	color: #000;
}

table th {
	background-repeat: repeat-x;
	height: 30px;
}

table td, table th {
	border: 1px solid #000;
	height: 30px;
	padding: 0 1em 0;
	line-height: 30px
}

table tr:nth-child(2) th:nth-child(1) {
	width: 20%;
}

table tr:nth-child(2) th:nth-child(2) {
	width: 5%;
}

table tr:nth-child(2) th:nth-child(3) {
	width: 5%;
}

table tr:nth-child(2) th:nth-child(4) {
	width: 5%;
}

table tr:nth-child(2) th:nth-child(5) {
	width: 5%;
}

table tr:nth-child(2) th:nth-child(6) {
	width: 20%;
}

table tr:nth-child(2) th:nth-child(7) {
	width: 5%;
}

table tr:nth-child(2) th:nth-child(8) {
	width: 5%;
}

table tr:nth-child(2) th:nth-child(9) {
	width: 5%;
}

table tr:nth-child(2) th:nth-child(10) {
	width: 5%;
}

table tr.alter {
	background-color: #f5fafe;
}
</style>
<body>
	<!-- 中文成绩表单 开始  -->
	<div class="grade-chs">
		<table>
			<tr>
				<th colspan="1">姓名</th>
				<th colspan="3"><s:property value="result.XsXj.xm" /></th>
				<th colspan="1">性别</th>
				<th colspan="3"><s:property value="result.XsXj.xb" /></th>
				<th colspan="2" rowspan="4"></th>
			</tr>
			<tr>
				<th colspan="1">学号</th>
				<th colspan="3"><s:property value="result.XsXj.xh" /></th>
				<th colspan="1">班级</th>
				<th colspan="3"><s:property value="result.XsXj.bjh" /></th>
			</tr>
			<tr>
				<th colspan="1">专业</th>
				<th colspan="3"><s:property value="result.XsXj.zym" /></th>
				<th colspan="1">院系</th>
				<th colspan="3"><s:property value="result.XsXj.xsm" /></th>
			</tr>
			<tr>
				<th colspan="1">入学日期</th>
				<th colspan="3"><s:property value="result.XsXj.rxrq" /></th>
				<th colspan="1">毕业日期</th>
				<th colspan="3"><s:property value="result.XsXj.byrq" /></th>
			</tr>
			<tr>
				<th colspan="10">课程成绩</th>
			</tr>
			<tr>
				<th>课程名称</th>
				<th>学分</th>
				<th>成绩</th>
				<th>课程属性</th>
				<th>考试学期</th>
				<th>课程名称</th>
				<th>学分</th>
				<th>成绩</th>
				<th>课程属性</th>
				<th>考试学期</th>
			</tr>
			<s:iterator status="st" value="result.XsCj" id="list">
				<s:if test="#st.odd||#st.first">
					<tr>
				</s:if>
				<td style="width: 30%"><s:property value="id.kcm" /></td>
				<td><s:property value="xf" /></td>
				<td><s:property value="kccj" /></td>
				<td><s:property value="kcsxmc" /></td>
				<td><s:property value="kssj" /></td>
				<s:if test="#st.last && #st.odd">
					<td align="center">----------------------------</td>
					<td align="center"></td>
					<td align="center"></td>
					<td align="center"></td>
					<td align="center"></td>
					</tr>
				</s:if>
				<s:elseif test="#st.last && #st.even">
					</tr>
					<tr>
						<td>----------------------------</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td>----------------------------</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
				</s:elseif>
				<s:elseif test="#st.even">
					</tr>
				</s:elseif>
			</s:iterator>
		</table>
	</div>
	<!-- 中文成绩表单 结束 -->
	
	<!-- 英文成绩表单 开始 -->
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<td width="20%" alig="center">글제목</td>
<td><input type="text value="${article.title}" name="title" id="i_title" disabled/>
</td></tr>
<tr><td width="20%" align="center"> 글내용 </td>
<td><textarea rows="20" cols="60" name="content"
id ="i_content" disabled />${article.content}</textarea>
</td></tr>

<c:if test="${not empty article.imageFileName && article.imageFileName!='null' }">
<tr>
<td width="20%" align="center" rowspan="2">이미지</td>
<td>
<input type="hidden" name="originalFileNmae" value="${article.imageFileName }"/>
<img src="${contextPath}/download.do?"imageFileName=${article.imageFileName }&articleNO=${article.articleNO}" id="preview" /><br>

</td></tr>
 }

</tr>
</c:if>

</body>
</html>
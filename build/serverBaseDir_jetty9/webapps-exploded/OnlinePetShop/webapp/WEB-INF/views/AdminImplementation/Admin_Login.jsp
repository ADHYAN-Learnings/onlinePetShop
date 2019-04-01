<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
<c:url var="adminLoginData" value="/auth/login_check?targetUrl=${targetUrl}"/>
<form:form id="adminLoginForm" name="adminLoginForm" action="${adminLoginData}" method="POST">

<table>
  <tr>
   <td>Enter Username:-</td>
   <td><input type="text" name="username" value="" ></td>
  </tr>
  <tr>
    <td>Enter Password:-</td>
    <td><input type="password" name="password" value=""></td>
  </tr>
  <tr>
    <td></td> 
    <td><input type="submit" value="submit"></td>
  </tr>
  <c:if test="${param.error eq 'exist' }">
   <tr style="color:red;"><td colspan="2"><h3><b>Invalid username and password</b></h3></td></tr>
  </c:if>
</table>
</form:form>


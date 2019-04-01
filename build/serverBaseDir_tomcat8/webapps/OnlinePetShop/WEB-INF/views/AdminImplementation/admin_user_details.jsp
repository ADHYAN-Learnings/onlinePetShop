<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
   <div style="overflow-x:auto;">
	<table  class="VanderTable">
	  <thead>
	    <tr>
	      <th>Actions</th>
	      <th>User Id</th>
	      <th>User Name</th>
	      <th>LandMark</th>
	      <th>PinCode</th>
	      <th>District</th>
	      <th>City</th>
	      <th>State</th>
	      <th>Role Type</th>
        </tr>
      </thead>
	  <tbody>
 	   <c:forEach var="item" items="${_user_details.list}">
         <tr>
         <td><a href="<%=request.getContextPath()%>/admin_single_user_information?userId=${item.userId}">
         <i style="cursor:pointer" class="fa fa-pencil"></i></a></td>
         <td>${item.userId}</td>
         <td>${item.userName}</td>
         <td>${item.landMark} </td>
         <td>${item.pincode}</td>
         <td>${item.district}</td>
         <td>${item.city}</td>
         <td>${item.state}</td>
         <td>${item.roleType}</td>  
        </tr>     
       </c:forEach> 
      </tbody>
     </table>
     </div>
	<br>
	<hr>
	<script type="text/javascript">
		$("#home").removeClass("active");
		$("#unsold_pet").removeClass("active");
		$("#user_details").addClass("active");
		$("#payment_details").removeClass("active");
	</script>
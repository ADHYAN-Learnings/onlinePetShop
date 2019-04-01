<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
   <div style="overflow-x:auto;">
	<table  class=" VanderTable">
	  <thead>
	    <tr>
	      <th>Actions</th>
	      <th>User Name</th>
	      <th>Breed</th>
	      <th>Payment Type</th>
	      <th>CardHolder Name</th>
	      <th>Account Number</th>
	      <th>Price</th>
	      <th>Payment Status</th>
	      <th>Role Type</th>
        </tr>
      </thead>
	  <tbody>
 	    <c:forEach var="item" items="${_transaction_information.list}"> 
         <tr>
         <td><a href="<%=request.getContextPath()%>/admin_single_transaction_information?userDetailsBean.userId=${item.userDetailsBean.userId}">
         <i style="cursor:pointer" class="fa fa-pencil"></i></a></td>
         <td>${item.userDetailsBean.userName} </td>
         <td>${item.petBean.breed}</td>
         <td>${item.paymentStatusBean.paymentType}</td>
         <td>${item.paymentStatusBean.cardHolderName}</td>
         <td>${item.paymentStatusBean.accountNumber}</td>
         <td>${item.petBean.price}</td>
         <td>${item.paymentStatusBean.paymentStatus}</td>
         <td>${item.userDetailsBean.roleType}</td>  
        </tr>     
        </c:forEach> 
      </tbody>
     </table>
     </div>
	<br>
	<hr>
	<script type="text/javascript">
	$(document).ready(function(){
		$("#home").removeClass("active");
		$("#unsold_pet").removeClass("active");
		$("#user_details").removeClass("active");
		$("#transaction_details").addClass("active");
	});
	</script>
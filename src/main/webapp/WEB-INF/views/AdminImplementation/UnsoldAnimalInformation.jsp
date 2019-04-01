<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
   <div class="row">
     <div class="col-10 col-sm-10 col-md-10 col-lg-10 col-xl-10"></div>
     <div class="col-2 col-sm-2 col-md-2 col-lg-2 col-xl-2">
     <a style="cursor:pointer;" href="<%=request.getContextPath() %>/add_product_Information">
     <i Style="font-size:150%;" class="fa fa-plus"></i></a></div>
   </div>
   <div style="overflow-x:auto;height:34em;">
	<table  class="VanderTable">
	  <thead>
	    <tr>
	      <th>Actions</th>
	      <th>Id</th>
	      <th>Breed</th>
	      <th>Price</th>
	      <th>Status</th>
	      <th>Gender</th>
        </tr>
      </thead>
	  <tbody>
 	   <c:forEach var="item" items="${_unsold_animal.list}">
         <tr>
         <td><a href="<%=request.getContextPath()%>/Unsold_pet_edit_details?petBeans.id=${item.petBeans.id}">
         <i style="cursor:pointer" class="fa fa-pencil"></i></a></td>
         <td>${item.petBeans.id}</td>
         <td>${item.petBeans.breed}</td>
         <td>${item.petBeans.price}</td>
         <td>${item.petBeans.status}</td>
         <td>${item.gender}</td>  
        </tr>     
       </c:forEach> 
      </tbody>
     </table>
     </div>
	<br>
	<hr>
	<script type="text/javascript">
		$("#home").removeClass("active");
		$("#unsold_pet").addClass("active");
		$("#user_details").removeClass("active");
		$("#payment_details").removeClass("active");   
	</script>
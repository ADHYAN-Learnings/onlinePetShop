<%-- <style>
 body{
  background-color:white;
  color:black;
 }

</style>
<br/><br/><br/><br/>
 ${_pet_Description_Beans.petBeans.breed} --%>
 <%@ include file="../../tagLibraries/tagLibraries.jsp"%>
<%@ page import="org.framework.functionalInterfaceImplementation.LoginAuthenticationExist" %>

<spring:url value="${_pet_Description_Beans.petBeans.imagePath }" var="image"/>

 
  <div class="row">
    <div class="col-1 col-sm-1 col-md-1 col-lg-1 col-xl-1"></div>
    <div class="col-5 col-sm-5 col-md-5 col-lg-5 col-xl-5">
     <div class="large-image">
       <img src="${image}" alt="Mountains" style="width:100%;height:100%;">
       <h4>${_pet_Description_Beans.petBeans.breed }</h4>
       <p>${_pet_Description_Beans.petBeans.price }</p> 
       <div class="container">
           <a class="btn btn-danger"  id="buy"href="<%=request.getContextPath() %>/payment?id=${_pet_Description_Beans.description_Id}
           &imagePath=${_pet_Description_Beans.petBeans.imagePath }&price=${_pet_Description_Beans.petBeans.price }&breed=${_pet_Description_Beans.petBeans.breed}">Buy</a>
         
           <button type="button" class="btn btn-success" onclick="javascript:history.go(-1)">Back</button>             
       </div>  
     </div></div>
     
    <div class="col-5 col-sm-5 col-md-5 col-lg-5 col-xl-5">
    <div style="padding-top:20%;padding-bottom:10%;text-align:left;">
       <div id="OverviewDescription" class="row"><h4>overview:</h4><p>${_pet_Description_Beans.description }</p></div>
       <div class="row"><h4>Gender: </h4><p>${_pet_Description_Beans.gender }</p></div>
       <div class="row"><h4>Food: </h4><p>${_pet_Description_Beans.food }</p></div>
       <div class="row"><h4>MedicalCondition: </h4><p>${_pet_Description_Beans.medicalCondition }</p></div>
    </div>
    </div>
    <div class="col-1 col-sm-1 col-md-1 col-lg-1 col-xl-1"></div>
   
 </div>
 <c:if test="${!_pet_Description_Beans.loginExist}">
  <script>
  $("#login").modal("show");
	$.gritter.add({
			title :"Function Status :)",
			text :"You are not logged in. Please Log in.",
			fade_in_speed:"medium",
			fade_out_speed:1000
			
		});
  </script>
</c:if> 
<script type="text/javascript">
  $(document).ready(function(){
	 var description =$("#OverviewDescription").html().replace("02","<br/><br/>02");
	 $("#OverviewDescription").html(description);
  });
</script> 
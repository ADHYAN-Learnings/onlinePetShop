<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
<spring:url value="${_pet_Description_Beans.pet.imagePath }" var="image"/>
  <div class="row">
    <div class="col-1 col-sm-1 col-md-1 col-lg-1 col-xl-1"></div>
    <div class="col-5 col-sm-5 col-md-5 col-lg-5 col-xl-5">
     <div class="large-image">
       <img src="${image}" alt="Mountains" style="width:100%;height:100%;">
       <h4>${_pet_Description_Beans.pet.breed }</h4>
       <p>${_pet_Description_Beans.pet.price }</p> 
       <div class="container">
           <a class="btn btn-danger" href="<%=request.getContextPath() %>/payment?id=${_pet_Description_Beans.description_Id}
           &imagePath=${_pet_Description_Beans.pet.imagePath }&price=${_pet_Description_Beans.pet.price }&breed=${_pet_Description_Beans.pet.breed}">Buy</a>
         
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
<script type="text/javascript">
  $(document).ready(function(){
	 var description =$("#OverviewDescription").html().replace("02","<br/><br/>02");
	 $("#OverviewDescription").html(description);
	 
  });
</script>
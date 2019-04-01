<%@ include file="../../tagLibraries/tagLibraries.jsp"%>

<c:choose>

 <c:when  test="${not empty _product_description_details.petBeans.id }">
   <c:url var="upload" value="/admin_edit_unsold_animals" ></c:url>
   <c:set var="submitButton" value ="UPDATE"></c:set>  
 </c:when>
 
 <c:otherwise>
  <c:url var="upload" value="/admin_add_unsold_animals"></c:url>
  <c:set var="submitButton" value ="SUBMIT"></c:set>
 </c:otherwise>
 
</c:choose>

<form:form id="product_information_details" name="product_information_details" modelAttribute ="_product_description_details" 
 enctype="multipart/form-data" method="POST" action="${upload}" >
 <div class="form-body">
   
   <div class="row">
    <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
     <div class="form-group">
     <label class="control-label">Breed</label>
     <form:input path="petBeans.breed" class="form-control" />
    </div>
  </div>  
  
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
   <label class="control-label">Add Image</label>
   <form:input type="file" class="form-control" path="petBeans.file" />
   </div>
  </div> 
      
 </div> 
 <div class="row"> 
 
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
   <label class="control-label">Price</label>
   <form:input class="form-control" path="petBeans.price"/>
   </div>
  </div> 
  
   <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
    <div class="form-group">
     <label class="control-label">Gender</label>
   <%--   <form:input class="form-control" path="gender"/> --%>
     <form:select class="form-control" path="gender">
       <form:option value="Male">Male</form:option>
       <form:option value="Female">Female</form:option>
     </form:select>
    </div>
  </div>
  
  </div>
  <div class="row">
  
    <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
     <div class="form-group">
      <label class="control-label">Food</label>
      <form:textarea class="form-control" path="food" rows="5"/>
     </div>
    </div>
    
    <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
     <div class="form-group">
      <label class="control-label">Description</label>
      <form:textarea class="form-control" path="description" rows="5"/>
     </div>
    </div> 
     
  </div>
  <div class="row">
  
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
     <div class="form-group">
      <label class="control-label">Medical Condition</label>
      <form:textarea class="form-control" path="medicalCondition" rows="5"/>
     </div>
   </div>
  
  </div>  
 
 <form:hidden path="petBeans.id"/>
 <div class="container">
    <button type="submit" class="btn btn-primary">${submitButton}</button>
    <button type="button" class="btn btn-success" onclick="javascript:history.go(-1)">BACK</button>
 </div>  
 </div>
 
</form:form>
<script type="text/javascript">
      $("#home").removeClass("active");
      $("#unsold_pet").addClass("active");
      $("#user_details").removeClass("active");
      $("#payment_details").removeClass("active");   
</script>



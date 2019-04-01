<%@ include file="../../tagLibraries/tagLibraries.jsp"%>

<form:form id="user_information_details" name="user_information_details" modelAttribute="_user_information_details" action="" onsubmit="" data-target="">
 <div class="form-body">
 
 <div class="row">
     <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
     <div class="form-group">
      <label class="control-label">User Id</label>
      <form:input class="form-control" path="userId" />
     </div>
    </div>  
   
    <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
     <div class="form-group">
      <label class="control-label">User Name</label>
      <form:input class="form-control" path="userName"/>
     </div>
   </div> 
   </div>
   
   <div class="row">
   <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
     <div class="form-group">
      <label class="control-label">Land Mark</label>
      <form:input class="form-control" path="landMark"/>
     </div>
   </div>
   
    <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">    
     <div class="form-group">
      <label class="control-label">Pincode</label>
      <form:input class="form-control" path="pincode"/>
    </div>
   </div>
   </div> 
   
   <div class="row">
   <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
     <div class="form-group">
      <label class="control-label">District</label>
      <form:input class="form-control" path="district"/>
     </div>
   </div>
   
    <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
     <div class="form-group">
      <label class="control-label">City</label>
      <form:input class="form-control" path="city"/>
     </div>
   </div>
   </div>
   
   <div class="row">
   <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">   
     <div class="form-group">
      <label class="control-label">State</label>
      <form:input class="form-control" path="city"/>
     </div>
   </div>
   
    <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">    
     <div class="form-group">
      <label class="control-label">Role Type</label>
      <form:input class="form-control" path="roleType"/>
    </div>    
   </div>
   </div>
  
   <div class="row">
   <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
    <div class="form-body">
     <div class="form-group">
      <button type="button" class="btn btn-success" onclick="javascript:history.go(-1)">Back</button>
     </div>
   </div></div></div></div> 
</form:form>
<script type="text/javascript">
 $(document).ready(function(){
	 $('input').attr('readonly', true); 
	 
	 $("#home").removeClass("active");
	 $("#unsold_pet").removeClass("active");
	 $("#user_details").addClass("active");
	 $("#payment_details").removeClass("active");
 });
</script> 
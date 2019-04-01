<%@ include file="../../tagLibraries/tagLibraries.jsp"%>

 <form:form id="transaction_information_details" name="transaction_information_details" action="">
 <div class="form-body">
 
 <div class="row">
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">User Id</label>
    <input type="text" class="form-control" name="userId" id="userId" value="${_transaction_single_transaction_details.userDetailsBean.userId}"/>   
   </div>
  </div>
  
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">User Name</label>
    <input type="text" class="form-control" name="userName" id="userName" value="${_transaction_single_transaction_details.userDetailsBean.userName}"/>   
   </div>
  </div>
 </div>
 
 <div class="row">
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">Pincode</label>
    <input type="text" class="form-control" name="pincode" id="pincode" value="${_transaction_single_transaction_details.userDetailsBean.pincode}"/>   
   </div>
  </div>
  
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">District</label>
    <input type="text" class="form-control" name="district" id="district" value="${_transaction_single_transaction_details.userDetailsBean.district}"/>   
   </div>
  </div>
 </div>
 
 <div class="row">
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">City</label>
    <input type="text" class="form-control" name="city" id="city" value="${_transaction_single_transaction_details.userDetailsBean.city}"/>   
   </div>
  </div>
  
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">State</label>
    <input type="text" class="form-control" name="state" id="state" value="${_transaction_single_transaction_details.userDetailsBean.state}"/>   
   </div>
  </div>
 </div>
 
 <div class="row">
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">Breed</label>
    <input type="text" class="form-control" name="userId" id="userId" value="${_transaction_single_transaction_details.petBean.breed}"/>   
   </div>
  </div>
  
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">Price</label>
    <input type="text" class="form-control" name="userName" id="userName" value="${_transaction_single_transaction_details.petBean.price}"/>   
   </div>
  </div>
 </div>
 
  <div class="row">
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">Payment Type</label>
    <input type="text" class="form-control" name="paymentType" id="paymentType" value="${_transaction_single_transaction_details.paymentStatusBean.paymentType}"/>   
   </div>
  </div>
  
  <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="form-group">
    <label class="control-label">CardHolder Name</label>
    <input type="text" class="form-control" name="cardHolderName" id="cardHolderName" value="${_transaction_single_transaction_details.paymentStatusBean.cardHolderName}"/>   
   </div>
  </div>
 </div>
 
  <div class="row">
  <div class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4">
   <div class="form-group">
    <label class="control-label">Account Number</label>
    <input type="text" class="form-control" name="accountNumber" id="accountNumber" value="${_transaction_single_transaction_details.paymentStatusBean.accountNumber}"/>   
   </div>
  </div>
  
  <div class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4">
   <div class="form-group">
    <label class="control-label">Payment Status</label>
    <input type="text" class="form-control" name="paymentStatus" id="paymentStatus" value="${_transaction_single_transaction_details.paymentStatusBean.paymentStatus}"/>   
   </div>
  </div>
 
  <div class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4">
   <div class="form-group">
    <label class="control-label">Role Type</label>
    <input type="text" class="form-control" name="roleType" id="roleType" value="${_transaction_single_transaction_details.userDetailsBean.roleType}"/>   
   </div>
  </div>
 </div>
 
  <div class="row">
   <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
    <div class="form-body">
     <div class="form-group">
      <button type="button" class="btn btn-success" onclick="javascript:history.go(-1)">Back</button>
     </div>
   </div></div></div>
 </div> 
</form:form>
<script type="text/javascript">
 $(document).ready(function(){
	 $('input').attr('readonly', true);
	
	 $("#home").removeClass("active");
	 $("#unsold_pet").removeClass("active");
	 $("#user_details").removeClass("active");
	$("#transaction_details").addClass("active");	
 });
</script> 
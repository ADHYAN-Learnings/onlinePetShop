<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
 <meta charset="utf-8" />
<div class="container">
 <div class="modal fade" id="newUserDetails">
   <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content bg-warning border-warning">
        <c:url var="saveUserDetails" value="/loginDetails/saveNewUserDetails"/> 
       <form:form id="userDetailsForm" name="userDetailsForm" action="${saveUserDetails }" method="post">
        
        <div class="modal-header">
          <h4 class="modal-title">User Details</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <div class="row">
        <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
        <div class="form-body">
         <div class="form-group">
          <label for="userName" class="badge badge-pill"><b>Username/EmailId</b></label>
          <input type="text" class="form-control" placeholder="Enter Username or EmailId" id="userName" name="userName" required>
         </div></div></div>
         
         <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
         <div class="form-group">
          <label for="password" class="badge badge-pill"><b>Password</b></label>
          <input type="password" class="form-control" placeholder="Enter Password" id="password"  name="password" required>
         </div></div></div>
         
         <div class="form-group">
          <label for="LandMark" class="badge badge-pill"><b>LandMark</b></label>
          <input type="text" class="form-control" placeholder="Enter LandMark" id="LandMark" name="LandMark" required>
         </div>
         
         <div class="form-group">
          <label for="Pincode" class="badge badge-pill"><b>Pincode</b></label>
          <input type="text" class="form-control" placeholder="Enter Pincode" id="Pincode" name="Pincode" required>
         </div>
         
         <div class="form-group">
          <label for="district" class="badge badge-pill"><b>District</b></label>
          <input type="text" class="form-control" placeholder="Enter District" id="district" name="district" required>
         </div>
         
         <div class="form-group">
          <label for="city" class="badge badge-pill"><b>City</b></label>
          <input type="text" class="form-control" placeholder="Enter City" id="city" name="city" required>
         </div>
         
         <div class="form-group">
          <label for="state" class="badge badge-pill"><b>state</b></label>
          <input type="text" class="form-control" placeholder="Enter state" id="state" name="state" required>
         </div>
         
         <div class="form-group">
               <button type="button" id="newUserDetailsSubmit" class="form-control btn btn-primary">Submit</button>
             </div>
        
       </form:form>
    </div>
   </div>
 </div>
 <script type="text/javascript">
  
   $(document).ready(function(){
	 	 $("#newUserDetailsSubmit").click(function (e){
	 		 e.preventDefault();
	 		$("#userDetailsForm").ajaxSubmit({
	 		    beforeSubmit : function(formData, jqForm, options) {
	 	 	 			       return true;
	 		    },
	 			success:function(responseText){
	 				$("#newUserDetails").modal("hide");
	 				$("#login").modal();
	 				$.gritter.add({
	 	 				title :"Function Status",
	 	 				text  :"UserDetails saved successfully",		
	 	 				fade_in_speed:"fast",
	 	 				fade_out_speed:500
	 	 				
	 	 			});
	 				$.gritter.add({
	 	 				title :"Function Status",
	 	 				text  :"Please Sig in",		
	 	 				fade_in_speed:"medium",
	 	 				fade_out_speed:1000
	 	 				
	 	 			});
	 			},
	 			error:function(){
	 				$.gritter.add({
	 	 				title :"Function Status",
	 	 				text  :"UserDetails not saved. Please try after sometime.",		
	 	 				fade_in_speed:"medium",
	 	 				fade_out_speed:1000
	 	 				
	 	 			});
	 			}
	 		});
	 	}); 
   });
 </script>
</div>
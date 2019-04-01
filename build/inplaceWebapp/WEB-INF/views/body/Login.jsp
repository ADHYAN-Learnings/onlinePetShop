<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
<div class="container">
  <div class="modal fade" id="login">
    <div class="modal-dialog modal-dialog-centered ">
    
      <div class="modal-content  bg-warning border border-warning">
        <div class="row">
         <div class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4 modal-sideHeader ">
          <div class="form-group">
               <h1>Login</h1>
               <br/><br/>
              <span>Get Access to your Orders, Wishlist and Recommendations</span> 
             </div>
         </div>
         <div class="col-7 col-sm-7 col-md-8 col-lg-7 col-xl-7 ">
          <c:url var="loginData" value="/auth/login_check?targetUrl=${targetUrl}"/>
           <form:form id="loginForm" name="loginForm" action="${loginData}" method="POST">
            <div class="form-body">
            
             <div class="form-group">
              <label for="username" class="badge badge-pill"><b>Username</b></label>
              <input type="text" class="form-control" placeholder="Enter Username" id="username" name="username" required>
             </div>
             
             <div class="form-group">
              <label for="password" class="badge badge-pill"><b>Password</b></label>
              <input type="password" class="form-control" placeholder="Enter Password" id="password" name="password" required>
             </div>
             
             <div class="form-group">
              <table>
                <tr>
                  <td>Remember Me:</td>
                  <td><input type="checkbox" class="form-control"  id="remember-me" name="remember-me"></td>
                </tr>
              </table>
             </div>
  
            
             <div class="form-group">
               <button type="button" id="loginSubmit" class="form-control btn btn-primary">Login</button>
             </div>
             
             <div class="form-group">
               <button type="button" id="newUserLogin" class="form-control btn btn-default">New to Pet Shop?Sign up</button>
             </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> 
            </div>
           </form:form>
         </div>
         <div class="col-1 col-sm-1 col-md-1 col-lg-1 col-xl-1">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
         </div>
        </div>
      </div> 
    </div>
  </div>
  <script type="text/javascript">
  $(document).ready(function(){
	 	  $("#loginSubmit").click(function (e){
	 		 e.preventDefault();
	 		 $("#loginForm").ajaxSubmit({
	 	 		beforeSubmit : function(formData, jqForm, options) {
	 	 			return true;
	 	 		},
	 	 		success : function(responseText) {
	 	 			$("#login").modal("hide");
	 	 			$.gritter.add({
	 	 				title :"Login successfully :)",
	 	 				fade_in_speed:"medium",
	 	 				fade_out_speed:1000
	 	 				
	 	 			});
	 	 		},
	 	 		error: function(){
	 	 			$.gritter.add({
	 	 				title :"Login Failed! :(",
	 	 				text  :"Please try again",		
	 	 				fade_in_speed:"medium",
	 	 				fade_out_speed:1000
	 	 				
	 	 			});
	 	 		}
	 	 	});
	 	  });
	 	
});



  
  </script>
</div>
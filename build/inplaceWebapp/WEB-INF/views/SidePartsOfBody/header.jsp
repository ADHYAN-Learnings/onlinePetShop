    <div  class="row header fixed-top">
      <div class="col-1 col-sm-1 col-md-1 col-lg-1 col-xl-1"></div>
      <div class="col-4 col-sm-4 col-md-4 col-lg-4 col-xl-4"></div>
      <div class="col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3"></div>
      <div class="col-2 col-sm-2 col-md-2 col-lg-2 col-xl-2"></div>
      <div class="col-2 col-sm-2 col-md-2 col-lg-2 col-xl-2">
         <nav class="navbar navbar-expand-sm navbar-dark">
           <ul class="navbar-nav">
             <li class="nav-item">
               <a class="nav-link" href="<%=request.getContextPath() %>">Home</a>
             </li>
             <li class="nav-item">
               <a class="nav-link" data-toggle="modal" id="loginlink">Login</a>
             </li>
             <li class="nav-item">
               <a class="nav-link" data-toggle="modal" id="logoutLink">Logout</a>
             </li>
           </ul>
         </nav>
     </div></div>
     <jsp:include page="../../views/body/Login.jsp"></jsp:include>
     <jsp:include page="../../views/body/new_user_details.jsp"></jsp:include>
     
     <script type="text/javascript">
     /*when use will click the Login link or want to buy something and user is not logged in then for sign in popup displaying  */
         $(document).ready(function(){
	        $("#loginlink").click(function(){
		    $("#login").modal(); 
	     });
	  
     /* when user will click the new to pet shop button then to close the log in pop up and open user details popup */	  
	    $("#newUserLogin").click(function(){
			 $("#login").modal("hide");
			 $("#newUserDetails").modal();
		 });
     
     
          $("#logoutLink").click(function(e){
        	 e.preventDefault();
        	 
      		$.ajax({
	 			type:"GET",
	 			url:"<%=request.getContextPath() %>/logout",
	 			success:function(){
	 				$.gritter.add({
	 	 				title :"Logout Successfully :)",
	 	 				fade_in_speed:"medium",
	 	 				fade_out_speed:500
	 	 			});
	 				window.location="/OnlinePetShop/";
	 			},
	 			error:function(){
	 				$.gritter.add({
	 	 				title :"Logout Failed :)",
	 	 				text  :"Please try again",
	 	 				fade_in_speed:"medium",
	 	 				fade_out_speed:500 
	 	 			});
	 			}
	 		});
         }); 
      });
  </script>
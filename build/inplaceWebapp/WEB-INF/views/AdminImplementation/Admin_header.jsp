<div  class="row">
  <div class="header-color col-9 col-sm-9 col-md-9 col-lg-9 col-xl-9"></div>
  <div class="header-color col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3">
    <nav class="navbar navbar-expand-sm navbar-dark">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath() %>">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" data-toggle="modal" id="adminLogoutLink">Logout</a>
       </li>
     </ul>
   </nav>
</div></div>

<script type="text/javascript">
 
 $(document).ready(function(){
	 
	 $("#adminLogoutLink").click(function(e){
    	 
  		$.ajax({
 			type:"GET",
 			url:"<%=request.getContextPath() %>/logout",
 			success:function(){
 				window.location="/OnlinePetShop/admin";
 			},
 			error:function(){
 			}
 		});
     }); 
	 
 });

</script>
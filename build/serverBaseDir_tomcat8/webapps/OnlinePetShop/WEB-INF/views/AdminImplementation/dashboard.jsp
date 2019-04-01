<div class="container border-topSpace">
<div class="row">
 <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="dashboard-stat blue-madison">
	 <div class="visual">
		<i class="fa fa-comments"></i>
	 </div>
	 <div class="details">
	  <div class="number">
       ${_product_count_details.totalNotSoldAnimals }
	  </div>
	 <div class="desc">
		Total # of unsold animals
	 </div>
	 </div>
	 <a class="more" href="<%=request.getContextPath() %>/admin_unsold_animals">
	  View more <i class="m-icon-swapright m-icon-white"></i>
	 </a>
   </div>
</div>
 <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="dashboard-stat red-intense">
	 <div class="visual">
		<i class="fa fa-bar-chart"></i>
	 </div>
	 <div class="details">
	  <div class="number">
        ${_product_count_details.totalUser }
	  </div>
	 <div class="desc">
		Total # User
	 </div>
	 </div>
	 <a style="cursor:pointer;" class="more" href="<%=request.getContextPath() %>/admin_user_details">
	  View more <i class="m-icon-swapright m-icon-white"></i>
	 </a>
   </div>
</div>
				

</div>
<div class="row">
 <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
   <div class="dashboard-stat purple-plum">
	 <div class="visual">
		<i class="fa fa-bar-chart"></i>
	 </div>
	 <div class="details">
	  <div class="number">
         ${_product_count_details.totalSoldAnimals }
	  </div>
	 <div class="desc">
		Total # Transaction animals
	 </div>
	 </div>
	 <a class="more" href="<%=request.getContextPath() %>/admin_transaction_details">
	  View more <i class="m-icon-swapright m-icon-white"></i>
	 </a>
   </div>
</div> 
</div>
<script type="text/javascript">
 $(document).ready(function(){
	$("#home").addClass("active");
	$("#unsold_pet").removeClass("active");
	$("#user_details").removeClass("active");
	$("#payment_details").removeClass("active");   
 });
 
</script>
</div>
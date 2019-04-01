<div class="wrapper">
   <nav id="sidebar">
     <div class="sidebar-header"><h3>Online Pet Shop</h3></div>
       <ul class="list-unstyled components">
         <li id="home">
           <a href="<%=request.getContextPath() %>/admin_index"><i class="fa fa-home"></i>Home</a>
         </li>
         <li id="unsold_pet"><a href="<%=request.getContextPath() %>/admin_unsold_animals">
         <i class="fa fa-hand-o-right">
         </i>UnSold Animals</a>
         </li>
         <li id="user_details"><a href="<%=request.getContextPath() %>/admin_user_details">
         <i class="fa fa-hand-o-right">
         </i>User Details</a>
         </li>
         <li id="transaction_details"><a href="<%=request.getContextPath() %>/admin_transaction_details">
         <i class="fa fa-hand-o-right"></i>Transaction Details</a>
         </li>
       </ul>
   </nav>
</div>
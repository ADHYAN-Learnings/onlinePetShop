 <%@ include file="../../tagLibraries/tagLibraries.jsp"%>

<div class="container" style="padding-top:10%;padding-bottom:5%">     
  <div class="row">
      
    <c:forEach var="item" items="${_pet_Beans.list}">
      <spring:url value="${item.imagePath}" var="image"/>
      <div class="column ">
        <div class="content">
          <a style="cursor:pointer;" href="<%=request.getContextPath() %>/description?description_Id=${item.id}">
           <img src="${image}" alt="Mountains" style="width:100%;height:100%;">
           <h4>${item.breed } : ${item.price }</h4>
          </a>
        </div></div>       
      </c:forEach>
     </div>
</div>
<c:if test="${ !empty _pet_Beans.productMessage }">
  <script>
 /*  var productMessage = ${_pet_Beans.productMessage}; */
/*  $(document).ready(function(){
	 
 }); */
 $(document).ready(function(){
	 $.gritter.add({
			title :"${ _pet_Beans.productMessage }",
			text  :"Please checkout another pet",		
			fade_in_speed:"medium",
			fade_out_speed:1000
			
		});

 });
	  </script>
</c:if>
  
 
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
 
 
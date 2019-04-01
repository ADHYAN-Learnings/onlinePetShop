<%@ include file="../../tagLibraries/tagLibraries.jsp"%>

<div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 border">

 <c:url var="savePaymentData" value="/savePaymentData"></c:url>
 
 
 <form:form id="_payment_status_id" modelAttribute="payment_status_beans" action="${savePaymentData}" data-target="${saved_Records }">
 <spring:url value="${pet_status_beans.imagePath }" var="image"/>  
     
     <div class="row"> 
     <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
       <div style="text-align:center">
       <img src="${image}" alt="Mountains" style="width:100%;height:100%;">
       <h4>${pet_status_beans.breed }</h4>
       <p>${pet_status_beans.price }</p>
     </div>
     </div>
     
     <div class="col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6">
       <div class="form-body">
       
         <div class="form-group">
           <form:label class="badge badge-pill" path="paymentType">Payment Type :</form:label>
           <form:input class="form-control" path="paymentType"/>
         </div>
         
          <div class="form-group">
           <form:label class="badge badge-pill" path="cardHolderName">Card Holder's Name :</form:label>
           <form:input class="form-control" path="cardHolderName"/>
         </div>
         
          <div class="form-group">
           <form:label class="badge badge-pill" path="accountNumber">Account Number :</form:label>
           <form:input class="form-control" path="accountNumber"/>
         </div>
          <form:hidden path="petId" value="${pet_status_beans.id}"/>
         <div class="container">
           <button type="submit" class="btn btn-primary">Submit</button>
           <button type="button" class="btn btn-success" onclick="javascript:history.go(-1)">Back</button>
         </div>
       </div>
       
     </div></div>
 </form:form>
</div>
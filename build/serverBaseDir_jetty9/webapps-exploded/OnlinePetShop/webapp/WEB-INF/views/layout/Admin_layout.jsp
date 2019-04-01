<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd"> 

<html>
 <head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
    
  <script type="text/javascript" src="<spring:url value="/resources/core/js/jquery-3.3.1.min.js"/>"></script> 
  <script type="text/javascript" src="<spring:url value="/resources/core/js/jquery.form.js"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/core/js/jquery-ui.min.js"/>"></script>
 
 <script type="text/javascript" src="<spring:url value="/resources/core/js/popper.min.js"/>"></script>
 <script type="text/javascript" src="<spring:url value="/resources/core/js/util.js"/>"></script>
 <script type="text/javascript" src="<spring:url value="/resources/core/js/modal.js"/>"></script>
 <script type="text/javascript" src="<spring:url value="/resources/core/js/collapse.js"/>"></script>
 <script type="text/javascript" src="<spring:url value="/resources/core/js/tooltip.js"/>"></script>
 <script type="text/javascript" src="<spring:url value="/resources/core/js/popover.js"/>"></script>
  
  
 <script type="text/javascript" src="<spring:url value="/resources/core/js/bootstrap.bundle.js"/>"></script>
 <script type="text/javascript" src="<spring:url value="/resources/core/js/bootstrap.bundle.min.js"/>"></script>
 <script type="text/javascript" src="<spring:url value="/resources/core/js/bootstrap.js"/>"></script>
 <script type="text/javascript" src="<spring:url value="/resources/core/js/bootstrap.min.js"/>"></script>

  <script type="text/javascript" src="<spring:url value="/resources/core/js/jquery.gritter.js"/>"></script> 
  <script type="text/javascript" src="<spring:url value="/resources/core/js/jquery.gritter.min.js"/>"></script>
  
  <script type="text/javascript" src="<spring:url value="/resources/core/js/index.js"/>"></script>
  <script type="text/javascript" src="<spring:url value="/resources/core/js/vandertable.min.js"/>"></script>
  
  
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap-grid.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap-grid.min.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap-reboot.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap-reboot.min.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap.min.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/jquery.gritter.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/admin_customize.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/sidebarMenu.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/componentRounded.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/font-awesome/css/font-awesome.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/VanderTable.css"/>">
  
  
  <title><tiles:insertAttribute name="title" ignore="true" /></title>
 </head>
 <body>
  <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 no-padding">
   <div class="row">
   <div class="col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3 no-padding">
     <tiles:insertAttribute name="sideMenu"/>
   </div>
   <div class="col-9 col-sm-9 col-md-9 col-lg-9 col-xl-9 no-padding">
    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12"> 
     <tiles:insertAttribute name="header"/>
    </div>
    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 "> 
      <tiles:insertAttribute name="body"/>
    </div>
    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">  
      <tiles:insertAttribute name="footer"/>
    </div> 
   </div>
   </div>
  </div>
 </body>
</html>

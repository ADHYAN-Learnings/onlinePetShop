<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd"> 

<html>
 <head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
    
  <script type="text/javascript" src="<spring:url value="/resources/core/js/jquery-3.3.1.min.js"/>"></script> 
  <script type="text/javascript" src="<spring:url value="/resources/core/js/jquery.form.js"/>"></script>
 
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
 
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap-grid.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap-grid.min.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap-reboot.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap-reboot.min.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/bootstrap.min.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/Customize.css"/>">
  <link rel="stylesheet" href="<spring:url value="/resources/core/css/jquery.gritter.css"/>">
 
 
  <title><tiles:insertAttribute name="title" ignore="true" /></title>
 </head>
 <body>
   <tiles:insertAttribute name="header"/>
   <tiles:insertAttribute name="body"/>
   <tiles:insertAttribute name="footer"/>
 </body>
</html>
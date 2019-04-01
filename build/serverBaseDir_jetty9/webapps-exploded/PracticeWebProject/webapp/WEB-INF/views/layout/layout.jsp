<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ include file="../../tagLibraries/tagLibraries.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd"> 

<html>
 <head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <spring:url value="/resources/core/css/bootstrap-grid.css" var="bootstrapGridCss"/>
  <spring:url value="/resources/core/css/bootstrap-grid.min.css" var="bootstrapGridMinCss"/>
  <spring:url value="/resources/core/css/bootstrap-reboot.css" var="bootstrapRebootCss"/>
  <spring:url value="/resources/core/css/bootstrap-reboot.min.css" var="bootstrapRebootMinCss"/>
  <spring:url value="/resources/core/css/bootstrap.css" var="bootstrapCss"/>
  <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapMinCss"/>
  <spring:url value="/resources/core/css/Customize.css" var="customizeCss"/>
  
  <spring:url value="/resources/core/css/bootstrap-grid.css.map" var="bootstrapGridCssMap"/>
  <spring:url value="/resources/core/css/bootstrap-grid.min.css.map" var="bootstrapGridMinCssMap"/>
  <spring:url value="/resources/core/css/bootstrap-reboot.css.map" var="bootstrapRebootCssMap"/>
  <spring:url value="/resources/core/css/bootstrap-reboot.min.css.map" var="bootstrapRebootMinCssMap"/>
  <spring:url value="/resources/core/css/bootstrap.css.map" var="bootstrapCssMap"/>
  <spring:url value="/resources/core/css/bootstrap.min.css.map" var="bootstrapMinCssMap"/>
  
  <spring:url value="/resources/core/js/bootstrap.bundle.js" var="bootstrapBundleJs"/>
  <spring:url value="/resources/core/js/bootstrap.bundle.min.js" var="bootstrapBundleMinJs"/>
  <spring:url value="/resources/core/js/bootstrap.js" var="bootstrapJs"/>
  <spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapMinJs"/>
  
  <spring:url value="/resources/core/js/bootstrap.bundle.js.map" var="bootstrapBundleJsMap"/>
  <spring:url value="/resources/core/js/bootstrap.bundle.min.js.map" var="bootstrapBundleMinJsMap"/>
  <spring:url value="/resources/core/js/bootstrap.js.map" var="bootstrapJsMap"/>
  <spring:url value="/resources/core/js/bootstrap.min.js.map" var="bootstrapMinJsMap"/>
  
  <spring:url value="/resources/core/js/jquery.js" var="jqueryJs"/>
  <spring:url value="/resources/core/js/jquery.min.js" var="jqueryMinJs"/>
  <spring:url value="/resources/core/js/jquery.slim.js" var="jquerySlimJs"/>
  <spring:url value="/resources/core/js/jquery.slim.min.js" var="jquerySlimMinJs"/>
  
  <spring:url value="/resources/core/js/commonCode.js" var="commonCodeJs"/>
  
  <link rel="stylesheet" href="${bootstrapGridCss}">
  <link rel="stylesheet" href="${bootstrapGridMinCss}">
  <link rel="stylesheet" href="${bootstrapRebootCss}">
  <link rel="stylesheet" href="${bootstrapRebootMinCss}">
  <link rel="stylesheet" href="${bootstrapCss}">
  <link rel="stylesheet" href="${bootstrapMinCss}">
  <link rel="stylesheet" href="${customizeCss}">
  
  <link rel="stylesheet" href="${bootstrapGridCssMap}">
  <link rel="stylesheet" href="${bootstrapGridMinCssMap}">
  <link rel="stylesheet" href="${bootstrapRebootCssMap}">
  <link rel="stylesheet" href="${bootstrapRebootMinCssMap}">
  <link rel="stylesheet" href="${bootstrapCssMap}">
  <link rel="stylesheet" href="${bootstrapMinCssMap}">
   
  <script type="text/javascript" src="${bootstrapBundleJs}"></script>
  <script type="text/javascript" src="${bootstrapBundleMinJs}"></script>
  <script type="text/javascript" src="${bootstrapJs}"></script>
  <script type="text/javascript" src="${bootstrapMinJs}"></script>
  
  <script type="text/javascript" src="${bootstrapBundleJsMap}"></script>
  <script type="text/javascript" src="${bootstrapBundleMinJsMap}"></script>
  <script type="text/javascript" src="${bootstrapJsMap}"></script>
  <script type="text/javascript" src="${bootstrapMinJsMap}"></script>   
  
  <script type="text/javascript" src="${jqueryJs}"></script>
  <script type="text/javascript" src="${jqueryMinJs}"></script>
  <script type="text/javascript" src="${jquerySlimJs}"></script>
  <script type="text/javascript" src="${jquerySlimMinJs}"></script>
  
  <script type="text/javascript" src="${commonCodeJs}"></script>
  
  <title><tiles:insertAttribute name="title" ignore="true" /></title>
 </head>
 <body>
   <tiles:insertAttribute name="header"/>
   <tiles:insertAttribute name="body"/>
   <tiles:insertAttribute name="footer"/>
 </body>
</html>
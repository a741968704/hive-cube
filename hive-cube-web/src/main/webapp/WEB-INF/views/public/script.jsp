<%@ page pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="/hc/media/js/public/jquery.js" type="text/javascript"></script>
<script src="/hc/media/js/public/bootstrap.min.js"
	type="text/javascript"></script>
<script src="/hc/media/js/public/raphael.min.js" type="text/javascript"></script>
<script src="/hc/media/js/public/morris.min.js" type="text/javascript"></script>
<script src="/hc/media/js/public/navbar.js" type="text/javascript"></script>
<script src="/hc/media/js/public/bootstrap-switch.min.js" type="text/javascript"></script>
<script src="/hc/media/js/public/bootstrap-treeview.min.js" type="text/javascript"></script>
<%
	String[] loader = request.getParameterValues("loader");
	if (loader == null) {
		return;
	}
	for (String s : loader) {
%>
<script src="/hc/media/js/<%=s%>"></script>
<%
	}
%>

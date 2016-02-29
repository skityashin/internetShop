<%--
  Created by IntelliJ IDEA.
  User: Skityashin Vladimir
  Date: 22.02.2016
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
  <title><tiles:insertAttribute name="title"/></title>
  <%--<title><tiles:getAsString name="title" /></title>--%>
</head>
<body>
<!-- Header -->
<tiles:insertAttribute name="header"/>
<!-- Body -->
<tiles:insertAttribute name="body"/>
<!-- Footer -->
<tiles:insertAttribute name="footer"/>
</body>
</html>
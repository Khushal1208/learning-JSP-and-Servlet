<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Welcome to Servlet Tutorial for YouTube</title>
<link rel="stylesheet" href="<%=application.getContextPath()%>/CSS/style.css" />
</head>
<body>
    <div class="container">
        <%@ include file="menu.jsp" %>
        <h1>Welcome to Servlet Crash Course</h1>
        <p>This is a very informational video about servlet.</p>

        <form action="<%=application.getContextPath()%>/third" method="post">
            <input name="message" type="text" placeholder="Enter text here">
            <button type="submit">Submit</button>
        </form>

    </div>
    <script src="<%=application.getContextPath()%>/JS/script.js"></script>
</body>
</html>

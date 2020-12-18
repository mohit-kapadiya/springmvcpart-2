
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Style.html"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
<div class="container p-5">
    <div class="card mx-auto mt-5 bg-white" style="width: 60%;height: 80%">
        <div class="card-header text-center">
            <h1>Enter Name</h1>
        </div>
        <div class="card-body">
            <form action="submit" method="post">
                <div class="form-group mx-auto">
                    <input type="text" class="form-control" id="exampleFormControlFile1" name="name">
                </div>
                <div class="container mt-2 text-center">
                    <button class="btn btn-outline-success">submit</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</body>
</html>

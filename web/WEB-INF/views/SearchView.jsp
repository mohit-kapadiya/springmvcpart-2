<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<%@include file="Style.html" %>
<html lang="en">
<head>
    <title>Hello, world!</title>
</head>
<body>
<div class="container">
    <div class="card mx-auto mt-5 bg-white" style="width: 60%;height: 80%">
        <div class="card-header text-center">
            <h1>Search here</h1>
        </div>
        <div class="card-body">
            <form action="redirect" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" id="exampleInputText" aria-describedby="emailHelp"
                           name="queryBox">
                </div>
                <div class="container mt-2 text-center">
                    <button class="btn btn-outline-success">search</button>
                </div>
            </form>

        </div>
    </div>
</div>
</body>
</html>
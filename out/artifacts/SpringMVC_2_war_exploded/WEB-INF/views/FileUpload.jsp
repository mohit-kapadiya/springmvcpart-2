<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="Style.html" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
<div class="container p-5">
    <div class="card mx-auto mt-5 bg-white" style="width: 60%;height: 80%">
        <div class="card-header text-center">
            <h1>Upload File</h1>
        </div>
        <div class="card-body">
            <form action="uploadFile" method="post" enctype="multipart/form-data">
                <div class="form-group mx-auto">
                    <input type="file" class="form-control-file" id="exampleFormControlFile1" name="profile">
                </div>
                <div class="container mt-2 text-center">
                    <button class="btn btn-outline-success">Upload</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>

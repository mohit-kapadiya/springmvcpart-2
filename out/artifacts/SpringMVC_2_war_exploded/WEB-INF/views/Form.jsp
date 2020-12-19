<%@include file="Style.html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Complex Form</title>
</head>
<body>
<div class="container">
    <div class="card mx-auto mt-5 bg-white border-0" style="width:40%;height: 80%">
        <div class="card-header text-center border-0">
            <h1>Registration form</h1>
        </div>
        <div class="card-body border-0">
            <form action="handle">
                <div class="form-group mt-3">
                    <label for="exampleInputEmail1">Name</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                           placeholder="Enter name" name="name">
                </div>
                <div class="form-group mt-3">
                    <label for="exampleInputEmail1">Id</label>
                    <input type="number" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp"
                           placeholder="Enter id" name="id">
                </div>
                <div class="form-group mt-3">
                    <label for="exampleInputEmail1">Date of birth</label>
                    <input type="text" class="form-control" id="exampleInputEmail3" aria-describedby="emailHelp"
                           placeholder="dd/mm/yyyy" name="bDate">
                </div>
                <div class="form-group mt-3">
                    <label for="exampleFormControlSelect2">Select Course</label>
                    <select multiple class="form-control" id="exampleFormControlSelect2" name="course">
                        <option>Java</option>
                        <option>Python</option>
                        <option>Angular</option>
                        <option>React</option>
                        <option>Node</option>
                    </select>
                </div>
                <div class="form-group mt-3">
                    <label for="exampleFormControlSelect2">Select gender</label><br/>
                    <input type="radio" ErrorPagename="gender" value="male"> Male<br>
                    <input type="radio" name="gender" value="female"> Female<br>
                </div>
                <div class="form-group mt-3">
                    <label for="exampleFormControlSelect1">Select type</label>
                    <select class="form-control" id="exampleFormControlSelect1" name="type">
                        <option>Old Student</option>
                        <option>New Student</option>
                    </select>ErrorPage
                </div>
                <div class="card mt-3 ">
                    <p>Address</p>
                    <label for="exampleInputEmail1">Street</label>
                    <input type="text" class="form-control mt-2" id="exampleInputEmail4" aria-describedby="emailHelp"
                           placeholder="Enter street" name="address.street">
                    <label for="exampleInputEmail1">City</label>
                    <input type="text" class="form-control mt-2" id="exampleInputEmail5" aria-describedby="emailHelp"
                           placeholder="Enter city" name="address.city">
                </div>
                <div class="container mt-3 text-center">
                    <button class="btn btn-outline-success">submit</button>
                </div>
            </form>

        </div>
    </div>
</div>

</body>
</html>

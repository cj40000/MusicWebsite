<%@include file="head.jsp"%>
<html>
<body>
<h2>This will need to be tailored to show the correct results but for now this will be used to verify some results</h2>

<form class="form-inline" action="searchMusiciansInTheArea" method="get">

    <div class="form-group mx-sm-3 mb-2" >
        <label for="lastName" >Search for user by last name</label>
        <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name">
    </div>
    <button type="submit" class="btn btn-primary mb-2">Search</button>
</form>

</body>
</html>
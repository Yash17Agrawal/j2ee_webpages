<%-- 
    Document   : index
    Created on : Mar 4, 2017, 9:53:38 AM
    Author     : code_eagle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title></title>


	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body >

<nav class="navbar navbar-inverse navbar-fixed-top">

<div class="container-fluid">
	
	<!--logo-->
	<div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
	<a href="#" class="navbar-brand">My Bank</a>
	
        </div>
       
        <!--nav items-->
         <div>    
        <ul class="list-inline navbar-nav navbar-right">
                <%String name=(String)session.getAttribute("username");
                if(name == null )
        {
            name="LOGIN";
        }
            
                %>
                <li ><a href=http://localhost:8080/j2ee/Login_Signup/Login.jsp><%=name%></a></li>	
                <li ><a href=http://localhost:8080/j2ee/Login_Signup/Signup.html>Signup</a></li>
            
            </ul>
        </div>
	<div class="collapse navbar-collapse" id="myNavbar">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<!--<li ><a href=http://localhost:8080/j2ee/AddMoney/AddMoney.jsp>Add Money</a></li>-->
			<li ><a href="http://localhost:8080/j2ee/AddMoney">Transact</a></li>
			<li ><a href="#">Contact Us</a></li>

			<!--dripdown menu-->
			<li class="dropdown">
				<a href="#" class="dropdown-toogle" data-toggle="dropdown">My Profile <span class="caret"> </span></a>
				<ul class="dropdown-menu">
					<li ><a href="#">Settings</a></li>
					<li ><a href="#">View History</a></li>

					
				</ul>
			</li>
		</ul>
            
	</div>
</div>

</nav>


<div class="continer-fluid embed-responsive embed-responsive-16by9"">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="1.jpg" alt="Chania" class="img-responsive">
    </div>

    <div class="item">
      <img src="2.jpg" alt="Chania" class="img-responsive">
    </div>

    <div class="item">
      <img src="3.jpg" alt="Flower" class="img-responsive">
    </div>

    <div class="item">
      <img src="4.jpg" alt="Flower" class="img-responsive">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>
</body>
</html>
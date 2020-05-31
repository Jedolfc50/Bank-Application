<%-- 
    Document   : login
    Created on : May 30, 2020, 11:51:18 PM
    Author     : Jed Donkoh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Login Page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif;}
.w3-sidebar {
  z-index: 3;
  width: 250px;
  top: 43px;
  bottom: 0;
  height: inherit;
}
footer { font-size: .80em;
          font-style: italic;}
.box h3{
    color: white;
    text-transform: uppercase;
    font-weight: 500;
}
.box{
    width: 350px;
    padding: 40px;
    position: absolute;
    top: 40%;
    left: 38.55555555%;
    transform: translate(-50% -50%);
    background: #191919;
    text-align: center;
}
.box input[type= "text"],.box input[type= "password"]{
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #3498db;
    padding: 14px 10px;
    width: 200px;
    outline: none;
    color: white;
    border-radius: 24px;
    transition: 0.25s;
}
.box input[type="text"]:focus,.box input[type="password"]:focus{
    width: 280px;
    border-color: #2ecc71;
}
.box input[type="submit"]{
    border: 0;
    background: none;
    display: block;
    margin: 20px auto;
    text-align: center;
    border: 2px solid #2ecc71;
    padding: 14px 40px;
    width: 200px;
    outline: none;
    color: white;
    border-radius: 24px;
    transition: 0.25s;
    cursor: pointer;
}
.box input[type="submit"]:hover{
    background: #2ecc71;
    
}
</style>
    </head>
    <body>
       <!-- Navigation bar -->
<div class="w3-top">
  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-right w3-hide-large w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
    <a href="index.jsp" class="w3-bar-item w3-button w3-theme-l1">Home</a>
    <a href="contactUs.jsp" class="w3-bar-item w3-button w3-hide-small w3-hover-white">Contact Us</a>
  </div>
</div>
       <!-- Side bar -->
<nav class="w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-l5 w3-animate-left" id="mySidebar">
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-right w3-xlarge w3-padding-large w3-hover-black w3-hide-large" title="Close Menu">
    <i class="fa fa-remove"></i>
  </a>
  <h4 class="w3-bar-item"><b>Menu</b></h4>
  <a class="w3-bar-item w3-button w3-hover-black" href="index.jsp">Home</a>
  <a class="w3-bar-item w3-button w3-hover-black" href="contactUs.jsp">Contact Us</a>
</nav>
       <!-- Overlay effect when opening side bar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- Main content: shift it to the right by 250 pixels when the side bar is visible -->
<div class="w3-main" style="margin-left:250px">
    <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">Welcome Dear Customer</h1>
      <p>Please Login with your Customer Id and Password to view your<br>
          to view your current balance and account information. 
      </p>
    </div>
    <div class="w3-third w3-container">
      <p class="w3-border w3-padding-large w3-padding-32 w3-center">College funding should not be a problem to any student with the drive to attain a degree </p>
      <p class="w3-border w3-padding-large w3-padding-64 w3-center">Let us fix that situation and brighten your day. Get in contact with 
          us to book an appointment with one of our financial advisors to help qualify you
      for a loan</p>
    </div>
  </div>
    <form class="box" action="loginServlet" method="get">
        <h3 style=""> LOGIN</h3>
        <input type="text" name="userId" placeholder="Your User Id"/>
        <input type="password" name="userPass" placeholder="Your password"/>
        <input type="submit" name="submit" value="Login"/>
        <a href="createAcc.jsp">click this link to create an account</a>
        
        
        
    </form>
</body>
</html>


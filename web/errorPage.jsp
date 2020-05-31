<%-- 
    Document   : errorPage
    Created on : May 30, 2020, 11:34:07 PM
    Author     : Jed Donkoh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MeloBabk| Error Page</title>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="Style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <style type="text/css">
            nav ul{list-style-type: none;}
        nav li{display: inline;}
        nav a{
            border:5px inset #CCCCCC;
            width: 8em;
            display: inline-block;
            padding: 3px 15px;
            color: #FFFFFF;
            background-color: #000066;
            font-family: Arial,Helvetica, sans-serif;
            font-size: 1.5em;
            font-weight: inherit;
            font-style: italic;
            text-align: center;
            text-decoration: none;
        }
        nav a:link {color: #FFFFFF;}
        nav a:visited{color: #CCCCCC;}
        nav a:hover{
            color: #99FFCC;
            border:5px outset #99FFCC;
        }
        footer{
            font-size: .08em;
            font-style: italic;
        }
        body{
            background-image: url(Images/wallpaper1.jpg);
            background-repeat: no-repeat;
            background-size: cover;
        }
        
        </style>
    </head>
    <body>
        <div class="container-text-center">
        <header>
            <h1> Invalid Login</h1>
            
        </header>
        <h3> Please check your username and password and try again</h3>
        <nav>
            <ul>
                   <li><a href="login.jsp">Login</a></li>
            </ul>
        </nav>
        </div>
    </body>
  
</html>

<%-- 
    Document   : displayAccounts
    Created on : May 30, 2020, 11:25:48 PM
    Author     : Jed Donkoh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Business.account" %>
<%@page import="Business.customers" %>
<%@page import="Business.accountList"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Display| Accounts</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif;}
.w3-sidebar {
  z-index: 3;
  width: 250px;
  top: 43px;
  bottom: 0;
  height: inherit;
}
.box h3{
    color: white;
    text-transform: uppercase;
    font-weight: 500;
}
.box{
    width: 350px;
    padding: 40px;
    position: absolute;
    top: 20%;
    left: 38.55555555%;
    transform: translate(-50% -50%);
    background: white;
    text-align: center;
</style>
    </head>
    <body>
       <!-- Navigation bar -->
<div class="w3-top">
  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-right w3-hide-large w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
    <a href="#" class="w3-bar-item w3-button w3-theme-l1">Logo</a>
    <a href="#" class="w3-bar-item w3-button w3-hide-small w3-hover-white">About</a>
    <a href="#" class="w3-bar-item w3-button w3-hide-small w3-hide-medium w3-hover-white">Partners</a>
  </div>
</div>

<!-- Side bar -->
<nav class="w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-l5 w3-animate-left" id="mySidebar">
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-right w3-xlarge w3-padding-large w3-hover-black w3-hide-large" title="Close Menu">
    <i class="fa fa-remove"></i>
  </a>
  <h4 class="w3-bar-item"><b>Menu</b></h4>
  <a class="w3-bar-item w3-button w3-hover-black" href="index.jsp">Home</a>
</nav>

<!-- Overlay effect when opening side bar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>
    
    
    
                                                
                                       <% 
                                        System.out.println("In DisplayAccount jsp");
                                        customers c1;
                                        c1 = (customers)session.getAttribute("c1");
                                        c1.Display();
                                        account a1 = null;
                                        for(int x=0; x<c1.aList.count;x++){
                                            a1= c1.aList.accountList.get(x);
                                        
                                       
                                       %>

                <h3>Welcome back</h3>
                <%= c1.getCustFirstName()%>
                <%= c1.getCustLastName()%>
                <form class="box" action="accountLookup" method="get">

                    <table>
                        <tr>
                            <td>Account Number</td>
                            <td><input type="text" name="accTb" value="<%=a1.getAccountNo()%>"</td>
                        </tr><br>
                        <tr>
                            <td>Customer Id</td>
                            <td><input type="text" name="cId" value="<%=a1.getAccountId()%>"</td>
                        </tr><br>
                        <tr>
                            <td>Account Type</td>
                            <td><input type="text" name="accType" value="<%=a1.getAccountType()%>"</td>
                        </tr><br>
                        <tr>
                            <td>Account Balance</td>
                            <td><input type="text" name="accBal" value="<%=a1.getAccountBal()%>"</td>
                        </tr><br>
                        <tr>
                            <td><input type="submit" name="submitBtn" value="Submit"</td>
                            <td><input type="reset" name="resetBtn" value="Clear"</td>
                        </tr>



                                    <% } %>
                    </table>


                </form>
                    </body>
                </html>



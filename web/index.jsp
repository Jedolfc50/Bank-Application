<%-- 
    Document   : index
    Created on : May 30, 2020, 11:36:11 PM
    Author     : Jed Donkoh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Welcome Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <body>
        
<!-- Navigation bar (sit on top) -->
<div class="w3-top">
  <div class="w3-bar w3-white w3-wide w3-padding w3-card">
    <a href="#home" class="w3-bar-item w3-button"><b>CHATT</b> Bank</a>
    <!-- Float links to the right. Hide them on small screens -->
    <div class="w3-right w3-hide-small">
      <a href="login.jsp" class="w3-bar-item w3-button">Login</a>
      <a href="#about" class="w3-bar-item w3-button">About</a>
      <a href="#contact" class="w3-bar-item w3-button">Contact</a>
    </div>
  </div>
</div>

<!-- Header -->
<header class="w3-display-container w3-content w3-wide" style="max-width:1500px;" id="home">
  <img class="w3-image" src="Images/wallpaper4.jpg" alt="Architecture" width="1500" height="800">
  <div class="w3-display-middle w3-margin-top w3-center">
    <h1 class="w3-xxlarge w3-text-white"><span class="w3-padding w3-black w3-opacity-min"><b>Melo</b></span> <span class="w3-hide-small w3-text-light-grey">Bank</span></h1>
  </div>
</header>

<!-- Page content -->
<div class="w3-content w3-padding" style="max-width:1564px">

  <!-- Project Section -->
  <div class="w3-container w3-padding-32" id="projects">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Our Banking Ecosystem</h3>
  </div>

  <div class="w3-row-padding">
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Customer Satisfaction</div>
        <img src="Images/picture.jpg" alt="C.S" style="width:100%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Working Environment</div>
        <img src="Images/picture1.png" alt="House" style="width:100%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Loans and Support Plans</div>
        <img src="Images/picture2.jpg" alt="House" style="width:100%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Saving Systems</div>
        <img src="Images/picture3.jpg" alt="House" style="width:100%">
      </div>
    </div>
  </div>

  <div class="w3-row-padding">
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Financial Advising</div>
        <img src="Images/picture4.jpg" alt="House" style="width:99%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Customer Commitment</div>
        <img src="Images/picture6.jpg" alt="House" style="width:99%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Philosophy and Management</div>
        <img src="Images/picture7.jpg" alt="House" style="width:99%">
      </div>
    </div>
    <div class="w3-col l3 m6 w3-margin-bottom">
      <div class="w3-display-container">
        <div class="w3-display-topleft w3-black w3-padding">Goal Management</div>
        <img src="Images/picture5.png" alt="House" style="width:99%">
      </div>
    </div>
  </div>

  <!-- About Section -->
  <div class="w3-container w3-padding-32" id="about">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">About</h3>
    <p>The Melo Bank Corporation is an American multinational investment bank and financial services company based in Charlotte, North Carolina, with central hubs in New York City, London, Hong Kong, Minneapolis, and Toronto. CHATT Bank was formed through NationsBank's acquisition of BankAmerica in 1998. Wikipedia
        Customer service: 1 (800) 432-1000<br>
        Technical support: 1 (800) 933-6262<br>
        Credit card support: 1 (800) 732-9194<br>
        Stock price: BAC (NYSE) $26.47 -0.75 (-2.76%)<br>
        Aug 23, 4:00 PM EDT - Disclaimer<br>
        Headquarters: Charlotte, NC<br>
        Subsidiaries: CCA Securities, Merrill Edge, MORE<br>
        Did you know: MELO Bank is the ninth-largest bank in the world by total assets ($2,281.23 B). 
    </p>
  </div>

  <div class="w3-row-padding w3-grayscale">
    <div class="w3-col l3 m6 w3-margin-bottom">
      <img src="Images/jed.jpeg" alt="Personal Picture" style="width:100%">
      <h3>Jed Donkoh</h3>
      <p class="w3-opacity">CEO & Founder</p>
      <p>Jed Donkoh is the current CEO and founder of Melo Bank. Founded as a small business venture support, Melo Bank has grown to become
          a prominent banking institution worldwide offering a wide range of services.</p>
      <p><button class="w3-button w3-light-grey w3-block">Contact</button></p>
    </div>
      <!--
                        <div class="w3-col l3 m6 w3-margin-bottom">
                          <img src="/w3images/team1.jpg" alt="Jane" style="width:100%">
                          <h3>Jane Doe</h3>
                          <p class="w3-opacity">Architect</p>
                          <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
                          <p><button class="w3-button w3-light-grey w3-block">Contact</button></p>
                        </div>
                        <div class="w3-col l3 m6 w3-margin-bottom">
                          <img src="/w3images/team3.jpg" alt="Mike" style="width:100%">
                          <h3>Mike Ross</h3>
                          <Sp class="w3-opacity">Architect</p>
                          <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
                          <p><button class="w3-button w3-light-grey w3-block">Contact</button></p>
                        </div>
                        <div class="w3-col l3 m6 w3-margin-bottom">
                          <img src="/w3images/team4.jpg" alt="Dan" style="width:100%">
                          <h3>Dan Star</h3>
                          <p class="w3-opacity">Architect</p>
                          <p>Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
                          <p><button class="w3-button w3-light-grey w3-block">Contact</button></p>
                        </div>
  </div>

  <!-- Contact Section -->
  <div class="w3-container w3-padding-32" id="contact">
    <h3 class="w3-border-bottom w3-border-light-grey w3-padding-16">Contact</h3>
    <p>Lets get in touch and talk about your next project.</p>
    <form action="/action_page.php" target="_blank">
      <input class="w3-input w3-border" type="text" placeholder="Name" required name="Name">
      <input class="w3-input w3-section w3-border" type="text" placeholder="Email" required name="Email">
      <input class="w3-input w3-section w3-border" type="text" placeholder="Subject" required name="Subject">
      <input class="w3-input w3-section w3-border" type="text" placeholder="Comment" required name="Comment">
      <button class="w3-button w3-black w3-section" type="submit">
        <i class="fa fa-paper-plane"></i> SEND MESSAGE
      </button>
    </form>
  </div>
  
<!-- Image of location/map -->
<div class="w3-container">
  <img src="/w3images/map.jpg" class="w3-image" style="width:100%">
</div>

<!-- End page content -->
</div>


<!-- Footer -->
<footer class="w3-center w3-black w3-padding-16">
  <p>Powered by <a href="#" title="W3.CSS" target="_blank" class="w3-hover-text-green"> Melo Corporations</a></p>
</footer>
    </body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>  
   <link rel="stylesheet" type="text/css" href="css/style.css"/>  
</head> 
<style>
* {box-sizing: border-box;}
niv 
{  
    margin: 0;  
    padding: 0;  
    background-color:#6abadeba;  
    font-family: 'Arial';  
}  
.addMember{  
        width: 500px;  
        overflow: hidden;  
        margin: auto;  
        margin: 20 0 0 450px;  
        padding: 80px;  
        background: #23463f;  
        border-radius: 15px ;  
          
}  
h2{  
    text-align: center;  
    color: #277582;  
    padding: 20px;  
}  
label{  
    color: #08ffd1;  
    font-size: 17px;  
}  
#Uname{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
}  
#Pass{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
      
}  
#log{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 17px;  
    padding-left: 7px;  
    color: blue;  
  
  
}  
span{  
    color: white;  
    font-size: 17px;  
}  
a{  
    float: right;  
    background-color: grey;  
}   </style> 
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #e9e9e9;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}


.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #2196F3;
  color: white;
}
</style>

<body style="background-color:	#F0FFF0;">

<div class="topnav" style="background-color:#FFD700;">
  <a href="index"><h1>Hotel-Ping</h1></a>
  <i style='font-size:24px' class='fas'>&#xf56b;</i>

</div>
</body>
<div>
<h2>Registration Page</h2><br>    
    <div class="addMember">    
    <form action="memberInsert" method="post" >    
        <label><b>Email    
        </b>    
        </label>    
        <input type="text" id="mailId" placeholder="Enter Email">    
        <br><br>    
        <label><b>Name    
        </b>    
        </label>    
        <input type="text" id="userName" placeholder="Enter Name">    
        <br><br>    
        <label><b>Mobile no   
        </b>    
        </label>    
        <input type="text" id="mobNo" placeholder="Enter Mobile no">    
        <br><br>    
        <label><b>Password     
        </b>    
        </label>    
        <input type="password" id="pass" placeholder="Enter password">    
        <br><br>    
        <label><b>Conform Password     
        </b>    
        </label>    
        <input type="password" id="cpass" placeholder="Conform Password">    
        <br><br><b>Address     
        </b>    
        </label>    
        <input type="text" id="address" placeholder="Enter Address">    
        <br><br>    
        <label>
      <input type = "submit"  id="log" value = "Register">
</label>
</form>
</div>

</niv>
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
</html>
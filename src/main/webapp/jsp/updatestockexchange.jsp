<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.example.stockspring.model.StockExchange" pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Stock</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="/Style/style.css">
</head>
<body class="container">

 <h1 style="text-align: center;">STOCK MARKETING</h1><br><br><br>
       <div class="row">
               <a href="/logoutAdmin" class="btn">Logout</a>
        </div>
        <br>
        <div class="row">
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav col-lg-12 ">
                    <li class="col-lg-3"><a href="/importData">Import Data</a></li>
                    <li class="col-md-3"><a href="/company">Manage Company</a></li>
                       <li class="col-md-3"><a href="/stockExchangeList">Manage Exchange</a></li>
                     <li class="col-md-3"><a href="/ipodetaillist">Update IPO details</a></li>
                </ul>
            </nav>
        </div>
     
<form:form method="POST" action="/updatedStockExchangeDetail" modelAttribute="stockExchange" class="loginform">
<h2>Update Stock Exchange</h2>
 <!-- <h2 style="text-align: center;">SIGNUP</h2>--><br><br> 
 
<%
	StockExchange stockexchange = (StockExchange) request.getAttribute("stockexchangeList");
		%>
		
			<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-2 " for="stockExchangeId">Stockexchanges id:</label>
               <div class="col-md-6">
                    <form:input type="text" path="stockExchangeId" id="stockExchangeId" value="<%= stockexchange.getStockExchangeId()%>"  class="form-control input-sm" readonly="true"/>
                    <div class="has-error">
                        <form:errors path="stockExchangeId" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-2 " for="stockExchangeName">Stockexchanges Name:</label>
               <div class="col-md-6">
                    <form:input type="text" path="stockExchangeName" id="stockExchangeName" value="<%= stockexchange.getStockExchangeName()%>"  class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="stockExchangeName" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-2 control-lable" for="brief">Brief:</label>
               <div class="col-md-6">
                    <form:input type="text" path="brief" id="brief" value="<%= stockexchange.getBrief()%>" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="brief" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
   <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-2 control-lable" for="address">Address:</label>
               <div class="col-md-6">
                    <form:input type="text" path="address" id="address" value="<%= stockexchange.getAddress()%>" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="address" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
        
         <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-2 control-lable" for="remarks">remarks:</label>
               <div class="col-md-6">
                    <form:input type="text" path="remarks" id="remarks" value="<%= stockexchange.getRemarks()%>" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="remarks" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        

     <div class="row">
   
            <div class="col-md-2 col-md-offset-1">
            <input type="submit" value="Save" class="save">
   		   </div>
			<div class="col-md-2 col-md-offset-1">
   			 <input type="reset"  value="Clear" class="save">
    		</div>
    </div>
    </div>
</form:form>
</body>
</html>
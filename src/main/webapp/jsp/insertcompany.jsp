<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

 <h1 style="text-align: center;">STOCK MARKETING</h1>
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
            </nav>
        </div>
        <h2 style="text-align: center;">Create New Company</h2> <br>

<form:form method="POST" action="/insertCompany" modelAttribute="company">

	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 " for="companyName">Company Name:</label>
               <div class="col-md-5">
                    <form:input type="text" path="companyName" id="companyName"  class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="companyName" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
	<div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="ceo">CEO Name:</label>
               <div class="col-md-5">
                    <form:input type="text" path="ceo" id="ceo" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="ceo" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="boardOfDirectors">Board Members:</label>
               <div class="col-md-5">
                    <form:input type="text" path="boardOfDirectors" id="boardOfDirectors" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="boardOfDirectors" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
 
    <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="turnOver">TunOver:</label>
               <div class="col-md-5">
                    <form:input type="number" path="turnOver" id="turnOver" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="turnOver" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
  
  <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="briefWriteup">Brief Description:</label>
               <div class="col-md-5">
                    <form:input type="text" path="briefWriteup" id="briefWriteup" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="briefWriteup" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
   
  <div class="row">
            <div class="form-group col-md-12">
               <label class="col-md-3 control-lable" for="sectorId">sectorId:</label>
               <div class="col-md-5">
                    <form:input type="number" path="sectorId" id="sectorId" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="sectorId" class="text-danger"/>
                    </div>
                </div>
            </div>
        </div>
        
        
    <input type="submit"  value="Save" class="save">

</form:form>
</body>
</html>
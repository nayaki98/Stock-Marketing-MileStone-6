<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.example.stockspring.model.StockExchange" pageEncoding="ISO-8859-1"%>
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
<body>
    <h1 style="text-align: center;">STOCK MARKETING</h1>
    <div class="container">
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
        <br><br><br>
        
        
<% List stockexchangelist=(List)request.getAttribute("stockexchangelist"); %>

		<table class="table table-striped">
			<tr class="section">
				<th>Stock Exchange Id</th>
				<th>Stock Exchange Name</th>
				<th>BriefWriteup</th>
				<th>Address</th>
				<th>Remarks</th>
				<th></th>

			</tr>

			<%
				for (int i = 0; i < stockexchangelist.size(); i++) {
					StockExchange s = (StockExchange) stockexchangelist.get(i);
			%>
			<tr>
			<td><%= s.getStockExchangeId()%></td>
				<td><%= s.getStockExchangeName()%></td>
				<td><%= s.getBrief() %></td>
				<td><%= s.getAddress() %></td>
				<td><%= s.getRemarks() %></td>
				<td id="td2 ptext"> <a href="updateStockExchange?stockExchangeId=<%= s.getStockExchangeId()%>" ><button class="edit">Edit</button></a> 
          <a href="deleteStockExchange?stockExchangeId=<%= s.getStockExchangeId()%>" ><button class="edit">Delete</button></a></td>
			</tr>
			<% }%>

		</table></body>
</html>
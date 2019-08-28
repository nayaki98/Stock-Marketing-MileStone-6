<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.example.stockspring.model.IPODetail" pageEncoding="ISO-8859-1"%>
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
        
        <%
List ipodetaillist=(List)request.getAttribute("ipodetaillist");
%>


	<table class="table table-striped">
		 <tr class="section">
		 <th>Ipo Detail Id</th>
		   <th>Company Code</th>
		 	<th>Stock Exchange Id</th>
            <th>Price Per Share</th>
            <th>Open Date Time</th>
            <th>Total Shares</th>
            <th>Remarks</th>
            <th></th>
          
    </tr>

        <% for(int i=0;i<ipodetaillist.size();i++){
        	IPODetail ipo=(IPODetail)ipodetaillist.get(i);
	%>
 <tr >
 <td><%= ipo.getId()%></td>
<td><%= ipo.getCompanycode()%></td>
<td><%= ipo.getStockExchangeId() %></td>
<td><%= ipo.getPrice() %></td>
<td><%= ipo.getDateTime() %></td>
<td><%= ipo.getTotalShares() %></td>
<td><%= ipo.getRemarks() %></td>
<td> <a href="updateIpo?ipoId=<%= ipo.getId()%>" ><button class="edit">Edit</button></a> 
          <a href="deleteIpo?ipoId=<%= ipo.getId()%>" ><button class="edit">Delete</button></a></td>
</tr>

<% }%>
</table>  
  
</body>
</html>
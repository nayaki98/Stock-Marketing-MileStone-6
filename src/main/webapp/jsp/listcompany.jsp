<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,com.example.stockspring.model.Company" pageEncoding="ISO-8859-1"%>
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
   <link rel="stylesheet" href="/Style/style.css">
    
</head>

<body>
<form:form method="POST" action="/insertCompany" modelAttribute="company">
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
        <h3 style="text-align: center;">List of Companies</h3><br>
        <%
        List companyList=(List)request.getAttribute("companyList");
		%>
		
		<table class="table table-striped">
		 <tr class="section">
		 <th >CompanyCode</th>
            <th>CompanyName</th>
             <th >Borad Of Directors</th>
            <th >CEO</th>
            <th >BriefWriteup</th>
             <th >TurnOver</th>
             <!-- <th >Stock Code</th>
              <th >Sector Id</th> -->
           <th></th>
    </tr>

        <% for(int i=0;i<companyList.size();i++){
	Company c=(Company)companyList.get(i);
	%>
	
	 <tr>
            <td ><%= c.getCompanyCode() %></td>
            <td><%= c.getCompanyName() %></td>
             <td ><%= c.getBoardOfDirectors() %></td>
            <td ><%= c.getCeo() %></td>
            <td><%= c.getBriefWriteup() %></td>
             <td><%= c.getTurnOver() %></td>
             <%--  <td id="td2 ptext"><%= c.getStockCode() %></td>
               <td id="td2 ptext"><%= c.getSectorId() %></td> --%>
          <td id="td2 ptext"> <a href="updateCompany?companyCode=<%= c.getCompanyCode()%>" ><button class="edit">Edit</button></a> 
          <a href="deleteCompany?companyCode=<%= c.getCompanyCode()%>" ><button class="edit">Delete</button></a></td>
        </tr>
        <% }%>
     </table>
    </div>
   </form:form>
</body>

</html>
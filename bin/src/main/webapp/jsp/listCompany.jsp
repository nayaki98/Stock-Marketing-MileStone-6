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
   <link rel="stylesheet" href="Style/style.css">
    
</head>

<body>
    <h1 style="text-align: center;">STOCK MARKETING</h1>
    <div class="container">
        <div class="row">
            <button type="button" class="btn">Logout</button>
        </div>
        <br>
        <div class="row">
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav col-lg-12 ">
                    <li class="col-md-3"><a href="#">Import Data</a></li>
                    <li class="col-md-3"><a href="#">Manage Company</a></li>
                    <li class="col-md-3"><a href="#">Manage Exchange</a></li>
                    <li class="col-md-3"><a href="#">Update IPO details</a></li>
                </ul>
            </nav>
        </div>
        <h3 style="text-align: center;">List of Companies</h3><br>
        <%
        List companyList=(List)request.getAttribute("companyList");
		%>
		
		<table class="table">
		 <tr class="section">
		 <th id="td2 ptext"></th>
		 <th id="td2 ptext">CompanyCode</th>
            <th id="td2 ptext">CompanyName</th>
            <th id="td2 ptext">CEO</th>
            <th id="td2 ptext">BriefWriteup</th>
           <th></th>
    </tr>

        <% for(int i=0;i<companyList.size();i++){
	Company c=(Company)companyList.get(i);
	%>
	
	 <tr class="section">
            <td id="td2 ptext"><img src="Image/company-one.jpg" alt="company-one" class="img col-md-2"></td>
            <td id="td2 ptext"><%= c.getCompanyCode() %></td>
            <td id="td2 ptext"><%= c.getCompanyName() %></td>
            <td id="td2 ptext"><%= c.getCeo() %></td>
            <td id="td2 ptext"><%= c.getBriefWriteup() %></td>
           <td id="td2 ptext"> <input type="button" name="save" value="Edit" class="edit"></td>
        </tr>
        <% }%>
     </table>
    </div>
</body>

</html>
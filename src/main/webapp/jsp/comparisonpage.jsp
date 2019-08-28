<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
            <a href="/logoutUser" class="btn">Logout</a>
        </div>
        <br>
        <div class="row">
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav col-lg-12 ">
                     <li class="col-md-4"><a href="/ipo">IPOs</a></li>
                    <li class="col-md-4"><a href="/companyList">Compare Company</a></li>
                    <li class="col-md-4"><a href="/compareSectors">Compare Sectors</a></li>
                </ul>
            </nav>
        </div>
    <table>
            <tr>
                <th id="trid"> Select Company/Sector:</th>
                <td><select>
                        <option value="volvo">Company</option>
                        <option value="saab">Saab</option>
                        <option value="opel">Opel</option>
                        <option value="audi">Audi</option>
                    </select></td>
            </tr>
            <tr>
                <th id="trid">Select Stock Exchange:</th>
                <td><select>
                        <option value="BSE">BSE</option>
                        <option value="NSE">NSE</option>
                    </select></td>
            </tr>
            <tr>
                <th id="trid"> Company Name:</th>
                <td><input type="text" name="cname"></td>
            </tr>
            <tr>
                <th id="trid">From Period</th>
                <th><input type="date" name="date">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;To
                    Period&nbsp;&nbsp;&nbsp;&nbsp;</th>
                <th><input type="date" name="date"></th>
            </tr>
            <tr>
                <th id="trid"> Specify Periodicity:</th>
                <td><input type="date" name="cname"></td>
            </tr>
            <tr>
                <th id="trid"><input type="button" class="generate-map" name="save" value="Generate Map"></th>
            </tr>
        </table>
    </div>
</body>

</html>
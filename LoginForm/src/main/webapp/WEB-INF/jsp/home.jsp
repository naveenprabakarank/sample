<html>
<head>
</head>
<body>
    <h2>Submitted Student Info</h2>
    <% String name=(String)request.getAttribute("name"); %>
    <% String age=(String)request.getAttribute("age"); %>
    <% String id=(String)request.getAttribute("id"); %>
    <table>
        <tr>
            <td>Name :</td>
            
            <td><%= name %></td>
        </tr>
        <tr>
            <td>Age :</td>
            <td><%= age %></td>
        </tr>
        <tr>
            <td>Id :</td>
            <td><%= id %></td>
        </tr>
    </table>
</body>
</html>
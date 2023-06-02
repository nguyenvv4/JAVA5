<%--
  Created by IntelliJ IDEA.
  User: nguyenvv4
  Date: 22/01/2023
  Time: 11:31
  To change this template use File | Settings | File Templates.
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<table class="table container">
    <thead>
        <tr>
            <td>ID CTSP</td>
            <td>Tên sản phẩm</td>
            <td>Màu sắc</td>
            <td>Giá bán</td>
            <td>Số lượng tồn</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${chiTietSanPhams}" var="ctsp">
            <tr>
                <td>${ctsp.id}</td>
                <td>${ctsp.sanPham.ten}</td>
                <td>${ctsp.mauSac.ten}</td>
                <td>${ctsp.giaBan}</td>
                <td>${ctsp.soLuongTon}</td>
                <td><a href="/cart/add?ctspId=${ctsp.id}" class="btn btn-primary">Add giỏ hàng session</a></td>
            </tr>
        </c:forEach>
    </tbody>

</table>
<a href="/cart/add1" class="btn btn-primary"> Xem giỏ hàng session</a>
</body>
</html>

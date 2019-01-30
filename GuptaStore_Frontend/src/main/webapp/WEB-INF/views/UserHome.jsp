<%@ page language="java" contentType="text/html"%>

<%@include file="Header.jsp" %>

<div class="container">
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
         <img src="<c:url value='/resources/images/img2.jpg' />" alt="Los Angeles" style="width:100%">
      </div>

      <div class="item">
        <img src="<c:url value='/resources/images/img3.jpg' />" alt="Chicago" style="width:100%;">
      </div>
   
      <div class="item">
        <img src="<c:url value='/resources/images/img1.jpg' />" alt="Chicago" style="width:100%;">
      </div>


      <div class="item">
        <img src="<c:url value='/resources/images/img4.jpg' />" alt="New york" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</br>
<center><h1 >Products </h1></center>

<center>
<div class="row">
  <c:forEach items = "${productList}" var="product" >

    <div class = "col-sm-4 col-md-3">
      <a href = "<c:url value="/totalProductDisplay/${product.productId}" />" class = "thumbnail">
         <img src="<c:url value="/resources/images/${product.productId}.png" />" alt = "Generic placeholder thumbnail">
      </a>
      
      <p align="center"> ${product.productName} </p>
      <p align="center"> Price : INR ${product.price}/- </p>
      <p align="center"> Stock : ${product.stock} </p>
      
    </div>     
  </c:forEach>
</div>  
</center>
</body>
</html>
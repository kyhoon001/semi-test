<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

  <div class="row">
     <form action="cartAdd.mc" method="get">
     
        <input type="hidden" name="product_id" value="${dbproduct.product_id}" id="product_id">
          <div class="col-md-6">
            <img src="images/${dbproduct.img }" alt="Image" class="img-fluid">
           
          </div>
          <div class="col-md-6">
            <h2 class="text-black">${dbproduct.name }</h2>
            <p>${dbproduct.description }</p>
            <p class="mb-4"></p>
            <p><strong class="text-primary h4">${dbproduct.price }</strong></p>
             <p>${dbproduct.soldamount }</p>
            <div class="mb-1 d-flex">
              
            </div>
            <div class="mb-5">
              <div class="input-group mb-3" style="max-width: 120px;">
              <div class="input-group-prepend">
                <button class="btn btn-outline-primary js-btn-minus" type="button">&minus;</button>
              </div>
              <input type="text" name="count" class="form-control text-center" value="1" placeholder="" aria-label="Example text with button addon" aria-describedby="button-addon1">
              <div class="input-group-append">
                <button class="btn btn-outline-primary js-btn-plus" type="button">&plus;</button>
              </div>
            </div>

            </div>
              
                 <input type="hidden" name="email" value=${email }>
            <p><button id="cartAdd" class="buy-now btn btn-sm btn-primary">장바구니</button></p>
         
          </div>
          </form>
        </div>
       
        <script>
        
        </script>
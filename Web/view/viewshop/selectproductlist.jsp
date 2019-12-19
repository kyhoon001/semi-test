<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script>
	
</script>



<c:forEach var="page" items="${pagination }">

	<div class="row">
		<div class="col-md-12 mb-5">
			<div class="float-md-left mb-4">
				<h2 class="text-black h5">Shop All</h2>
			</div>
			<div class="d-flex">
				<div class="dropdown mr-1 ml-md-auto">
					<button type="button"
						class="btn btn-secondary btn-sm dropdown-toggle"
						id="dropdownMenuOffset" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false">Latest</button>
					<div class="dropdown-menu" aria-labelledby="dropdownMenuOffset">
						<a class="dropdown-item" href="#">Men</a> <a class="dropdown-item"
							href="#">Women</a> <a class="dropdown-item" href="#">Children</a>
					</div>
				</div>
				<div class="btn-group">
					<button type="button"
						class="btn btn-secondary btn-sm dropdown-toggle"
						id="dropdownMenuReference" data-toggle="dropdown">Reference</button>
					<div class="dropdown-menu" aria-labelledby="dropdownMenuReference">
						<a class="dropdown-item"
							href="ascname.mc?curPage=1&search=${search}">Name, A to Z</a> <a
							class="dropdown-item"
							href="descname.mc?curPage=1&search=${search}">Name, Z to A</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item"
							href="ascprice.mc?curPage=1&search=${search}">Price, low to
							high</a> <a class="dropdown-item"
							href="descprice.mc?curPage=1&search=${search}">Price, high to
							low</a>
					</div>
				</div>
			</div>
		</div>
	</div>

</c:forEach>

<div class="row mb-5">
	<c:forEach var="page" items="${pagination }">
		<c:forEach var="p" items="${plist }">
			<div class="col-sm-6 col-lg-4 mb-4" data-aos="fade-up">
				<div class="block-4 text-center border">
					<figure class="block-4-image">
						<a href="shop-single.mc?id=${p.product_id}"><img src="images/${p.img }"
							alt="Image placeholder" class="img-fluid"></a>
					</figure>
					<div class="block-4-text p-4">
						<h3>
							<a href="shop-single.mc?id=${p.product_id}">${p.name }</a>
						</h3>
						<p class="mb-0">${p.description }</p>
						<p class="text-primary font-weight-bold">$${p.price }</p>

					</div>
				</div>
			</div>

		</c:forEach>
		</div>
		<div class="row mb-5">
		<div class="row" data-aos="fade-up" style="margin: 0 auto;">
			<div class="col-md-12 text-center">
				<div class="site-block-27">
					<ul>
						<c:choose>
							<c:when test="${page.curPage > 1}">
								<li><a
									href="${filter }.mc?curPage=${page.curPage-1}&search=${search}">&lt;</a></li>
							</c:when>
							<c:otherwise>
							</c:otherwise>
						</c:choose>

						<c:forEach var="r" begin="${page.startPage }"
							end="${page.endPage }">
							<c:choose>
								<c:when test="${page.curPage eq r}">
									<li class="active"><a
										href="${filter }.mc?curPage=${r}&search=${search}">${r}</a></li>
								</c:when>
								<c:otherwise>
									<li><a href="${filter }.mc?curPage=${r}&search=${search}">${r}</a></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						<c:choose>
							<c:when test="${page.endcheck}">
								<li><a
									href="${filter }.mc?curPage=${page.curPage+1}&search=${search}">&gt;</a></li>
							</c:when>
							<c:otherwise>
							</c:otherwise>

						</c:choose>

					</ul>
				</div>
			</div>
		</div>


	</c:forEach>
</div>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Lista Alumnos</title>
		<!-- BOOTSTRAP CSS -->
		<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
			integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
			crossorigin="anonymous">
	</head>

	<body>
		<header class="container-fluid">
			<h1 class="h1 m-auto text-center">Simulacro 3</h1>
			<h3 class="h3 m-auto text-center">- Escuela rural -</h3>
		</header>
		
		<main class="container">
				
			<!-- Lista Alumnos del curso seleccionado -->
			
			<c:if test="${true}">
				<section class="row">
					<div class="table-responsive col-6 m-auto text-center">
						<table class="table table-sm table-striped table-hover">
							<thead class="thead-light">
								<tr>
									<th>${curso.getNombre()}</th>
									<th>Alumnos: ${curso.getListaAlumnos().size()}</th>
								</tr>
								<tr>
									<th scope="col">#</th>
									<th scope="col">Nombre</th>
								</tr>
							</thead>
							<tbody class="tbody-light">
								<c:forEach items="${listaAlumno}" var="alumno">
									<tr>
										<td scope="row">${alumno.getId()}</td>
										<td>${alumno.getNombre()}</td>
									</tr>
								</c:forEach>
							</tbody>
							<tfoot class="thead-light">
								<tr>
									<th colspan="2"><a href="${pageContext.request.contextPath}">Volver</a></th>
								</tr>
							</tfoot>
						</table>
					</div>
				</section>
			</c:if>
			
			<!-- FIN Lista de alumno -->
		</main>
	
		<!-- BOOTSTRAP JAVASCRIPT -->
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
			integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
			integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
			integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
			crossorigin="anonymous"></script>
	</body>

</html>

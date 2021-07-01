<%--Aqui nós pegamos os dados da tela HTML--%>


<%@page import="Controller.Crontroller"%>
<%@page import="Controller.ControleUsuario"%>
<%@ page import="dominio.DAO1" %>
<%@ page import="dominio.Usuario" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- Aqui temos 3 variaveis nome, idade e cpf, que através do metodo getparameter com o objeto request
	  consegue recuperar os dados da tela html, com a tela Html e JSP já temos a nossa camada de apresentação --%>
	<%
		Usuario usuario = new Usuario();
		usuario.setNome(request.getParameter("nome"));
		usuario.setIdade(Integer.parseInt(request.getParameter("idade")));
		usuario.setCpf(request.getParameter("cpf"));
		
		ControleUsuario	contU = new ControleUsuario();
		
		DAO1 dao = new DAO1();
		dao.insereUsuario(usuario);
		
		
		%>
		
		<h1>Formulario de Cadastro</h1>
		
		<p>O seguinte usuario foi cadastrado com sucesso:</p>
		
		<p>
		Nome:<%=usuario.getNome() %><br>
		Idade: <%=usuario.getIdade() %><br>
		Cpf: <%=usuario.getIdade() %><br>
		</p>

</body>
</html>
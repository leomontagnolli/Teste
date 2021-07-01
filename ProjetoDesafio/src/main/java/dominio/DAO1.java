package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO1 {
	
		private String driver ="org.postgresql.Driver";
		private String url  = "jdbc:postgresql://localhost:5432/BancoDesafio";
		private String user = "postgres";
		private String password = "123456";
		
		public Connection conectar() {
			Connection  con = null;
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				return con ;
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
		
		}

	public void insereUsuario(Usuario usuario) {
		Connection  con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			String sql = "insert into formulario values ('" + usuario.getCpf() + "' , '" + usuario.getNome() + " ' , '" + usuario.getIdade() + "';";
			PreparedStatement ps = con.prepareStatement(sql);


		} catch (Exception e) {
			System.out.println(e);
		}

	}
		
		public void testeConexão() {
			try {
				Connection con = conectar();
				System.out.println(con);
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
}

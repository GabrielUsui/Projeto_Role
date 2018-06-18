import conexao.ControleConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao
{
	private Connection connection;
	private ControleConexao controleconexao;
	
	public LoginDao() throws ClassNotFoundException, SQLException
	{
		controleconexao = new ControleConexao();
	}
	
	PreparedStatement preparador;
	
	public Boolean validarUsuario(String usuario, String senha)
	{
		Boolean result = false;
		
		String sql = "SELECT * FROM usuario WHERE username = '"+usuario+"' and password = '"+senha+"'";
		
		try {
			
			connection = controleconexao.abrirConexao();
			preparador = connection.prepareStatement(sql);
			
			ResultSet rs = preparador.executeQuery();
			
			if (rs.next()) 
			{
				result = true;
			}

			rs.close();
			preparador.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return result;
		
	}
}
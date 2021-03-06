package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControleConexao
{
	public final String DB_ADDRESS = "";

	public final String DB_USER_NAME = "";

	public final String DB_USER_PASSWORD = "";
	
		/*public final String DB_ADDRESS = "jdbc:postgresql://localhost:5432/db_portal_transparencia";
	
		public final String DB_USER_NAME = "postgres";
	
		public final String DB_USER_PASSWORD = "postgres";*/

	public Connection abrirConexao() 
	{
		Connection connection;

	try {
		Class.forName("org.postgresql.Driver");

		connection = DriverManager.getConnection(DB_ADDRESS, DB_USER_NAME, DB_USER_PASSWORD);
			
		return connection;
			
	} catch (ClassNotFoundException e) {
			
		e.printStackTrace();
			
	} catch (SQLException e) {

	}

		return null;
	}
	
	public static void fecharConexao(Connection conexao) 
    {
        try 
        {
            conexao.close();
        } 
        catch (SQLException ex) 
        {
            System.out.println("Erro ao fechar conexão: " + ex.getMessage());
        }
        
    }

	public static void fecharInstrucao(PreparedStatement instrucao) 
	{
        try 
        {
            instrucao.close();
        }
        catch (SQLException e) 
        {
            System.out.println("Erro ao fechar instrução: " + e.getMessage());
        }
        
    }
	    
    public static void fecharResultSet(ResultSet resultados)
    {
        try 
        {
            resultados.close();
        }
        
        catch (SQLException e) 
        {
            System.out.println("Erro ao fechar ResultSet: "+e.getMessage());
        }
        
    }
}
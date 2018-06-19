package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ControleConexao;
import modelo.Localidade;

public class LocalidadeDao {
	private Connection connection;
	private ControleConexao controleconexao;
	
	public LocalidadeDao() 
	{
		controleconexao = new ControleConexao();
	}
	
	PreparedStatement preparador;
	
	public void cadastrar(Localidade localidade)
	{
		String sql = "INSERT INTO localidade (cardapio, telefone) "
				+ "values ('"+localidade.getCardapio()+"','"+localidade.getTelefone()+"')";
		
		try {
			
			connection = controleconexao.abrirConexao();
			connection.setAutoCommit(false);
			preparador = connection.prepareStatement(sql);
			preparador.execute();
			connection.commit();
			
		} catch (SQLException e) {

			e.printStackTrace();
			
		}finally{
			ControleConexao.fecharInstrucao(preparador);
			ControleConexao.fecharConexao(connection);
		}
	}
	
	public void alterar(Localidade localidade)
	{
		String sql = "UPDATE localidade set  = '"+localidade.get()+"' where nome='"+ localidade.getNome()+"'";
		
		try {
			
			connection = controleconexao.abrirConexao();
			preparador = connection.prepareStatement(sql);
			preparador.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}finally{
			ControleConexao.fecharInstrucao(preparador);
			ControleConexao.fecharConexao(connection);
		}
	}
	
	public void excluir(Localidade localidade)
	{
		String sql = "DELETE FROM localidade where nome='"+ localidade.getNome()+"'";//definir chave
		
		try {
			
			connection = controleconexao.abrirConexao();
			preparador = connection.prepareStatement(sql);
			preparador.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}finally{
			ControleConexao.fecharInstrucao(preparador);
			ControleConexao.fecharConexao(connection);
		}
	}
}

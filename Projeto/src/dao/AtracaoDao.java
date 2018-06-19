package dao;
import modelo.Atracao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexao.ControleConexao;

public class AtracaoDao 
{
	private Connection connection;
	private ControleConexao controleconexao;
	
	public AtracaoDao() 
	{
		controleconexao = new ControleConexao();
	}
	
	PreparedStatement preparador;
	
	public void cadastrar(Atracao atracao)
	{
		String sql = "INSERT INTO atracao (nome, estilo) "
				+ "values ('"+atracao.getNome()+"','"+atracao.getEstilo()+"')";
		
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
	
	public void alterar(Atracao atracao)
	{
		String sql = "UPDATE atracao set estilo = '"+atracao.getEstilo()+"' where nome='"+ atracao.getNome()+"'";
		
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
	
	public void excluir(Atracao atracao)
	{
		String sql = "DELETE FROM atracao where nome='"+ atracao.getNome()+"'";
		
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
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexao.ControleConexao;
import modelo.Evento;

public class EventoDao 
	{
	private Connection connection;
	private ControleConexao controleconexao;
		
	public EventoDao() 
	{
		controleconexao = new ControleConexao();
	}
		
	PreparedStatement preparador;
		
	public void cadastrar(Evento evento)
	{
		String sql = "INSERT INTO evento (nome, preco, tipo, data, horario, telefone) "
				+ "values ('"+evento.getNome()+"','"+evento.getPreco()+"','"+evento.getTipo()+"', '"+evento.getData()+"',"
				+ "'"+evento.getHorario()+"', '"+evento.getTelefone()+"')";
			
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
	
	public void alterarNome(Evento evento)
	{
			String sql = "UPDATE evento set nome = '"+evento.getNome()+"' where nome='"+ evento.getNome()+"'";
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
		
	public void alterarPreco(Evento evento)
	{
			String sql = "UPDATE evento set preco = '"+evento.getPreco()+"' where nome='"+ evento.getNome()+"'";
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
		
	public void alterarTipo(Evento evento)
	{
		String sql = "UPDATE evento set tipo = '"+evento.getTipo()+"' where nome='"+ evento.getNome()+"'";
		
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
		
	public void alterarData(Evento evento)
	{
		String sql = "UPDATE evento set data = '"+evento.getData()+"' where nome='"+ evento.getNome()+"'";
			
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
		
	public void alterarHorario(Evento evento)
	{
		String sql = "UPDATE evento set horario = '"+evento.getHorario()+"' where nome='"+ evento.getNome()+"'";
			
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
		
	public void alterarTelefone(Evento evento)
	{
		String sql = "UPDATE evento set telefone = '"+evento.getTelefone()+"' where nome='"+ evento.getNome()+"'";
		
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
		
	public void excluir(Evento evento)
	{
		String sql = "DELETE FROM evento where nome='"+ evento.getNome()+"'";
		
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
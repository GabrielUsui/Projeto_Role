package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexao.ControleConexao;
import modelo.Evento;
import modelo.PontoApoio;

public class PontoApoioDao 
	{
	private Connection connection;
	private ControleConexao controleconexao;
		
	public PontoApoioDao() 
	{
		controleconexao = new ControleConexao();
	}
		
	PreparedStatement preparador;
		
	public void cadastrar(PontoApoio pontoApoio)
	{
		String sql = "INSERT INTO pontoApoio (hotarioSemanal, horarioSabado, horarioDomingo, horarioFeriado, cep, numero, logradouro, bairro, cidade, estado) "
				+ "values ('"+pontoApoio.getHorarioSemanal()+"','"+pontoApoio.getHorarioSabado()+"','"+pontoApoio.getHorarioDomingo()+"', '"+pontoApoio.getHorarioFeriado()+"',"
				+ "'"+pontoApoio.getCep()+"', '"+pontoApoio.getNumero()+"'+,'"+pontoApoio.getLogradouro()+"', '"+pontoApoio.getBairro()+"', '"+pontoApoio.getCidade()+"', '"+pontoApoio.getEstado()+"')";
			
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
		
	public void alterarHorarioSemanal(PontoApoio pontoApoio)
	{
			String sql = "UPDATE pontoApoio set hotarioSemanal = '"+pontoApoio.getHorarioSemanal()+"' where nome='"+ pontoApoio.getNome()+"'";
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
	
	public void alterarHorarioSabado(PontoApoio pontoApoio)
	{
			String sql = "UPDATE pontoApoio set hotarioSabado = '"+pontoApoio.getHorarioSabado()+"' where nome='"+ pontoApoio.getNome()+"'";
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
	
	public void alterarHorarioDomingo(PontoApoio pontoApoio)
	{
			String sql = "UPDATE pontoApoio set hotarioDomingo = '"+pontoApoio.getHorarioDomingo()+"' where nome='"+ pontoApoio.getNome()+"'";
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
	
	public void alterarHorarioFeriado(PontoApoio pontoApoio)
	{
			String sql = "UPDATE pontoApoio set hotarioFeriado = '"+pontoApoio.getHorarioFeriado()+"' where nome='"+ pontoApoio.getNome()+"'";
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
		
	public void alterarCep(PontoApoio pontoApoio)
	{
		String sql = "UPDATE pontoApoio set cep = '"+pontoApoio.getCep()+"' where nome='"+ pontoApoio.getNome()+"'";
		
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
		
	public void alterarNumero(PontoApoio pontoApoio)
	{
		String sql = "UPDATE pontoApoio set numero = '"+pontoApoio.getNumero()+"' where nome='"+ pontoApoio.getNome()+"'";
			
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
		
	public void alterarLogradouro(PontoApoio pontoApoio)
	{
		String sql = "UPDATE pontoApoio set logradouro = '"+pontoApoio.getLogradouro()+"' where nome='"+ pontoApoio.getNome()+"'";
			
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
		
	public void alterarBairro(PontoApoio pontoApoio)
	{
		String sql = "UPDATE pontoApoio set bairro = '"+pontoApoio.getBairro()+"' where nome='"+ pontoApoio.getNome()+"'";
		
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
	
	public void alterarCidade(PontoApoio pontoApoio)
	{
		String sql = "UPDATE pontoApoio set cidade = '"+pontoApoio.getCidade()+"' where nome='"+ pontoApoio.getNome()+"'";
		
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
	
	public void alterarEstado(PontoApoio pontoApoio)
	{
		String sql = "UPDATE pontoApoio set estado = '"+pontoApoio.getEstado()+"' where nome='"+ pontoApoio.getNome()+"'";
		
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
		
	public void excluir(PontoApoio pontoApoio)
	{
		String sql = "DELETE FROM pontoApoio where nome='"+ pontoApoio.getNome()+"'";
		
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
package dao;
import modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.ControleConexao;

public class UsuarioDao 
{
	private Connection connection;
	private ControleConexao controleconexao;
	
	public UsuarioDao() 
	{
		controleconexao = new ControleConexao();
	}
	
	PreparedStatement preparador;
	
	public void cadastrar(Usuario usuario)
	{
		String sql = "INSERT INTO usuario (nome, email, dataNascimento, username, password, telefone, cep, numero, logradouro, bairro, cidade, estado) "
				+ "values ('"+usuario.getNome()+"','"+usuario.getEmail()+"','"+usuario.getDataNascimento()+"', '"+usuario.getUsername()+"',"
				+ "'"+usuario.getDataNascimento()+"', '"+usuario.getPassword()+"', '"+usuario.getTelefone()+"', '"+usuario.getCep()+"',"
				+ "'"+usuario.getNumero()+"', '"+usuario.getLogradouro()+"', '"+usuario.getBairro()+"', '"+usuario.getCidade()+"', '"+usuario.getEstado()+"')";
		
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
	
	public void alterar(Usuario usuario)
	{
		String sql = "UPDATE usuario set password = '"+usuario.getPassword()+"' where username='"+ usuario.getUsername()+"'";
		
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
	
	public void excluir(Usuario usuario)
	{
		String sql = "DELETE FROM usuario where username='"+ usuario.getUsername()+"'";
		
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
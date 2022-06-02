package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import exceptions.VBException;

public class VendedorDAO {
    private Connection conexao;
    
    public VendedorDAO(Connection conexao) {
    	this.conexao = conexao;
    }
    
    public void insereVendedor(Vendedor vendedor) throws VBException{
    	try {
    		PreparedStatement stat = conexao.prepareStatement("insert into vendedores(nome, endereco, setor, saalrio)" +
    	              " values(?, ?, ?, ?)");
    		stat.setString(1, vendedor.getNome());
    		stat.setString(2, vendedor.getEndereco());
    		stat.setString(3, vendedor.getSetor());
    		stat.setString(4, vendedor.getSalario());
    		
    		stat.executeUpdate();
    	}catch(SQLException e) {
    		throw new VBException("Registro não inserido - " + getMessage());
    	}
    }
    
    
    
    public Vendedor getObjetctFromFrame() {
    	return new Vendedor(txtNome.getText(), txtEndereco.getText(),
    			txtSetor.getText(), Double.valueOf(txtSalario.getText()));
    }
}

package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.Vendedor;
import dao.VendedorDAO;
import exceptions.VBException;
import helper.ConnectionHelper;



public class FrameVendedor extends JFrame{
    private JPanel JPanelCampos;
    private JPanel JPanelBotoes;
    
    private JLabel lbNome;
    private JTextField txtNome;
    private JLabel lbEndereco;
    private JTextField txtEndereco;
    private JLabel lbSetor;
    private JTextField txtSetor;
    private JLabel lbSalario;
    private JTextField txtSalario;
    
    private JButton btNovo;
    private JButton btGravar;
    
    public FrameVendedor() {
    	initialize();
    	setSize(260, 140);
    	setVisible(true);
    }
    
    private void initialize() {
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setTitle("Cadastro de Vendedores");
    	this.setLayout(new BorderLayout());
    	this.add(getPanelCampos(), BorderLayout.NORTH);
    	this.add(getPanelBotoes(), BorderLayout.CENTER);
    }
    
    private JPanel getPanelCampos() {
    	if(JPanelCampos == null) {
    	   JPanelCampos = new JPanel(new GridLayout(4, 2));
    	   lbNome = new JLabel("Nome : ");
    	   txtNome = new JTextField(30);
    	   lbEndereco = new JLabel("Endereco : ");
    	   txtEndereco = new JTextField(30);
    	   lbSetor = new JLabel("Setor");
    	   txtSetor = new JTextField(30);
    	   lbSalario = new JLabel("Salario : ");
    	   txtSalario = new JTextField(10);
    	   JPanelCampos.add(lbNome);
    	   JPanelCampos.add(txtNome);
    	   JPanelCampos.add(lbEndereco);
    	   JPanelCampos.add(txtEndereco);
    	   JPanelCampos.add(lbSetor);
    	   JPanelCampos.add(txtSetor);
    	   JPanelCampos.add(lbSalario);
    	   JPanelCampos.add(txtSalario);
    	}
    	return JPanelCampos;
    }
    
    private JPanel getPanelBotoes() {
    	if(JPanelBotoes == null) {
    		JPanelBotoes = new JPanel(new GridLayout(1, 2));
    		btNovo = new JButton("Novo");
    		btNovo.addActionListener(new Controlador(this));
    		btGravar = new JButton("Gravar");
    		btGravar.addActionListener(new Controlador(this));
    		JPanelBotoes.add(btNovo);
    		JPanelBotoes.add(btGravar);
    	}
    	return JPanelBotoes;
    }
    
    
    public class Controlador implements ActionListener{
       private JFrame view;
        	
       public Controlador(JFrame view) {
        		this.view = view;
       }

	   @Override
	   public void actionPerformed(ActionEvent event) {
		   if(view instanceof FrameVendedor) {
			   FrameVendedor viewVendedor = (FrameVendedor) view;
			   if(event.getSource() == viewVendedor.getBtGravar()) {
				   try {
					   VendedorDAO vendedorDAO = new VendedorDAO(ConnectionHelper.getConexao());
					   vendedorDAO.insereVendedor(viewVendedor.getObjectFromFrame());
				   }catch(VBException e) {
					   e.printStackTrace();
				   }finally {
					   try {
						   ConnectionHelper.fechaConexao();
						   viewVendedor.clearFrame();
					   }catch(SQLException e) {
						   e.printStackTrace();
					   }
				   }
			   }
		   }
		
	   }
	        	
    }
    
    
        
    public JButton getBtNovo() {
		return btNovo;
	}
	   
	public JButton gtBtGravar() {
		return btGravar;
	}
    
	public JButton getBtGravar() {
		return btGravar;
	}

	public void setBtGravar(JButton btGravar) {
		this.btGravar = btGravar;
	}
	
	public static void main(String[] args) {
    	new FrameVendedor();
    }
    
}


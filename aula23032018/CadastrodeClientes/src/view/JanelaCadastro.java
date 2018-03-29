package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaCadastro extends JFrame {
	
	JLabel lblTitulo = new JLabel("Preencha os campos e clique em Gravar Dados");
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	JLabel lblEndereco = new JLabel("Endereço: ");
	JTextField txtEndereco = new JTextField();
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	JLabel lblEstado = new JLabel("Estado: ");
	JComboBox cboEstado = new JComboBox();
	JLabel lblTelefone = new JLabel("Telefone: ");
	JTextField txtTelefone = new JTextField();
	JLabel lblCelular = new JLabel("Celular: ");
	JTextField txtCelular = new JTextField();
	JLabel lblEmail = new JLabel("Email: ");
	JTextField txtEmail = new JTextField();
	JButton btnGCadastro = new JButton("Gravar Cadastro");
	JButton btnNCadastro = new JButton("Novo Cadastro");
	JButton btnVCadastros = new JButton("Ver Cadastros");
	
	public JanelaCadastro() {
		super ("Cadastro de Clientes");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblTitulo.setBounds(60, 10, 400, 30);
		paine.add(lblTitulo);
		
		lblNome.setBounds(70, 50, 60, 20);
		paine.add(lblNome);
		txtNome.setBounds(140, 50, 180, 20);
		paine.add(txtNome);
		
		lblEndereco.setBounds(70, 75, 60, 20);
		paine.add(lblEndereco);
		txtEndereco.setBounds(140, 75, 180, 20);
		paine.add(txtEndereco);
		
		lblBairro.setBounds(70, 100, 60, 20);
		paine.add(lblBairro);
		txtBairro.setBounds(140, 100, 180, 20);
		paine.add(txtBairro);
		
		lblEstado.setBounds(70, 125, 60, 20);
		paine.add(lblEstado);
		cboEstado.addItem(" ");
		cboEstado.addItem("AC");
		cboEstado.addItem("AM");
		cboEstado.addItem("BA");
		cboEstado.addItem("RJ");
		cboEstado.addItem("SP");
		cboEstado.setBounds(140, 125, 140, 20);
		paine.add(cboEstado);
		
		lblTelefone.setBounds(70, 150, 60, 20);
		paine.add(lblTelefone);
		txtTelefone.setBounds(140, 150, 100, 20);
		paine.add(txtTelefone);
		
		lblCelular.setBounds(70, 175, 60, 20);
		paine.add(lblCelular);
		txtCelular.setBounds(140, 175, 100, 20);
		paine.add(txtCelular);
		
		lblEmail.setBounds(70, 200, 60, 20);
		paine.add(lblEmail);
		txtEmail.setBounds(140, 200, 180, 20);
		paine.add(txtEmail);
		
		btnGCadastro.setBounds(50, 250, 90, 40);
		paine.add(btnGCadastro);
		
		btnNCadastro.setBounds(150, 250, 90, 40);
		paine.add(btnNCadastro);
		
		btnVCadastros.setBounds(250, 250, 90, 40);
		paine.add(btnVCadastros);
		
		this.setVisible(true);
		this.setSize(400, 360);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JanelaCadastro janela = new JanelaCadastro();

	}

}

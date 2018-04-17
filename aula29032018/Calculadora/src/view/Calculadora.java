package view;

import calculos.FuncoesMatematicas;

import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	JTextField txtVisor = new JTextField("0");
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	
	JButton btnSetaEsquerda = new JButton("<--");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("+-");
	JButton btnRaizQuadrada = new JButton("Raiz");
	
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnDivisao = new JButton("/");
	JButton btnPorcentagem = new JButton("%");
	
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnMultiplicacao = new JButton("*");
	JButton btn1barrax = new JButton("1/x");
	
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnMenos = new JButton("-");
	JButton btnIgual = new JButton("=");
	
	JButton btnZero = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnMais = new JButton("+");

	FuncoesMatematicas mat = new FuncoesMatematicas();
	String sinal = null, sinal0 = null, virgula = null;
	double valor0 = 0, valor1 = 0, valorM = 0;
	String str, str0;
	
	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtVisor.setBounds(10, 15, 171, 50);
		paine.add(txtVisor);
		
		
		btnMC.setBounds(10, 70, 30, 25);
		btnMC.setMargin(new Insets(1,1,1,1));
		paine.add(btnMC);
		btnMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valorM = 0;
			}
		});
		btnMR.setBounds(45, 70, 30, 25);
		btnMR.setMargin(new Insets(1,1,1,1));
		paine.add(btnMR);
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(valorM + "");
				if (sinal.equals("mmais")) {
					valorM = Double.parseDouble(mat.adicao(valorM, valor0) + "");
					txtVisor.setText(valorM + "");
				}
				else if(sinal.equals("mmenos")) {
					valorM = Double.parseDouble(mat.subtracao(valorM, valor0) + "");
					txtVisor.setText(valorM + "");
				}	
			}
		});
		btnMS.setBounds(80, 70, 30, 25);
		btnMS.setMargin(new Insets(1,1,1,1));
		paine.add(btnMS);
		btnMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valorM = Double.parseDouble(txtVisor.getText());
			}
		});
		btnMmais.setBounds(115, 70, 30, 25);
		btnMmais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMmais);
		btnMmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(txtVisor.getText());
				sinal = "mmais";
				virgula = null;
			}
		});
		
		btnMmenos.setBounds(150, 70, 30, 25);
		btnMmenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMmenos);
		btnMmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(txtVisor.getText());
				sinal = "mmenos";
				virgula = null;
			}
		});
		
		btnSetaEsquerda.setBounds(10, 100, 30, 25);
		btnSetaEsquerda.setMargin(new Insets(1,1,1,1));
		paine.add(btnSetaEsquerda);
		btnSetaEsquerda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str = txtVisor.getText();
				str0 = str.substring(0, str.length() - 1);
				txtVisor.setText(str0);
			}
		});
		btnCE.setBounds(45, 100, 30, 25);
		btnCE.setMargin(new Insets(1,1,1,1));
		paine.add(btnCE);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		btnC.setBounds(80, 100, 30, 25);
		btnC.setMargin(new Insets(1,1,1,1));
		paine.add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sinal = null;
				sinal0 = null;
				virgula = null;
				valor0 = 0;
				valor1 = 0;
				txtVisor.setText("0");
			}
		});
		btnMaisMenos.setBounds(115, 100, 30, 25);
		btnMaisMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMaisMenos);
		btnMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(txtVisor.getText()) * -1;
				txtVisor.setText(valor0 + "");
			}
		});
		btnRaizQuadrada.setBounds(150, 100, 30, 25);
		btnRaizQuadrada.setMargin(new Insets(1,1,1,1));
		paine.add(btnRaizQuadrada);
		btnRaizQuadrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(mat.raizQuadrada(valor0) + "");
				virgula = null;
			}
		});
		
		btnSete.setBounds(10, 130, 30, 25);
		btnSete.setMargin(new Insets(1,1,1,1));
		paine.add(btnSete);
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("7");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "7");
				}
			}
		});
		btnOito.setBounds(45, 130, 30, 25);
		btnOito.setMargin(new Insets(1,1,1,1));
		paine.add(btnOito);
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("8");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "8");
				}
			}
		});
		btnNove.setBounds(80, 130, 30, 25);
		btnNove.setMargin(new Insets(1,1,1,1));
		paine.add(btnNove);
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("9");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "9");
				}
			}
		});
		btnDivisao.setBounds(115, 130, 30, 25);
		btnDivisao.setMargin(new Insets(1,1,1,1));
		paine.add(btnDivisao);
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virgula = null;
				sinal0 = "0";
				valor0 = Double.parseDouble(txtVisor.getText());
				sinal = "divisão";
				txtVisor.setText("0");
			}
		});
		btnPorcentagem.setBounds(150, 130, 30, 25);
		btnPorcentagem.setMargin(new Insets(1,1,1,1));
		paine.add(btnPorcentagem);
		btnPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal0 = "porcentagem";
				virgula = null;
			}
		});
		btnQuatro.setBounds(10, 160, 30, 25);
		btnQuatro.setMargin(new Insets(1,1,1,1));
		paine.add(btnQuatro);
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("4");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "4");
				}
			}
		});
		btnCinco.setBounds(45, 160, 30, 25);
		btnCinco.setMargin(new Insets(1,1,1,1));
		paine.add(btnCinco);
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("5");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "5");
				}
			}
		});
		btnSeis.setBounds(80, 160, 30, 25);
		btnSeis.setMargin(new Insets(1,1,1,1));
		paine.add(btnSeis);
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("6");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "6");
				}
			}
		});
		btnMultiplicacao.setBounds(115, 160, 30, 25);
		btnMultiplicacao.setMargin(new Insets(1,1,1,1));
		paine.add(btnMultiplicacao);
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virgula = null;
				sinal0 = "0";
				valor0 = Double.parseDouble(txtVisor.getText());
				sinal = "multiplicação";
				txtVisor.setText("0");
			}
		});
		btn1barrax.setBounds(150, 160, 30, 25);
		btn1barrax.setMargin(new Insets(1,1,1,1));
		paine.add(btn1barrax);
		btn1barrax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText(mat.reciproco(valor0) + "");
				virgula = null;
			}
		});
		
		btnUm.setBounds(10, 190, 30, 25);
		btnUm.setMargin(new Insets(1,1,1,1));
		paine.add(btnUm);
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("1");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "1");
				}
			}
		});
		btnDois.setBounds(45, 190, 30, 25);
		btnDois.setMargin(new Insets(1,1,1,1));
		paine.add(btnDois);
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("2");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "2");
				}
			}
		});
		btnTres.setBounds(80, 190, 30, 25);
		btnTres.setMargin(new Insets(1,1,1,1));
		paine.add(btnTres);
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("3");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "3");
				}
			}
		});
		btnMenos.setBounds(115, 190, 30, 25);
		btnMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMenos);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virgula = null;
				sinal0 = "0";
				valor0 = Double.parseDouble(txtVisor.getText());
				sinal = "subtração";
				txtVisor.setText("0");
				
			}
		});
		btnIgual.setBounds(150, 190, 30, 55);
		btnIgual.setMargin(new Insets(1,1,1,1));
		paine.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				
				if (sinal.equals("divisão")) {
					txtVisor.setText(mat.divisao(valor0, valor1) + "");
				}
				
				else if (sinal.equals("multiplicação")) {
					txtVisor.setText(mat.multiplicacao(valor0, valor1) + "");
				}
				
				else if (sinal.equals("subtração")) {
					txtVisor.setText(mat.subtracao(valor0, valor1) + "");
				}
				
				else if (sinal.equals("adição") && sinal0.equals("0")) {
					txtVisor.setText(mat.adicao(valor0, valor1) + "");
				}
				
				else if (sinal.equals("divisão") && sinal0.equals("porcentagem")) {
					txtVisor.setText(mat.divisaoPorcentagem(valor0, valor1) + "");
				}
				
				else if (sinal.equals("multiplicação") && sinal0.equals("porcentagem")) {
					txtVisor.setText(mat.multiplicacaoPorcentagem(valor0, valor1) + "");
				}
				
				else if (sinal.equals("subtração") && sinal0.equals("porcentagem")) {
					txtVisor.setText(mat.subtracaoPorcentagem(valor0, valor1) + "");
				}
				
				else if (sinal.equals("adição") && sinal0.equals("porcentagem")) {
					txtVisor.setText(mat.adicaoPorcentagem(valor0, valor1) + "");
				}
				virgula = null;
			}
		});
		
		btnZero.setBounds(10, 220, 65, 25);
		btnZero.setMargin(new Insets(1,1,1,1));
		paine.add(btnZero);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("0");
				}
				else {
					txtVisor.setText(txtVisor.getText() + "0");
				}
			}
		});
		btnVirgula.setBounds(80, 220, 30, 25);
		btnVirgula.setMargin(new Insets(1,1,1,1));
		paine.add(btnVirgula);
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (virgula == "virgula") {
					txtVisor.setText(txtVisor.getText());
				}
				else
					txtVisor.setText(txtVisor.getText() + ".");
				virgula = "virgula";
			}
		});
		btnMais.setBounds(115, 220, 30, 25);
		btnMais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMais);
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virgula = null;
				sinal0 = "0";
				valor0 = Double.parseDouble(txtVisor.getText());
				sinal = "adição";
				txtVisor.setText("0");
			}
		});
		
		this.setSize(197, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}
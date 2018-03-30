package view;

import java.awt.Container;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	JTextField txtVisor = new JTextField();
	
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

	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtVisor.setBounds(10, 15, 171, 50);
		paine.add(txtVisor);
		
		btnMC.setBounds(10, 70, 30, 25);
		btnMC.setMargin(new Insets(1,1,1,1));
		paine.add(btnMC);
		btnMR.setBounds(45, 70, 30, 25);
		btnMR.setMargin(new Insets(1,1,1,1));
		paine.add(btnMR);
		btnMS.setBounds(80, 70, 30, 25);
		btnMS.setMargin(new Insets(1,1,1,1));
		paine.add(btnMS);
		btnMmais.setBounds(115, 70, 30, 25);
		btnMmais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMmais);
		btnMmenos.setBounds(150, 70, 30, 25);
		btnMmenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMmenos);
		
		btnSetaEsquerda.setBounds(10, 100, 30, 25);
		btnSetaEsquerda.setMargin(new Insets(1,1,1,1));
		paine.add(btnSetaEsquerda);
		btnCE.setBounds(45, 100, 30, 25);
		btnCE.setMargin(new Insets(1,1,1,1));
		paine.add(btnCE);
		btnC.setBounds(80, 100, 30, 25);
		btnC.setMargin(new Insets(1,1,1,1));
		paine.add(btnC);
		btnMaisMenos.setBounds(115, 100, 30, 25);
		btnMaisMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMaisMenos);
		btnRaizQuadrada.setBounds(150, 100, 30, 25);
		btnRaizQuadrada.setMargin(new Insets(1,1,1,1));
		paine.add(btnRaizQuadrada);
		
		btnSete.setBounds(10, 130, 30, 25);
		btnSete.setMargin(new Insets(1,1,1,1));
		paine.add(btnSete);
		btnOito.setBounds(45, 130, 30, 25);
		btnOito.setMargin(new Insets(1,1,1,1));
		paine.add(btnOito);
		btnNove.setBounds(80, 130, 30, 25);
		btnNove.setMargin(new Insets(1,1,1,1));
		paine.add(btnNove);
		btnDivisao.setBounds(115, 130, 30, 25);
		btnDivisao.setMargin(new Insets(1,1,1,1));
		paine.add(btnDivisao);
		btnPorcentagem.setBounds(150, 130, 30, 25);
		btnPorcentagem.setMargin(new Insets(1,1,1,1));
		paine.add(btnPorcentagem);
		
		btnQuatro.setBounds(10, 160, 30, 25);
		btnQuatro.setMargin(new Insets(1,1,1,1));
		paine.add(btnQuatro);
		btnCinco.setBounds(45, 160, 30, 25);
		btnCinco.setMargin(new Insets(1,1,1,1));
		paine.add(btnCinco);
		btnSeis.setBounds(80, 160, 30, 25);
		btnSeis.setMargin(new Insets(1,1,1,1));
		paine.add(btnSeis);
		btnMultiplicacao.setBounds(115, 160, 30, 25);
		btnMultiplicacao.setMargin(new Insets(1,1,1,1));
		paine.add(btnMultiplicacao);
		btn1barrax.setBounds(150, 160, 30, 25);
		btn1barrax.setMargin(new Insets(1,1,1,1));
		paine.add(btn1barrax);
		
		btnUm.setBounds(10, 190, 30, 25);
		btnUm.setMargin(new Insets(1,1,1,1));
		paine.add(btnUm);
		btnDois.setBounds(45, 190, 30, 25);
		btnDois.setMargin(new Insets(1,1,1,1));
		paine.add(btnDois);
		btnTres.setBounds(80, 190, 30, 25);
		btnTres.setMargin(new Insets(1,1,1,1));
		paine.add(btnTres);
		btnMenos.setBounds(115, 190, 30, 25);
		btnMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMenos);
		btnIgual.setBounds(150, 190, 30, 55);
		btnIgual.setMargin(new Insets(1,1,1,1));
		paine.add(btnIgual);
		
		btnZero.setBounds(10, 220, 65, 25);
		btnZero.setMargin(new Insets(1,1,1,1));
		paine.add(btnZero);
		btnVirgula.setBounds(80, 220, 30, 25);
		btnVirgula.setMargin(new Insets(1,1,1,1));
		paine.add(btnVirgula);
		btnMais.setBounds(115, 220, 30, 25);
		btnMais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMais);
		
		this.setSize(197, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}

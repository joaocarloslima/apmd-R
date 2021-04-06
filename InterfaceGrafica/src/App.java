import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
	
	public static void main(String[] args) {
		JFrame janela = new JFrame("Meu App");

		
		JPanel panel = new JPanel(new GridLayout(2,2));
		panel.add(new MeuLabel("Bem Vindo", Color.BLACK));
		panel.add(new MeuTextField());
		panel.add(new MeuTextArea());
		
		janela.add(panel, BorderLayout.CENTER);
		janela.add(new JCheckBox("Aceito os termos do contrato"), 
				BorderLayout.SOUTH);

		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(600, 400);
		janela.setVisible(true);
		
	}

}

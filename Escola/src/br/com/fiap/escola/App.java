package br.com.fiap.escola;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.escola.dao.AlunoDAO;
import br.com.fiap.escola.model.Aluno;

public class App extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private DefaultTableModel modelo = new DefaultTableModel();
	private JButton carregar = new JButton("carregar");
	private JTable tabela = new JTable(modelo);

	public static void main(String[] args) {
		App app = new App();
		app.init();
	}

	private void init() {
		modelo.addColumn("Nome");
		modelo.addColumn("Idade");
		modelo.addColumn("Turma");
		
		carregarDados();
		
		add(new JScrollPane(tabela) );
		add(carregar, BorderLayout.SOUTH);
		
		carregar.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
		
	}
	
	public void carregarDados() {
		modelo.setNumRows(0);
		
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = dao.buscarTodos();
		
		for (Aluno aluno : lista) {
			String[] linha = { 
				aluno.getNome(),
				aluno.getIdade()+"", // TODO conversao String
				aluno.getTurma()
			};
			modelo.addRow(linha);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		carregarDados();		
	}

}

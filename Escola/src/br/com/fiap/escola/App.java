package br.com.fiap.escola;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.escola.dao.AlunoDAO;
import br.com.fiap.escola.model.Aluno;

public class App extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private DefaultTableModel modelo = new DefaultTableModel();
	private JButton carregar = new JButton("carregar");
	private JButton apagar = new JButton("apagar");
	private JTable tabela = new JTable(modelo);

	public static void main(String[] args) {
		App app = new App();
		app.init();
	}

	private void init() {
		modelo.addColumn("Id");
		modelo.addColumn("Nome");
		modelo.addColumn("Idade");
		modelo.addColumn("Turma");
		
		carregarDados();
		
		add(new JScrollPane(tabela));
		
		JPanel botoes = new JPanel();
		botoes.add(apagar);
		botoes.add(carregar);
		
		add(botoes, BorderLayout.SOUTH);
		
		carregar.addActionListener(this);
		apagar.addActionListener(this);
		
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
				aluno.getId().toString(),
				aluno.getNome(),
				aluno.getIdade()+"", // TODO conversao String
				aluno.getTurma()
			};
			modelo.addRow(linha);
		}
		
	}

	private void apagar() {
		AlunoDAO dao = new AlunoDAO();
		int linha = tabela.getSelectedRow();
		String id = tabela.getValueAt(linha, 0).toString();
		Aluno aluno = dao.buscarPorId(Long.valueOf(id));
		int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que quer apagar o aluno selecionado?");
		//dao.apagarPeloId(Long.valueOf(id));
		if (resposta == JOptionPane.YES_OPTION) {
			dao.apagar(aluno);
			carregarDados();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == carregar) carregarDados();		
		if (e.getSource() == apagar) apagar();
	}


}

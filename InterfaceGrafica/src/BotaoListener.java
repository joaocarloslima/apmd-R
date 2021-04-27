import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class BotaoListener implements ActionListener, MouseListener {

	private MeuTextField nameTextField;
	private StarRater rating;

	public BotaoListener(MeuTextField nameTextField, StarRater rating) {
		this.nameTextField = nameTextField;
		this.rating = rating;	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Nome é " + nameTextField.getText());
		
		JOptionPane.showMessageDialog(null, "Avalicao " + rating.getSelection());
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse in");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse out");

		
	}

}

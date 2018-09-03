import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
public static void main(String[] args) {
	 Fortune_Cookie fc = new Fortune_Cookie();
	 fc.showButton();
}
	public void showButton() {
	    System.out.println("Button clicked");
	   
	    
	    JFrame frame = new JFrame();
	    frame.setVisible(true);
	    JButton button = new JButton();
	    frame.add(button);
	    button.addActionListener( this);
	    JOptionPane.showMessageDialog(null, "WooHoo");
	    int rand = new Random().nextInt(5);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



		
	}



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fortune_Cookie implements ActionListener {
public static void main(String[] args) {
	 Fortune_Cookie fc = new Fortune_Cookie();
	 fc.showButton();
}
	public void showButton() {
	    System.out.println("Button clicked");
	   
	    
	    JPanel panel = new JPanel();
	    JFrame frame = new JFrame();
	    frame.add(panel);
	    frame.setVisible(true);
	    JButton button = new JButton();	    
	    panel.add(button);
	    button.setText("whom'st've");
	    button.addActionListener(this);
	    frame.pack();
	    
	    
	    
	}

		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(10);
		if (rand==0) {
			JOptionPane.showMessageDialog(null, "Yeetus Beatus");
		} else if (rand==1){
			JOptionPane.showMessageDialog(null, "Fetus Deletus");
		} else if (rand==2){
			JOptionPane.showMessageDialog(null, "Go summit not living");
		} else if (rand==3) {
			JOptionPane.showMessageDialog(null, "mr feel so good, i dont stark");
		} else if (rand==4) {
			JOptionPane.showMessageDialog(null, "Waluigi in Smash Ultimate");
		} else if (rand==5) {
			JOptionPane.showMessageDialog(null, "Omae Wa Mou Shindeiru");
		}else if (rand==6){
			JOptionPane.showMessageDialog(null, "Fetus Deletus");
		}else if (rand==7){
			JOptionPane.showMessageDialog(null, "Yeetus Beatus");
		}else if (rand==8){
			JOptionPane.showMessageDialog(null, "Go summit not living");
		}else if (rand==9){
			JOptionPane.showMessageDialog(null, "mr feel so good, i dont stark");
		}else if (rand==10){
			JOptionPane.showMessageDialog(null, "Omae Wa Mou Shindeiru");
		}
	}



		
	}



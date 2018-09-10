import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundFX implements ActionListener {
	public void showButton() {
	     System.out.println("Button clicked");
	
	  JPanel panel = new JPanel();
	    JFrame frame = new JFrame();
	    frame.add(panel);
	    frame.setVisible(true);
	    JButton button1 = new JButton();
	    JButton button2 = new JButton();	   
	    JButton button3 = new JButton();	   
	    JButton button4 = new JButton();	   
	    panel.add(button1);
	    panel.add(button2);
	    panel.add(button3);
	    panel.add(button4);
	    button1.setText("yes'm");
	    button2.setText("no'm");
	    button3.setText("m'ladee");
	    button4.setText("po-op");
	    button1.addActionListener(this);
	    frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}

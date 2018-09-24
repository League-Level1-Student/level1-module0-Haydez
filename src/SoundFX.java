import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundFX implements ActionListener {
	public static void main(String[] args) {
		SoundFX sounds = new SoundFX();
		sounds.showButton();
	}
		JButton button1 = new JButton();
	    JButton button2 = new JButton();	   
	    JButton button3 = new JButton();	   
	    JButton button4 = new JButton();	 
	public void showButton() {
	     System.out.println("Button clicked");
	     
	     JPanel panel = new JPanel();
	    JFrame frame = new JFrame();
	    frame.add(panel);
	    frame.setVisible(true);
	    panel.add(button1);
	    panel.add(button2);
	    panel.add(button3);
	    panel.add(button4);
	    button1.setText("sound 1");
	    button2.setText("sound 2");
	    button3.setText("sound 3");
	    button4.setText("sound 4");
	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    button3.addActionListener(this);
	    button4.addActionListener(this);
	    frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton)e.getSource();
		if(pressed.equals(button1)) {
			playSound("cymbal.wav");
		}else if(pressed.equals(button2)) {
			playSound("drum.wav");
		}else if(pressed.equals(button3)) {
			playSound("homer-woohoo.wav");
		}else if(pressed.equals(button4)) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}

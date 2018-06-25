
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.awt.image.ImageProducer;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String url = "https://yt3.ggpht.com/a-/ACSszfFBhyQDCTmqdTE0RLr6szvm_6qjypQiWrCwuQ=s900-mo-c-c0xffffffff-rj-k-no";
		String URL = "https://lh4.googleusercontent.com/-zAmKDaXb9po/AAAAAAAAAAI/AAAAAAAADow/D-fHdpjiAcs/photo.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component yesm;
		// 3. use the "createImage()" method below to initialize your Component
		yesm = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(yesm);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("what is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equals("berd")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		else {
			JOptionPane.showMessageDialog(null, "incorrect!");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(yesm);
		// 10. find another image and create it (might take more than one line of code)
		Component no;
		no = createImage(URL);
		quizWindow.add(no);
		quizWindow.pack();
		// 11. add the second image to the quiz window
		
		// 12. pack the quiz window

		// 13. ask another question
		String qTWO = JOptionPane.showInputDialog("what is this?");
		if(qTWO.equals("philbert and tommy")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		else {
			JOptionPane.showMessageDialog(null, "incorrect!");
		}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

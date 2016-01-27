import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThatWasEasy extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		/* Use the speak method to make the button work. */
		speak("that was easy");
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ThatWasEasy();
	}

	public ThatWasEasy() {
		showEasyButton();
		//easyButtonImage.addMouseListener(this);
	}

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
//		quizWindow.setVisible(true);
//		URL url = null;
//		try {
//			url = new URL(
//					"https://github.com/joonspoon/league-jars/blob/master/easy_button.jpg?raw=true");
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		Icon icon = new ImageIcon(url);
//		this.easyButtonImage = new JLabel(icon);
//		quizWindow.add(easyButtonImage);
//		quizWindow.pack();
	}

}
import javax.swing.JOptionPane;

public class riddle {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
String answer = JOptionPane.showInputDialog("whats brown and stiky");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("a stick")) {
JOptionPane.showMessageDialog(null, "correct");
score=score + 1;
} else {
	JOptionPane.showMessageDialog(null, "wrong, the answer is a stick");
	
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
			
		
	}
}

import javax.swing.JOptionPane;

public class HappyUnbirthday {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog("When is your birthday?");
	if (answer.equals("02/03")) {
		JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");
	}else {
		JOptionPane.showMessageDialog(null, "HAPPY UNBIRTHDAY");
	}
}
}

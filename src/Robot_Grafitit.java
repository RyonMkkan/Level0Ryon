import org.jointheleague.graphical.robot.Robot;

public class Robot_Grafitit { 
	public static void main(String[] args) {
		Robot letter =new Robot(); 
				letter.penDown(); 
				letter.setPenColor(0,0,010);
				letter.move(250);
				letter.turn(50); 
				letter.move(100);
				letter.turn(90);
				letter.move(100);
				letter.turn(40);
				letter.move(100);
				letter.turn(90);
				letter.move(140); 
				letter.turn(180);
				letter.move(140);
				letter.turn(90);
				letter.move(150);
	}
	
}

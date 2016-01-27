import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class flag {
public static void main(String[] args) {
	Tortoise.setPenColor(PenColors.Reds.Crimson);
	Tortoise.setPenWidth(10);
	Tortoise.move(100);
	Tortoise.turn(90);
	Tortoise.setPenColor(PenColors.Whites.GhostWhite);
	Tortoise.move(10);
	Tortoise.turn(90);
	Tortoise.move(100);
	Tortoise.turn(180);
	Tortoise.move(100);
	Tortoise.turn(90);
	Tortoise.setPenColor(PenColors.Greens.Chartreuse);
	Tortoise.move(10);
	Tortoise.turn(90);
	Tortoise.move(100);
	Tortoise.turn(90);
}
}

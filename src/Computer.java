import java.util.Random;

public class Computer {
	public static int getInput() {
		Random random = new Random();
		int input = random.nextInt(3) + 1;
		return input;
	}
}

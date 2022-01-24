package game;
import java.util.Random;
public class ComputerPlayer extends Player {
	
	public ComputerPlayer(String a) {
		super(a);
	}

	public int cs(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	



	}
}
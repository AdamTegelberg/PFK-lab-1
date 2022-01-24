package game;
import java.util.Scanner;
import java.util.Random;


public class TakePinsGame {

	public static void main(String[] args) {
		
		Board bord = new Board();
		bord.setUp(20);
		
		System.out.println("ange ditt namn");
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		
		
		Player human = new HumanPlayer(i);
		Player computer = new ComputerPlayer("Robotvän");

		System.out.println(human.userId + "VS" + computer.userId);

		while (bord.noPins > 0) {
			if (bord.noPins > 0) {
				System.out.println("ta 1 eller 2 stickor");
				int x = sc.nextInt();
				human.takePins(bord, x);
				System.out.println("Det finns" + bord.noPins);
				
				computer.cs(2, 1);
				
		
			}





		}
		
	

	}

}

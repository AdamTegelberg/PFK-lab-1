package game;

import java.util.Scanner;
import java.util.Random;

public class TakePinsGame {

	public static void main(String[] args) {

		Board bord = new Board();
		int t = 10;
		bord.setUp(t);

		System.out.println("ange ditt namn");
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();

		Player human = new HumanPlayer(i);
		ComputerPlayer computer = new ComputerPlayer("Robotvän");

		System.out.println(human.userId + " VS " + computer.userId);
		System.out.println("Det finns " + t + " stickor");
		Boolean game = true;
		Boolean win = true;

		while (game) {
			

			if (bord.noPins > 0) {
				System.out.println("ta 1 eller 2 stickor");
				int x = sc.nextInt();
				while (x > 2 || x < 0) {
					System.out.println("du får bara ta 1 eller 2 pins");
					x = sc.nextInt();
				}

				human.takePins(bord, x);
				System.out.println("Det finns " + bord.noPins + " Stickor kvar");
				win = true;

				int b = computer.cs(1, 2);
				if (bord.noPins >= 2) {
					computer.takePins(bord, b);
					System.out.println(computer.userId + " tog " + b + " stickor");
					System.out.println("Det finns " + bord.noPins + " Stickor kvar ");
					win = false;
				} else if (bord.noPins == 1) {
					computer.takePins(bord, 1);
					win = false;
				} else {
					computer.takePins(bord, 0);
					win = true;
				}
			} else if (bord.noPins == 0) {
				if (win == true) {
					System.out.println("Vinnaren är " + human.userId);
					game = false;
				} else if (win == false) {
					System.out.println("Vinnaren är " + computer.userId);
					game = false;
				}
			}
		}



	}

}

package game;

import java.util.Scanner;
import java.util.Random;

public class TakePinsGame {

	public static void main(String[] args) {

		Board bord = new Board();
		int t = 10;
		bord.setUp(t);



		UserInterface.printMessage("välkommen till Take Pins Game");
	
		String i = UserInterface.namnVal("Ange ditt namn");

		Player human = new HumanPlayer(i);
		ComputerPlayer computer = new ComputerPlayer("Robotvän");

		UserInterface.printMessage(human.userId + " VS " + computer.userId);
		UserInterface.printMessage("Det finns " + t + " stickor");
		Boolean game = true;
		Boolean win = true;

		while (game) {
			

			if (bord.noPins > 0) {
				int s = UserInterface.askForInt("välj ett nummer 1 eller 2");
				if (s == -2) {
					System.exit(0);
				}
				while (s < -2 || s > 2 || s == 0) {
					UserInterface.printMessage("du får bara välje 1 eller 2 stickor");
					s = UserInterface.askForInt("välj ett nummer 1 eller 2");
				}

				while (s == -1) {
					UserInterface.printMessage("du kan bara välja 1 eller 2");
					s = UserInterface.askForInt("Ange ett nummer 1 eller 2");
				}

				human.takePins(bord, s);
				UserInterface.printMessage("Det finns " + bord.noPins + " Stickor kvar");
				win = true;
				int b = computer.cs(1, 2);
				if (bord.noPins >= 2) {
					computer.takePins(bord, b);
					UserInterface.printMessage(computer.userId + " tog " + b + " stickor");
					UserInterface.printMessage("Det finns " + bord.noPins + " Stickor kvar ");
					win = false;
				} else if (bord.noPins == 1) {
					computer.takePins(bord, 1);
					win = false;
				} else {
					computer.takePins(bord, 0);
					win = true;
				}}
				 
			else if (bord.noPins == 0) {
				if (win == true) {
					UserInterface.printMessage("Vinnaren är " + human.userId);
					game = false;
				} else if (win == false) {
					UserInterface.printMessage("Vinnaren är " + computer.userId);
					game = false;
				}
			}
		}
				
	}
			
		
			
			
			
}


				

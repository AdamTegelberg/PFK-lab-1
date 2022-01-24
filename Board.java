package game;


public class Board {
	
	public int noPins;
	
	public void setUp(int x) {
		noPins = x;
	}
	
	public void takePins(int x) {
		
		noPins = noPins - x;
	}
		

	public int getNoPins() {
		return noPins;
	}

}

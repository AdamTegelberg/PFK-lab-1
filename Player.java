package game;

public abstract class Player {
	
	protected String userId;
	
	protected Player(String a) {
		userId = a;
	}
	
	public String  getUserId() {
		return userId;
	}
	
	public void takePins(Board s, int x) {
		s.takePins(x);
	}

}

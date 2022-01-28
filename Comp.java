package game;

public class Comp extends Player {

    public Comp(String a) {
		super(a);
	}
    
    public int vinn(Board bord) {
        System.out.println(bord.getNoPins() % 3 - 1);
        System.out.println(bord.getNoPins() % 3 - 2);
        if (bord.getNoPins() % 3 - 1 == 0) {
            return 1;
        } else if (bord.getNoPins() % 3 - 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }
}


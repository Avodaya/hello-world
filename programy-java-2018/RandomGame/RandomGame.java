import java.util.Random;

public class RandomGame {
	
	
    public static void main(String[] args) throws Exception {
        Thread player1 = new Thread(new Player1("Player 1", 1));
        Thread player2 = new Thread(new Player1("Player 2", 2));
 
        player1.start();
        player2.start();
 
        player1.join();
        player2.join();
    }
}
 
class Player1 implements Runnable {
    private String player;
	private int w;
	static boolean w1 = false, w2 = false;
	
    public Player3(String player, int w) {
        this.player = player;
		this.w = w;
    }
 
    @Override
    public void run() {
        int value = 0;
        int exchange = 0;
		int i = 0;
		
        Random random = new Random();
        while (w1 == false && w2 == false) {
			i++;
            value = random.nextInt(10);
            System.out.println(name() + " - value:" + value);
			if (value == 5) {
				switch (w) {
					case 1:
						w1 = true;
						break;
					case 2:
						w2 = true;
						break;
				}
			}
		} 
    System.out.println(name() + " - end : " + i);
    System.out.println(name() + " - end value:" + value);
	if (value == 5) System.out.println("End the winner is.... " + name() + " !!");
	}
    
 
    private String name() {
        return String.format("[%s]", player);
    }

}

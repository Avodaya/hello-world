import java.util.concurrent.*;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class RandomGame2
{
    public static void main(String[] args) throws Exception
    {
        List<Callable<Player>> tasks = Arrays.asList(
                new Player("Player 1"),
                new Player("Player 2"),
				new Player("Player 3"),
				new Player("Player 4")
        );
        ExecutorService executor = Executors.newFixedThreadPool(4);
 
        Player winner = executor.invokeAny(tasks); // to czeka na pierwszego lepszego

        System.out.println("Wygrał: " + winner.getName());
        executor.shutdown();
 
    }
}
 
 
class Player implements Callable<Player>
{
    private String name;
    private Random random = new Random();
	static boolean status = true;
	
    public Player(String name)
    {
        this.name = name;
    }
 
    @Override
    public Player call() throws Exception
    {
        System.out.println(name() + "Start");
        int value = 0;
 
        while (value != 5 && status == true)
        {
			if (Thread.currentThread().isInterrupted()) {
				throw new RuntimeException(); 
			}
            value = random.nextInt(20);
            System.out.println(name() + " - value: " + value);
        }
        System.out.println(name() + "End");
        return this;
    }
 
    private String name()
    {
        return String.format("[%s]:", name);
    }
 
    public String getName()
    {
        return name;
    }
}
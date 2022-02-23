package GuessGame;

public class Player {
    //emplementation
    private int number = 0;
    //interafaces
    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing "+number);
    }
    
}

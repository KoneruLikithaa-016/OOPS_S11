package teacher;

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
        System.out.println("Player created: " + name);
    }

   
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Player " + name + " is being garbage collected.");
    }
}

public class game{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Player p = new Player("Player" + i);
            
        }

        
        System.gc();

        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method finished.");
    }
}

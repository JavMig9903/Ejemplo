import java.util.concurrent.Semaphore;

public class BattleRoyale {
    private static final int MAX = 10;
    private final Semaphore battle = new Semaphore(MAX, true);


    public void primeratanda(Jugadores jug) throws InterruptedException{
        battle.acquire();
    }


}

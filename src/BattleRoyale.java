import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class BattleRoyale {
    private static final int MAX = 10;
    private final Semaphore battle = new Semaphore(MAX, true);
    public int suma=0;
    public HashMap <String,Integer> wins = new HashMap<String, Integer>();

    public Jugadores primer;
    public void primeratanda(Jugadores jug) throws InterruptedException{
        suma++;
        battle.acquire();
    }
    public void bonus(Jugadores jug){
        if(primer == null){
            System.out.println("El primero ha sido "+jug.getName());
            primer = jug;
            int binus=wins.get(jug.getName())*2;
            System.out.println(binus);
            wins.put(jug.getName(), binus);
        }
    }
    public void seguna(Jugadores jug) {
        battle.release();
    }

    public void calculawin(HashMap points, Jugadores primer){
        int ganador = 0;
        System.out.println(points);
        /*Queria buscar el maximo del hashmap y printear la clave que es donde estaba  el */
    }

}

import java.util.Random;

public class Jugadores extends Thread{
    BattleRoyale batalla;
    public Jugadores(BattleRoyale batalla){
        this.batalla=batalla;
    }
    @Override
    public void run() {
        try {
            System.out.println("Entra"+getName());
            int duracion = new Random().nextInt(5000);
            sleep(duracion);
            System.out.println(getName()+" he dormido "+duracion);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

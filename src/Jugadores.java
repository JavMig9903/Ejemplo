import java.util.Random;

public class Jugadores extends Thread{
    BattleRoyale batalla;
    public Jugadores(BattleRoyale batalla){
        this.batalla=batalla;
    }
    @Override
    public void run() {
        try {
            batalla.primeratanda(this);
            System.out.println("Entra"+getName());
            int duracion = new Random().nextInt(4000)+1000;
            sleep(duracion);
            batalla.wins.put(getName(),new Random().nextInt(4000)+1000);
            batalla.bonus(this);
            System.out.println(getName()+" he dormido "+duracion);
            if (batalla.suma >5){
                batalla.seguna(this);
            }
            if(getName().contains("15")){
                batalla.calculawin(batalla.wins,batalla.primer);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {

    public static void main(String[] args){
        BattleRoyale bat1 = new BattleRoyale();
        for(int i=0;i<15;i++){
            Jugadores jug1 =new Jugadores(bat1);
            jug1.setName("Jug "+(i+1));
            jug1.start();
        }
    }

}

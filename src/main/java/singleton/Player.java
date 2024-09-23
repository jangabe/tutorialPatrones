package singleton;

public class Player {
    String name;
    //Volatile para que se almacene en la ram y no en la caché
    private static volatile Player player;

    private Player(String name) {
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.name = name;
    }


    public static synchronized Player getPlayer(String name){
        if(player == null){
            player = new Player(name);
        }
        return player;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}

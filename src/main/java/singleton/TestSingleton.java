package singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Thread threadPepe = new Thread(new RunPepe());
        Thread threadManolo = new Thread(new RunManolo());

        threadPepe.start();
        threadManolo.start();
    }

    static class RunPepe implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("Running pepe");
            System.out.println(player);
        }
    }

    static class RunManolo implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("Running manolo");
            System.out.println(player);
        }
    }
}

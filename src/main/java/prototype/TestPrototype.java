package prototype;

public class TestPrototype {
    public static void main(String[] args) {
        /*Enemy enemy1 = new Enemy(100,100);
        Enemy enemy2 = new Enemy();
        enemy2.setHealth(enemy1.getHealth());
        enemy2.setDamage(enemy1.getDamage());
        If where 100 attributes it will be tedious*/

        Warrior warrior1 = new Warrior(100, 100, 100);
        Warrior warrior2 = (Warrior) warrior1.clone();

        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("================");
        warrior2.setHealth(0);
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("================");
        Magician magician1 = new Magician(100, 100, 100);
        Magician magician2 = (Magician) magician1.clone();

        System.out.println(magician1);
        System.out.println(magician2);
        System.out.println("================");
        magician2.setHealth(0);
        System.out.println(magician1);
        System.out.println(magician2);

    }
}

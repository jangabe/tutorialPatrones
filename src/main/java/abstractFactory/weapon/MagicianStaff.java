package abstractFactory.weapon;

public class MagicianStaff implements Weapon{

    @Override
    public void damage() {
        System.out.println("Magician staff damage");
    }
}

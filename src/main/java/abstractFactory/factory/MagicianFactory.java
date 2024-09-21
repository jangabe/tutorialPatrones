package abstractFactory.factory;

import abstractFactory.armor.Armor;
import abstractFactory.armor.Robe;
import abstractFactory.enemy.Enemy;
import abstractFactory.enemy.Magician;
import abstractFactory.weapon.MagicianStaff;
import abstractFactory.weapon.Weapon;

public class MagicianFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Magician();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicianStaff();
    }
}

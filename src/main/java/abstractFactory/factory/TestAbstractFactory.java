package abstractFactory.factory;

import abstractFactory.armor.Armor;
import abstractFactory.enemy.Enemy;
import abstractFactory.weapon.Weapon;

public class TestAbstractFactory {

    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MagicianFactory();
        Enemy magician = factory.createEnemy();
        Armor robe =  factory.createArmor();
        Weapon magicianStaff = factory.createWeapon();
        magician.attack();
        robe.protect();
        magicianStaff.damage();
    }
}

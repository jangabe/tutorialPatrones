package prototype;

public class Magician extends Enemy{

    private int mana;

    public int getMana() {
        return mana;
    }

    public Magician setMana(int mana) {
        this.mana = mana;
        return this;
    }

    public Magician(Magician magician) {
        super(magician);
        if(magician != null){
            setMana(magician.getMana());
        }
    }

    @Override
    public Enemy clone() {
        return new Magician(this);
    }

    public Magician(int health, int damage, int mana) {
        super(health, damage);
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "mana=" + mana +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }

}

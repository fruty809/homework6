public class GameEntity {
    private static int hp;
    private static int damage;

    public static int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public static int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public GameEntity(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;


    }
}

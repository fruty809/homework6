public class Boss extends GameEntity{
    private static Weapon weapon;

    public static Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Boss(int hp, int damage, Weapon weapon) {
        super(hp, damage);

        this.weapon = weapon;

    }
    public String printInfo(){
        return "Boss HP: "+ Boss.getHp() +"|"+ "Boss damage"+ Boss.getDamage()+"|"+"Boss Weapon: "
                + Boss.getWeapon().getWeaponType() +"|"+ "Boss Weapon Name: " + Boss.getWeapon().getWeaponName();

    }
}

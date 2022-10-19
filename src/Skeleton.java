public class Skeleton extends Boss{
    private static int arrows;

    public static int getArrows() {
        return arrows;
    }

    public static void setArrows(int arrows) {
        Skeleton.arrows = arrows;
    }

    public Skeleton(int hp, int damage, Weapon weapon, int arrows) {
        super(hp, damage, weapon);
        this.arrows = arrows;
    }
    public  String printInfo(){
        return "Boss HP: "+ Boss.getHp() +" "+ "Boss damage"+ Boss.getDamage()+" "+"Boss Weapon: "
                + Boss.getWeapon().getWeaponType() +" "+ "Boss Weapon Name: " + Boss.getWeapon().getWeaponName() +" "+ "Arrows: " +
                arrows;

    }
}

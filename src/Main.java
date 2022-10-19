public class Main {
    public static void main(String[] args) {
        Boss boss1;
        boss1 = new Boss(550,50, new Weapon(WeaponType.MAGIC,"Stick"));
        System.out.println(boss1.printInfo());
        Skeleton skeleton1 = new Skeleton(120,10, new Weapon(WeaponType.MAGIC,"bow"),110);
        System.out.println(skeleton1.printInfo());
        Skeleton skeleton2 = new Skeleton(275,15, new Weapon(WeaponType.GUNSHOT,"CrossBow"),100);
        System.out.println(skeleton2.printInfo());
    }
}

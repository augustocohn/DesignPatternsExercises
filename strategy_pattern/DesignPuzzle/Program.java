
class Program {
    public static void main(String[] args) {
        Character queen = new Queen(new KnifeBehavior());
        queen.fight();
        queen.setWeapon(new SwordBehavior());
        queen.fight();

        Character king = new King(new BowAndArrowBehavior());
        king.fight();
        king.setWeapon(new GunBehavior());
        king.fight();

    }

}
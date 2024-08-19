
class Troll extends Character {

    public Troll(WeaponBehavior _weapon) {
        super(_weapon);
    }

    public void fight() {
        System.out.println("Troll fights!");
        this.weapon.useWeapon();
    }
}
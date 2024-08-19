
class Knight extends Character {

    public Knight(WeaponBehavior _weapon) {
        super(_weapon);
    }

    public void fight() {
        System.out.println("King fights!");
        this.weapon.useWeapon();
    }
}

class Queen extends Character {

    public Queen(WeaponBehavior _weapon) {
        super(_weapon);
    }

    public void fight() {
        System.out.println("Queen fights!");
        this.weapon.useWeapon();
    }

}
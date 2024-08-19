
abstract class Character {

    protected WeaponBehavior weapon;

    public Character(WeaponBehavior _weapon) {
        this.weapon = _weapon;
    }

    abstract public void fight();

    public void setWeapon(WeaponBehavior newWeapon) {
        this.weapon = newWeapon;
    }
    
}
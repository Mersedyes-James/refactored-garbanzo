package oop.characters;

public class Hero extends Character {

    private String name;

    public Hero(int hp, int attackDamage, int defenseValue, String name) {
        super(hp, attackDamage, defenseValue);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spAttack(){
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }

    @Override
    public void defend() {
        System.out.println("DEFENSE!");
    }

    public void spDefend(){
        System.out.println("Used special defend to avoid all damage!");
    }
}
package oop.characters;

import oop.characters.Character;

public class Enemy extends Character {

    public Enemy(int hp, int attackDamage, int defenseValue) {
        super(hp, attackDamage, defenseValue);
    }

    @Override
    public void attack() {
        System.out.println("Enemy Attack!");
    }

    public void spAttack(){
        System.out.println("Used Special Attack for " + spAttackDamage + " damage");
    }

    public void spDefend() {
        System.out.println("Used special defend to avoid all damage!");
    }

}
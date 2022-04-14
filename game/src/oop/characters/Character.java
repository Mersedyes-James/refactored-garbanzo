package oop.characters;

import static oop.characters.Defendable.baseDefenseValue;

public abstract class Character implements Attackable, Defendable, Rollable {

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int attackDamage = 0;
    protected int spAttackDamage = 20;
    protected int defenseValue = 0;

    public Character(int hp, int attackDamage, int defenseValue) {
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defenseValue = defenseValue;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public void attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage");
        }
    }

    private int attackResult;

    public void attackRoll(){
            int min = 1;
            int range = 20;
            int rand = (int) (Math.random() * range) + min;

            System.out.println("Attacker rolled a : " + rand);
            attackResult = rand;
        }

    private int defenseResult;

    public void defenseRoll(){
            int min = 1;
            int range = 20;
            int rand = (int) (Math.random() * range) + min;

        System.out.println("Defender rolled a: " + rand);
        defenseResult = rand;
    }

    private boolean attackHits;

    public void compare(){
        if(attackResult - defenseValue > defenseResult) {
            attackHits = true;
        } else {
            attackHits = false;
        }
    }


}

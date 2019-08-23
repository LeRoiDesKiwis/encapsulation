package fr.leroideskiwis.encap;

public class Heal {

    private int heal;

    public Heal(int heal){
        this.heal = heal;
    }

    public void heal(Health health){
        health.add(heal);
    }

}

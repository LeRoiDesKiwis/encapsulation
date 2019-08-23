package fr.leroideskiwis.encap;

public class Damage{

    private int damage;

    public Damage(int damage){
        this.damage = damage;
    }

    public void damage(Health health){
        health.remove(damage);
    }
}

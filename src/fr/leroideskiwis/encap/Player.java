package fr.leroideskiwis.encap;

public class Player implements Displayable {

    private Username name;
    private Health health;

    public Player(String name, int health) {
        this.name = new Username(name);
        this.health = new Health(health);
    }

    public void heal(Heal heal){
        heal.heal(health);
    }

    public void damage(Damage damage){
        damage.damage(health);
    }

    public boolean isDead(){
        return health.isEqualsTo(0);
    }

    @Override
    public void display() {
        System.out.println("Voici les caractéristiques du joueur : ");
        name.display();
        health.display();
        if(isDead())
            System.out.println("Le joueur est mort.");
        else
            System.out.println("Le joueur est vivant.");
        System.out.println();
    }
}

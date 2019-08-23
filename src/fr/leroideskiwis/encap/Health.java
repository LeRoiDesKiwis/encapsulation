package fr.leroideskiwis.encap;

public class Health implements Displayable{

    private int hp;

    public Health(int hp){
        this.hp = hp;
    }

    public boolean isEqualsTo(int hp){
        return this.hp == hp;
    }

    public boolean isLowerOrEqualsTo(int hp){
        return this.hp <= hp;
    }

    public void remove(int damage){
        hp-= damage;
    }

    public void add(int hp){
        this.hp+= hp;
    }

    @Override
    public String toString() {
        return Integer.toString(hp);
    }

    @Override
    public void display() {
        System.out.println("Le joueur à "+hp+" vies.");
    }
}
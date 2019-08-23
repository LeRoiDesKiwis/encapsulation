package fr.leroideskiwis.encap;

public class Health implements Displayable{

    private int hp;

    public Health(int hp){
        this.hp = hp;
    }

    public boolean isEqualsTo(int hp){
        return this.hp == hp;
    }

    public boolean isHigherThan(int hp){
        return this.hp > hp;
    }

    public void setToZero(){
        this.hp = 0;
    }

    public boolean isLowerOrEqualsTo(int hp){
        return this.hp <= hp;
    }

    public void damage(int damage){
        if(isHigherThan(damage))
            hp-= damage;
        else setToZero();
    }

    public void heal(int hp){
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

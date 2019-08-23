package fr.leroideskiwis.encap;

public class Username implements Displayable{

    private String name;

    public Username(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Le joueur s'appelle "+name+".");
    }
}

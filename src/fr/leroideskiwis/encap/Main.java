package fr.leroideskiwis.encap;

public class Main {

    public static void main(String... args){
        Player player = new Player("jean claude", 20);
        Player otherPlayer = new Player("machin", 18);
        player.display();
        otherPlayer.display();

        player.damage(30);
        otherPlayer.heal(20);

        player.display();
        otherPlayer.display();
    }

}

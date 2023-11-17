/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author Mr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("Ahmed");
        p1.setScore(5);
        System.out.println("his name is "+p1.getName());
        System.out.println("his score is "+p1.getScore());
    }
    
}

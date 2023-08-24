/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice_task_one;

import java.util.Scanner;

/**
 *
 * @author mbald
 */
public class Animal {
    int IDtag;
    String species;
    
    public Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter ID tag: ");
        IDtag = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Please enter species: ");
        species = scanner.nextLine();
    }

    public void output() {
        System.out.println("ID tag: " + IDtag);
        System.out.println("Species: " + species);
    }
    
}

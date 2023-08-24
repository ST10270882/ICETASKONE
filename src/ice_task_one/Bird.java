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
public class Bird extends Animal {
     int colour;
    
    public Bird(int IDtag, String species,int colour) {
        super(IDtag, species);
        this.colour = colour;
    }
     @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter feather colour (1=grey, 2=white, 3=black): ");
        colour = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        String featherColour;
        switch (colour) {
            case 1:
                featherColour = "Grey";
                break;
            case 2:
                featherColour = "White";
                break;
            case 3:
                featherColour = "Black";
                break;
            default:
                featherColour = "N/A";
        }
        System.out.println("Feather colour: " + featherColour);
    }
    
}

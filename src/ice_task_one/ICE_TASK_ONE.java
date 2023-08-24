/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice_task_one;

/**
 *
 * @author mbald
 */
public class ICE_TASK_ONE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bird brd = new Bird(0, "", 0);
        Reptile rept = new Reptile(0, "", 0.0);
        
        System.out.println("PLEASE ENTER BIRD DETAILS");
        brd.input();
        System.out.println("PLEASE ENTER REPTILE DETAILS");
        rept.input();

        System.out.println("Bird Details:");
        brd.output();
        System.out.println("======================================");
        System.out.println("Reptile Details:");
        rept.output();
       
    }
    
}

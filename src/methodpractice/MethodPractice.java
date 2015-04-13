/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodpractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Latacela
 */
public class MethodPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Call DisplayMessage()
        
     displayMessage("Message 1", 5);
     displayMessage("Message 2", 2);
     for(int i=0; i<10; i++)
         displayMessage("this message is in a loop", 2);
         
      String input= JOptionPane.showInputDialog("How was your Break?");
        System.out.println(input);
        JOptionPane.showMessageDialog(null, "HI thre argument!");
    
    }
    // Make a method called displayMessage().
    
    
     /**
      * Show a message on the console(Standard output).
      * @param message the message to display.
      * @param times the number of times to display the message.
      */
    //TODO:add two parametersm the message to be display and
    // the number of times to display it.
    public static void displayMessage(String message, int times){
    //TODO: move line 21 to displayMessage().
     for (int i = 0; i <times;i++){
         
        System.out.println(message);
     }
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dcs.java_assignment;

/**
 *
 * @author TzPing
 */
public class JavaAssignment {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Are you a stupid?");
        System.out.println("fuck you");
        Sleep.printSleep();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestUI().setVisible(true);
            }
        });
    }
}

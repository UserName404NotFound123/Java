/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcs.java_assignment;

/**
 *
 * @author TzPing
 */
public class Calculate {
    private int num1;
    private int num2;
    
    public Calculate(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double getCalculation(){
        return num1 + num2;
    }
}

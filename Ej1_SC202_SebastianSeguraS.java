/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_sc202_sebastianseguras;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Ej1_SC202_SebastianSeguraS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String employees = JOptionPane.showInputDialog("Ingrese la cantidad de empleados: ");
        int employee_cnt = Integer.parseInt(employees);
        
        int sal_cont = 0; // El contador para descontarle el salario a los empleados al final del ejericio.
        
        for (int i = 0; i < employee_cnt; i = i+1) 
        {
            String salary = JOptionPane.showInputDialog("Ingrese el salario del empleado "+(i+1)+" en colones."); 
            //Le pregunta el salario a la cantidad de empleados que introducimos antes
            int sal = Integer.parseInt(salary);
            
            int SEM = (int) (sal*0.0925);
            int IVM = (int) (sal*0.0508);
            
            sal_cont = sal_cont + sal - SEM - IVM;
        }
       
        
        System.out.println("La empresa debera abonar a la CCSS el monto de "+sal_cont+" colones por conecpto de SEM y IVM");
    }
    
}

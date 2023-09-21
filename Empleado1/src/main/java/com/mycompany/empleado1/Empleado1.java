/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empleado1;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTUDIANTE11
 */
public class Empleado1 {

    public static void main(String[] args) {
         int horas1 = 0;
        int horas = 3400;
        int horario_nocturno = 36000;
        int resultado = 0;
        int resultado1 = 0;
        int aseptar;
        int horas_extras;
        int aseptar1 = 1;
      
        
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a pagar"));
        
        aseptar = Integer.parseInt(JOptionPane.showInputDialog("1 si tuvistes horas extras"));
        if (aseptar == 1){
             
             JOptionPane.showMessageDialog(null,"si tuvistes horas extras ");
             horas_extras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas Extras"));
             resultado = horas_extras * horas;
             
             JOptionPane.showMessageDialog(null,"Pago Horas Extras " + resultado);
        } 
        else {
            JOptionPane.showMessageDialog(null,"no tuvistes horas extras ");
        }
        
  
             aseptar1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa 1 para horas extras"));
         if (aseptar1 == 1){
             
            
             JOptionPane.showMessageDialog(null,"si tuvistes horas nocturnas ");
             resultado1 = horas1 * horario_nocturno;
             JOptionPane.showMessageDialog(null,"Pago Horas nocturnas " + resultado1);
        } 
        else {
            JOptionPane.showMessageDialog(null,"no tuvistes horas nocturnas ");
        }
        
        int resultado2 = (int) (valor * 0.04);
        int resultado3 = (int) (valor * 0.08);
        int porcentaje_salud = resultado2 + resultado3;
        JOptionPane.showMessageDialog(null,"Porcentaje de la empresa y del empleado " + porcentaje_salud);
        JOptionPane.showMessageDialog(null,"Valor de pago que recibe el empleado " + (valor + resultado + resultado1));
    }
}

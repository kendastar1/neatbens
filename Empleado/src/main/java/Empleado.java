
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas1;
        int horas = 3400;
        int horario_nocturno = 36000;
        int resultado;
        int resultado1;
      
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a pagar"));
        int horas_extras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas Extras"));
        resultado = horas_extras * horas;
        JOptionPane.showMessageDialog(null,"Pago Horas Extras " + resultado);
        horas1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas nocturnas"));
        resultado1 = horas1 * horario_nocturno;
        JOptionPane.showMessageDialog(null,"Pago Horas nocturnas " + resultado1);
        int resultado2 = (int) (valor * 0.04);
        int resultado3 = (int) (valor * 0.08);
        int porcentaje_salud = resultado2 + resultado3;
        JOptionPane.showMessageDialog(null,"Porcentaje de la empresa y del empleado " + porcentaje_salud);
        JOptionPane.showMessageDialog(null,"Valor de pago que recibe el empleado " + (valor + resultado + resultado1));
       
        
        
        
        
        
        
        
        
    }
    
}

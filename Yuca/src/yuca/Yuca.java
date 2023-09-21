/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yuca;

/**
 *
 * @author ESTUDIANTE11
 */
public class Yuca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int pasteles = 552;
     int Costo_por_gramo_de_yuca = 2;
     double Costo_de_1_pastel = 0.75;
     int invierten = 19;
     double costo_de_un_pastel;
     double resultado;
     int resultado1;
    
      
     costo_de_un_pastel = (double) (Costo_de_1_pastel * invierten * Costo_por_gramo_de_yuca);
     resultado =  (double) (costo_de_un_pastel / Costo_por_gramo_de_yuca);
     System.out.println("costo de un pastel " + costo_de_un_pastel);
     System.out.println("Cantidad de yuca invertida en 1 pastel " + resultado);
     resultado1 = (int) (pasteles * resultado);
     System.out.println(""+ (resultado1 * Costo_por_gramo_de_yuca ));
     
    
    
     
     
     
     
     

        
      
        
        
        
        
    }
    
}

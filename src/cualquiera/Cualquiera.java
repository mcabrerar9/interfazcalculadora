/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cualquiera;

/**
 *
 * @author cmarj
 */
public class Cualquiera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int primerNumero=123;
        double notaDeProgra;
        String cadenaDeTexto;
        notaDeProgra=14.5;
        cadenaDeTexto="Hola a todos";
        // TODO code application logic here
          System.out.println("Hola a Todos, mi nota de progra es "+notaDeProgra);
          
           OperacionesAritmeticas calculadora;
        calculadora=new OperacionesAritmeticas();
        System.out.println(calculadora.sumar(12, 5));
        
        if(notaDeProgra>7){
            for(int i=0; i<=10; i++){
                System.out.println("Gane el Examen");
            }
        }else{
            System.out.println(":(");
        }
        
    }
    
}

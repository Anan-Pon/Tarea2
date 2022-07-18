package PrimerParcial;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        String operacion,valor1,operador,valor2; //Ingresa String
        
        System.out.print("Ingrese una operación aritmetica y separe sus componetes [Numero (tecla espaciadora) Operador Aritmetico (tecla espaciadora) Numero] usando la tecla espaciadora: ");
        
        operacion=entrada.nextLine(); //Ingreso de la Operacion
        
        valor1=operacion.split(" ")[0];   // Separando la cadena >
        operador=operacion.split(" ")[1]; // > en valores >
        valor2=operacion.split(" ")[2];   // > Independientes
        
        double doblevalor1=Double.valueOf(valor1); // Se convierten en > 
        double doblevalor2=Double.valueOf(valor2); // > valores Integer
        
        String suma="+", resta="-", mult="*", div="/"; // Ingreso de elementos
                                                       // comparar para evaluar
            
            if(operador.equals(suma)){ // String.equals(String) - Compara los elementos del arreglo 
                
                System.out.println(doblevalor1+doblevalor2);
                
            }
            
            if(operador.equals(resta)){      
                
                System.out.println(doblevalor1-doblevalor2);    
                
            }
            
            if(operador.equals(div)){      
                
                System.out.println(doblevalor1/doblevalor2);     
                
            }
            
            if(operador.equals(mult)){             
                
                System.out.println(doblevalor1*doblevalor2);    
                
            }
            
    }
      
}
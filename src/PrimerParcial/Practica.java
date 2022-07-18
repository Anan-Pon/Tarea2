package PrimerParcial;

public class Practica {

    public static void main(String[] args) {
        
    Math.floor(5.56); //Clase invocada sin necesidad de invocar porque java.lang ya está cargada
                      //Devuelve el entero mas cercano inferior
        System.out.println("Math.floor(5.56)="+Math.floor(5.56));
        System.out.println("Math.ceil(5.56)="+Math.ceil(5.56));
        System.out.println("Math.max(4,7)="+Math.max(4,7));
        System.out.println("Math.min(4,7)="+Math.min(4,7));
        System.out.println("Math.pow(2,3)="+Math.pow(2,3));
        
        // Transformando una variable  otra
        
        int x= (int)Math.pow(2,3);
        
        System.out.println("int x= (int)Math.pow(2,3)="+x);
        
        // Random (Numero de 0 a 1)
        
        System.out.println("Random="+Math.random());
        
    }
    
}
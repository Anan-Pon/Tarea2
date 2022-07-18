package PrimerParcial;

public class Test {

    public static void main(String[] args) {
     
        String a[]={"a","e","i","o","-"};
        
        String search="-";
        
        for (int i = 0; i <a.length; i++) {
            
            if (search==a[i]) {
                
                System.out.println("Encontramos el -");
                
            }else{
            
                System.out.println("No se encontró el +");
            
            }
            
        }
        
    }
    
}
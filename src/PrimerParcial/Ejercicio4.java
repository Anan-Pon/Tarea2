package PrimerParcial;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        
        String a;
        
        String b;
        
        String c;
        
        System.out.print("Ingrese la Primera cadena: ");
        
        a=entrada.nextLine();
        
        System.out.print("Ingrese la Segunda cadena: ");
        
        b=entrada.nextLine();
        
        System.out.print("Ingrese la Tercera cadena: ");
        
        c=entrada.nextLine();
        
        System.out.println("01. "+a+" "+b+" "+c); // ABC
        
        System.out.println("02. "+a+" "+c+" "+b); // ACB 
        
        System.out.println("03. "+b+" "+a+" "+c); // BAC
        
        System.out.println("04. "+b+" "+c+" "+a); // BCA
        
        System.out.println("05. "+c+" "+a+" "+b); // CAB
        
        System.out.println("06. "+c+" "+b+" "+a); // CBA
        
    }
    
}
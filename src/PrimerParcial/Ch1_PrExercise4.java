package PrimerParcial;

import java.util.Scanner;

public class Ch1_PrExercise4 {

    public static void main(String[] args) {
        
        Scanner console=new Scanner (System.in);
        
        //variable declaration
        
        final int SECRET=11;
        
        final double RATE=12.50;
        
        int num1;
        
        int num2;
        
        int newNum;
        
        String name;
        
        double hoursWorked;
        
        double wages;
        
        // executable statements
        
        System.out.print("Ingrese un Numero Entero: ");
        
        num1=console.nextInt();
        
        System.out.print("Ingrese un Numero Entero: ");
        
        num2=console.nextInt();
        
        System.out.println("The value of num1="+num1+" and the value of num2="+num2);
        
        newNum=(num1*2)+num2;
        
        System.out.println("newNum="+newNum);
        
        newNum+=SECRET;
        
        System.out.println("El nuevo valor de newNum es: "+newNum);
        
        System.out.print("Ingrese su Nombre: ");
        
        name=console.next();
        
        System.out.print("Ingrese un valor decimal que esté entre 0 y 70: ");
        
        hoursWorked=console.nextDouble();
        
        wages=RATE*hoursWorked;
        
        System.out.println("Name: "+name);
        
        System.out.println("Pay Rate: "+RATE);
        
        System.out.println("Hours Worked: "+hoursWorked);
        
        System.out.println("Salary: "+wages);
        
    }
    
}
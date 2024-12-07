/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Calculadora;
import java.util.*;
/**
 *
 * @author damar
 */
public class Calculadora {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
    Scanner sc=new Scanner(System.in);
    int veces,n1,n2,res, opc;
//    String opc;
        System.out.println("-----------CALCULADORA NORMAL-----------");
        System.out.println("Cuantas veces quieres que se repita la calculadora");
        veces=sc.nextInt();
        for(int i=1; i<=veces;i++){
            
        }
        System.out.println("Escoge alguna de las siguientes opciones\n 1-Suma \n 2-Resta \n 3-Multiplicacion \n 4-Division");
         opc= sc.nextInt();
//        opc=sc.nextLine();
         switch(opc){
             case 1:
                 System.out.println("Ingresa N1");
                 n1=sc.nextInt();
                 System.out.println("Ingresa N2");
                 n2=sc.nextInt();
                 res=n1+n2;
                 System.out.println("La Suma es: "+res);
                 break;
             case 2:
                 System.out.println("Ingresa N1");
                 n1=sc.nextInt();
                 System.out.println("Ingresa N2");
                 n2=sc.nextInt();
                 res=n1-n2;
                 System.out.println("La Resta es: "+res);
                 break;
//             case "M"
             case 3:
                 System.out.println("Ingresa N1");
                 n1=sc.nextInt();
                 System.out.println("Ingresa N2");
                 n2=sc.nextInt();
                 res=n1*n2;
                 System.out.println("La Multiplicacion es: "+res);
                 break;
             case 4:
                 double res1;
                 System.out.println("Ingresa N1");
                 n1=sc.nextInt();
                 System.out.println("Ingresa N2");
                 n2=sc.nextInt();
                 res1=n1/n2;
                 System.out.println("la Division es: "+res1);
                 break;
             case 5:
                 
                 break;
                 
                         
                 
         }
        
    }
}

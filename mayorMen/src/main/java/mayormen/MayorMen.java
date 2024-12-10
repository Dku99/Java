/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mayormen;
import java.util.*;
/**
 *
 * @author damar
 */
public class MayorMen {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int edad;
        System.out.println("ingresa tu edad");
        edad=sc.nextInt();
        if(edad>=18){
            System.out.println("eres mayor de edad");
        }
        else{
            System.out.println("eres menor de edad");
        }
    }
}

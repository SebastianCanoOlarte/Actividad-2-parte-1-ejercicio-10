/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero10;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero10 {

    public static void main(String[] args) {
        double A,B,C,D;
        Scanner input = new Scanner(System.in);
        System.out.println("peso bola A");
        A = input.nextDouble();
        System.out.println("peso bola B");
        B = input.nextDouble();
        System.out.println("peso bola C");
        C = input.nextDouble();
        System.out.println("peso bola D");
        D = input.nextDouble();
        if(A==B && A==C){
            System.out.println("la bola D es la diferente y");
            if(D>A){
                System.out.println("es de mayor peso");
            }
            else{
                System.out.println("es de menor peso");
            }
        }
        else if (A==B && A==D){
            System.out.println("la bola C es la diferente y");
            if(C>A){
                System.out.println("es de mayor peso");
            }
            else{
                System.out.println("es de menor peso");
            }
        }
         else if (A==C && A==D){
            System.out.println("la bola B es la diferente y");
            if(B>A){
                System.out.println("es de mayor peso");
            }
            else{
                System.out.println("es de menor peso");
            }
        }
         else{
             System.out.println("la bola A es la diferente y");
             if(A>B){
                 System.out.println("es de mayor peso");
             }
             else{
                 System.out.println("es de menor peso");
             }
        }
        
    }
}

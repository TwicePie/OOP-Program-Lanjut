/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;
import java.util.Scanner;
/**
 *
 * @author EKA
 */
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean inputbenar = false;
        while(!inputbenar){
            System.out.print("Masukkan sebuah angka : ");
            try{
                int number = input.nextInt();
                System.out.println("Anda memasukkan angka :" +number);
                inputbenar = true;
            }catch(Exception e){
                System.out.println("Input bukan angka");
                input.next();
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1;

/**
 *
 * @author EKA
 */
public class LogicErrorExample {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    
    public static int factorial(int n){
        int result = 4;
        for(int i = 1; i< n;i++){
            result *= i;
        }
        return result;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PakAmin_002;

/**
 *
 * @author EKA
 */
class okeh{
    int arrValue[];

    public okeh(int[] arrValue) {
        this.arrValue = arrValue;
    }
    
    public void Minmax(){
        int max = arrValue[0];
        for(int i = 0; i<arrValue.length ; i++){
            if(arrValue[i] > max){
                max = arrValue[i];
            }
        }
        
        System.out.println("Nilai Max / tertingginya adalah : " +max);
        
        for(int i = 0; i<arrValue.length ;i++){
            if(arrValue[i] < max){
                max = arrValue[i];
            }
        }
        
        System.out.println("Nilai Min / terendahnya adalah : " +max);
    }
}
public class MinMaxArray {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        okeh kelas = new okeh(array);
        kelas.Minmax();
    }
}

package com.mycompany.tugas1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author EKA
 */
class oke{
    int arrNilai[];

    public oke(int[] arrNilai) {
        this.arrNilai = arrNilai;
    }
    
    public void hitungArray(){
        
        
        for(int i = 0;i < arrNilai.length;i++){
            System.out.print(arrNilai[i]+" ");
        }
    }
    
    public void rata2(){
        int total = 0;
        int rata;
        
        for(int i = 0;i < arrNilai.length;i++){
            total = total +arrNilai[i];
        }
        
        rata = total / arrNilai.length;
        System.out.println("Rata rata : "+rata);
    }
}

class MinMaxArray{
    int ArrNilai[];

    public MinMaxArray(int[] ArrNilai) {
        this.ArrNilai = ArrNilai;
    }
    
    public void MinMax(){
        int max = ArrNilai[0];
        for(int i = 0; i<ArrNilai.length ; i++){
            if(ArrNilai[i] > max){
                max = ArrNilai[i];
            }
        }
        
        System.out.println("Nilai Max / tertingginya adalah : " +max);
        
        for(int i = 0; i<ArrNilai.length ;i++){
            if(ArrNilai[i] < max){
                max = ArrNilai[i];
            }
        }
        
        System.out.println("Nilai Min / terendahnya adalah : " +max);
        
    }
}

public class CobaRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[];
        System.out.print("Masukkan jumlah array : ");
        int jumlahArray = input.nextInt();
        arr = new int[jumlahArray];
        for(int i = 0; i < jumlahArray;i++){
            System.out.print("nilai ke-" + (i+1)+ " : " );
            int array = input.nextInt();
            arr[i] = array;
        }
        
        MinMaxArray MMArray = new MinMaxArray(arr);
        oke yoi = new oke(arr);
        yoi.hitungArray();
        yoi.rata2();
        MMArray.MinMax();
    }
}

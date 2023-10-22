/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PakAmin_002;
import java.util.Scanner;
/**
 *
 * @author EKA
 */
class rata{
    int arrNilai[];

    public rata(int[] arrNilai) {
        this.arrNilai = arrNilai;
    }
    
    public void hitungArray(){
        int total_nilai = 0;
        for(int i = 0; i<arrNilai.length; i++){
            total_nilai = total_nilai + arrNilai[i];
        }
        System.out.println("totalnya adalah : "+total_nilai); //total dalam Array
        
        total_nilai = total_nilai / arrNilai.length;
        System.out.println("Rata ratanya : "+total_nilai);
    }
}
public class RataArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[];
        System.out.print("Masukkan Jumlah Array : ");
        int jumlahArray = input.nextInt();
        arr = new int[jumlahArray];
        rata rata = new rata(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print("masukkan array ke-"+(i+1)+" : ");
            arr[i] = input.nextInt();
        }
        rata.hitungArray();
    }
}

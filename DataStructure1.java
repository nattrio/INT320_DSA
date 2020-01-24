/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.pkg1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Asus
 */
public class DataStructure1 {

    public static void main(String[] args) {

        {
            int n, temp;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            n = s.nextInt();
            int a[] = new int[n];
            int[] test01 = new int[n];
            int[] test02 = new int[n];
            
            for (int i = 0; i < n; i++) {
                Random rd = new Random();
                a[i] = rd.nextInt(1000);
            }

            System.arraycopy(a, 0, test01, 0, a.length);
            System.arraycopy(a, 0, test02, 0, a.length);
            
            long begin = System.currentTimeMillis();

//            for (int i = 0; i < n; i++) {
//                for (int j = i + 1; j < n; j++) {
//                    if (test01[i] > test01[j]) {
//                        temp = test01[i];
//                        test01[i] = test01[j];
//                        test01[j] = temp;
//                    }
//                }
//            }

            for (int i = (test01.length - 1); i >= 0; i--) {
                for (int j = 1; j <= i; j++) {
                    if (test01[j - 1] > test01[j]) {
                        temp = test01[j - 1];
                        test01[j - 1] = test01[j];
                        test01[j] = temp;
                    }
                }
            }

            long time01 = System.currentTimeMillis() - begin;


            begin = System.currentTimeMillis();
            Arrays.sort(test02);
            long time02 = System.currentTimeMillis() - begin;
            
            System.out.println("My Bubble sort: " + time01 + " Milli sec");
            System.out.println("Array.sort: " + time02 + " Milli sec");
            
//            System.out.print("Ascending Order:");
//            for (int i = 0; i < n - 1; i++) {
//                System.out.print(test01[i] + ",");
//            }
//            System.out.println(test01[n - 1]);
        }
    }
    
public static void mergeSort(){
    
}

}

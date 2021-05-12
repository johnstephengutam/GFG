package com.Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//bruteforce method
public class Rotation1 {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int temp[] = new int[a.length];
        int k =0;

        //copy first d letters to temp[]
        int i = 0;
        for(; i < d; i++){
            temp[i] = a[i];
            k++;
        }
        //shift the remaining array elements to the left
        int j =0;
        for(; j < a.length && k < a.length; j++){
            a[j] = a[k];
            k++;
        }
        
        //copy the temp elements to the array 
        i =0;
        for(; j < a.length; j++){
            a[j] = temp[i];
            i++;
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

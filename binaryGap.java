// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import javax.xml.transform.Result;

public class binaryGap {
    public static void main(String[] args) {
        int bg = solution(647); //bt is binary in int form (BinaryText)

        System.out.println("The maximum binary gap is: " + bg);
        


    }
    // public static int intToBinary(int N) {
    public static int solution(int N) {
        double n = Double.valueOf(N);
        String bin = "";
        while (n > 0) {
            if (n % 2 > 0) {
                bin = bin + "1";
            }
            if (n % 2 == 0) {
                bin = bin + "0";
            }
            n = Math.floor(n/2); 
        // Implement your solution here 1110000101
    }
    bin = new StringBuilder(bin).reverse().toString();
    System.out.println(bin);


    // procedure for counting gaps between 1's
    boolean started = false;
    int counter = 0;
    int maxCount = 0;
    for (int i = 0; i < bin.length(); i++) {
    String c = bin.substring(i, i+1);
    if (c.equals("1")) { // if 1 encountered and started == true, then stop counting
        if (started = true) {
            if (counter > maxCount) { 
                maxCount = counter;
                started = false;
            }
            counter = 0;
            started = false;
            } else {// if "1" and started = false, stop counting and keep started == false
            counter = 0;
            //started = false;
        }
        }
    if (c.equals("0")) {
        if (started = true) {
            counter = counter + 1; // if "0" and started == true, add to counter
            // if (counter > maxCount) {
            //     maxCount = counter;
            // } 
        } else { //if "0" and started == false, add to counter and set started to true
            started = true;
            counter = counter + 1;
            // if (counter > maxCount) {
            //     maxCount = counter;
            // }
        }
    }
    }

    // return both the binary number and the binary gap
    return maxCount;
    }
    }

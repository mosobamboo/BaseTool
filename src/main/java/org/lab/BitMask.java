package org.lab;

/**
 *
 * A,B,C
 *
 * A,100,2 ^ 2
 * B,010,2 ^ 1
 * C,011,2 ^ 0
 *
 * 1L << length-i-1
 */


public class BitMask {
    public static void main(String[] args) {
        int [] items = {5,4,3,2,1,0};
        for(int item : items){
            long bitmask = 1L << item;
            System.out.println(bitmask);
        }
    }
}

package com.software;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }

    public static void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int p = nums.length-k;
        int i=0;
        for(i=0;p<nums.length;i++){
            arr[i]=nums[p];
            p++;
        }
        for(int j=0;j<nums.length-k;j++){
            arr[i]=nums[j];
            i++;
        }
        System.arraycopy(arr, 0, nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
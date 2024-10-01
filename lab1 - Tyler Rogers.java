
/*
 * IT-2660 - Lab 1
 * Student Name: Tyler Rogers 
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world!");
        Lab1 lab = new Lab1();
        int[] values = {5, 9, 3, 12, 7, 3, 11, 5};
        System.out.println("Array in order:");
        int i = 0;
        while (i < values.length) {
            System.out.print(values[i] + " ");
            i++;
        }
        System.out.println();
        System.out.println("Array in reverse:");
        for (int j = values.length - 1; j >= 0; j--) {
            System.out.print(values[j] + " ");
        }
        System.out.println();
        System.out.println("First value: " + values[0]);
        System.out.println("Last value: " + values[values.length - 1]);
        System.out.println("Max of 5 and 9: " + lab.max(5, 9));
        System.out.println("Min of 5 and 9: " + lab.min(5, 9));
        System.out.println("Sum of array: " + lab.sum(values));
        System.out.println("Average of array: " + lab.average(values));
        System.out.println("Max of array: " + lab.max(values));
        System.out.println("Min of array: " + lab.min(values));
    }
}
class Lab1 {
    public int increment(int num) {
        return ++num;
    }
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    public int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }
    public double average(int[] nums) {
        double total = 0;
        for (int num : nums) {
            total += num;
        }
        return total / nums.length;
    }
    public int max(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }
    public int min(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }
}

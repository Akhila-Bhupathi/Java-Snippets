import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Exmaple {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n ;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        
        int[] result = twoSum(array, target);
        System.out.println("The result is :");
        for (int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
    }
    
    public static int[] twoSum(int[] a, int t) {
        Map<Integer,Integer> h = new HashMap<>();
        
        for(int i=0; i<a.length; i++) {
            if(h.containsKey(t-a[i])) {
                return new int[] {h.get(t-a[i]), i};
            }
            h.put(a[i],i);
        }
        return new int[] {};
        
    }
}

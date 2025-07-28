import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     int n1 = sc.nextInt();
     int n2 = sc.nextInt();
     int n3 = sc.nextInt();
     int n4 = sc.nextInt();
     int n5 = sc.nextInt();
     int total = n1+n2+n3+n4+n5;
     float avg = (float)(n1+n2+n3+n4+n5)/5.0f;
     System.out.println("Name of the Student:"+s);
     System.out.println("Total marks:"+total);
     System.out.printf("Average marks:%.1f",avg);

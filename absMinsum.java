import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j,sum=0,minsum=0,e1,e2;
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        minsum=Math.abs(arr[0]+arr[1]);
        e1=arr[0];
        e2=arr[1];
        for(i=0;i<arr.length-1;i++){
            for(j=i+1;j<arr.length-1;j++){
            sum=Math.abs(arr[i]+arr[j]);
                if(sum<minsum){
                    minsum=sum;
                     e1=arr[i];
                      e2=arr[j];
                }
        }
        }System.out.print(e1+" ");
        System.out.print(" "+e2);
    }
}

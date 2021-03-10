package labo2;
import java.io.*;
        
public class LABO2 {
    
    private static int validInt(String text){
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        boolean goodData = false;
        int data = -1;
        
        while(!goodData){
            try {
                System.out.print(text);
                
                data = Integer.parseInt(in.readLine());
                goodData = true;
            }
            
            catch (Exception e) {
                System.err.println("Error: this is not int! Try again!");
                goodData = false;
            }
        }
        return data;
    }

    //zero = true mean that zero is acceptabled
    public static int validPositiveInt(String text, boolean zeroAcceptabled){
        
        boolean goodData = false;
        int result = -1;
        
        while(!goodData){
            result = validInt(text);
            
            if (!zeroAcceptabled && result <= 0){
                System.err.println("Error: this is not value greater than zero");
                goodData = false;
            }
            else if (zeroAcceptabled && result < 0){
                System.err.println("Error: this is not value greater or equel zero");
                goodData = false;
            }
            else
                goodData = true;
        }
        
        return result;
    }
    
    private static int[] makeArr(int n){
        int []arr=new int[n];

        System.out.println("Write " + n + " numbers!");
        
        for(int i=0; i<n; i++)
            arr[i] = validInt("arr[" + i + "] = ");
        
        return arr;
        
    }

    private static void showArr(int [] arr){
        for(int i=0; i<arr.length; i++)
            System.out.println("arr["+i+"] = " + arr[i]);
    }
    
    private static void showShortArr(int [] arr){
        for(int i=0; i<arr.length; i++){
            if (i==0)
                System.out.print("arr[] = { ");
            System.out.print(arr[i]);
            if (i==arr.length-1)
                System.out.println(" }");
            else
                System.out.print(", ");
        }
    }
    
    private static void showShortArrReversed(int [] arr){
        for(int i=arr.length; i>0; i--){
            if (i==arr.length)
                System.out.print("arr[] = { ");
            System.out.print(arr[i-1]);
            if (i==1)
                System.out.println(" }");
            else
                System.out.print(", ");
        }
    }
    
    private static int [] sunOneByOne(int []a, int[]b){
        if(a.length != b.length){
            int[] result = { -1 };
            return result;
        }
        else{
            int[] result = new int[a.length];
            for(int i=0; i<a.length; i++)
                result[i]=a[i] + b[i];
            return result;
        }
    }
    
    public static void main(String[] args){
        
        //Making array static 
        int []arr1={1,2,3,4,5};
        showArr(arr1);
        
        //Making array by user
        int n = validPositiveInt("How big array? ", false);
        int []arr2=makeArr(n); 
        showArr(arr2);
        
        // Run function what will show array in reversed order
        showShortArrReversed(arr2);
        
        int [] sum = sunOneByOne(arr1, arr2);
        
        if(sum.length == 1 && sum[0] == -1)
            System.err.println("The array size needs to be 5!");
        else{
            System.out.println("Sum arrays");
            showShortArr(arr1);
            showShortArr(arr2);
            showShortArr(sum);
        }
    }
}
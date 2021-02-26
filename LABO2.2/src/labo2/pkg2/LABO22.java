package labo2.pkg2;
import java.io.*;

public class LABO22 {
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
    
    private static int [][] transponeArray2(int [][] arr){
        int [][] array = new int[arr[0].length][arr.length];
        for(int i=0; i<arr[0].length; i++)
            for(int s=0; s<arr.length; s++)
                array[i][s] = arr[s][i];
        return array;
    }
    
    private static int[][] makeArray2(int n, int m){
        int[][] result = new int[n][m];
    
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                result[i][j] = validInt("arr["+i+"]["+j+"] = ");
        return result;
    }
    
    private static void showShortArray2(int [][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int r = validPositiveInt("How many rows? ", false);
        int c = validPositiveInt("How many columns? ", false);
        
        int [][]array = makeArray2(r, c);
        showShortArray2(array);
        showShortArray2(transponeArray2(array));
    }
}

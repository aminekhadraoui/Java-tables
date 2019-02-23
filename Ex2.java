package ex2;
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    int k[] = new int [10];
    int n ;        
            do{
            System.out.println("Put N : ");
            n = input.nextInt();   
            }while( n < 5);
            for (int i=0;i<n;i++){
            System.out.println("Table ["+i+"]");
            k[i] = input1.nextInt();
            }
            for (int i =0;i<n;i++){
            
            System.out.println(k[i]);
            }
        
    }
    
}

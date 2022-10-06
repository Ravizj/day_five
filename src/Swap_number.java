import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Swap_number {

    public static void main(String[]args){
        int  t;// x and y are to swap
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X ");
       int x = sc.nextInt(); System.out.println("Enter the value of Y");
       int y = sc.nextInt();
        System.out.println("before swapping numbers: "+x +"  "+ y);
        /*swapping */
        t = x;
        x = y;
        y = t;
        System.out.println("After swapping: "+x +"   " + y);
        System.out.println( );
    }

}

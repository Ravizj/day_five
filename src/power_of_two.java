import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number 2 for table= ");
        int num=n.nextInt();
                int exponent = 4;

        long result = 1;

        for (; exponent != 0; --exponent) {
            result *= num;

            System.out.println("Power of"+ num+"= " + result);
        }


    }
}
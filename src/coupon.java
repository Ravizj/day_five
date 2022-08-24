import java.sql.SQLOutput;
import java.util.Random;

public class coupon {
    public static void main(String[] args){
        String str="";
        String alfabate= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNIPQRSTUVWXYZ0123456789";
        System.out.println("legth: "+alfabate.length());
        Random r = new Random();
        for(int i=0;i<=8;i++){
            char ch= alfabate.charAt(r.nextInt(alfabate.length()));
            str =String.valueOf(ch)+str;

        }
        System.out.println(str);
    }

}

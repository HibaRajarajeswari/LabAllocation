import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int v;
        int a;
        int b;
        int c;
        Scanner s = new Scanner(System.in);
         v = s.nextInt();
         a=s.nextInt();
         b=s.nextInt();
         c=s.nextInt();
         determine(a,b,c,v);
    }
static void determine(int  a,int b,int c,int v){
        if(v<=a )
        {
            System.out.println("lab 1");
        }
        else if(v>a && v<b && v>= b ){
            System.out.println("lab 2");
        }
        else  {
            System.out.println("lab 3");
        }

    }
}

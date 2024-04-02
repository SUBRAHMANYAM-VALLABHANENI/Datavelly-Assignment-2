import java.util.Scanner;
public class swapping {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swapping a: "+a+" b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Before swapping a: "+a+" b: "+b);
    }
}
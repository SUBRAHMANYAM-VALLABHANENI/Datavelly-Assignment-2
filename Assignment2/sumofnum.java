import java.util.Scanner;
class sumofnum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            count+=arr[i];
        }
        System.out.print(count);
    }
}
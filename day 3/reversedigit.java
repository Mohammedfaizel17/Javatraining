import java.util.Scanner;

public class reversedigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        int sum=0;
        int rem=0;
        while(n!=0)
        {
            rem=n%10;//3//2
            sum=sum*10+rem;//321
            n=n/10;//12//1
        }System.out.println(sum);
    }
    
}

import java.util.Scanner;

public class fibonagci {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n,i,sum,n1,n2;
        System.out.print( " Fibonacci Serisi Icin Sayi Gir:");
        n= inp.nextInt();
        sum=0;
        n1=0;
        n2=1;

        System.out.print(n+ "  Haneli Fibonacci Serisi :");
        for(i=1;i<=n;i++){

            sum=n1+n2;
            System.out.print(n1+ " ");
            n1=n2;
            n2=sum;












        }
    }
}

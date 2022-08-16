import java.util.Scanner;

public class day_fourpractice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int pod=1;
        int sod=0;
        int count=0;

        while(n>0){
            int rem=n%10;
             sod+=rem;
             pod*=rem;
             n=n/10;




        }
        System.out.println(pod-sod);



    }


}

import java.util.Scanner;
import java.util.ArrayList;
public class find{
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        System.out.println("enter a number");
        int numtar = ask.nextInt();
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= numtar; i++) {
            if (checkprime(i) == 2) {
                primes.add(i);


            }
        }
        System.out.println(primes);
    }
    public static int checkprime(int somenum) {
            int factorcount = 0;
            for(int i = 1; i <= somenum;i++){
                if (somenum%i ==0){
                    factorcount += 1;
                }

            }
            return factorcount;


    }


}
import java.util.Scanner;

public class loopingadd{
    public static void main(String[] args) {
        Scanner getinput = new Scanner(System.in);
        int sum = 0;
        int input;
        System.out.println("Enter first number to be added");
        while((input = getinput.nextInt())!= 0){
            sum += input;
            System.out.println("enter next number to be added");

        }
        System.out.println("sum is:"+sum);

    }

}
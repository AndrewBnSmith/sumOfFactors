import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer greater than 1:");
        int n = scan.nextInt();
        int count = 1;
        int sum=0;

        while(count <= n){
            if(n % count == 0){
                System.out.println(count);

                sum += count;
            }
            ++count;

        }
        System.out.println("The sum of all factors of" + " " + n + " " + "is" + " " +sum);
    }
}
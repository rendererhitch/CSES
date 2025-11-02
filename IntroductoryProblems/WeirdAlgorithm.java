import java.util.Scanner;

public class WeirdAlgorithm {
    private static void weirdAlgoSolution(long n){
        System.out.print(n+" ");
        while (n!=1){
            if (n%2==0){
                n/=2;
            } else{
                n=n*3+1;
            }
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        weirdAlgoSolution(n);
    }
}

import java.util.Scanner;

public class Repetitions {
    public static int maxRepetitions(String s){
        int count = 0;
        int maxCount = 0;
        int i = 0, j = 0;
        while (j<s.length()){
            char curr = s.charAt(i);
            while (j<s.length() && curr==s.charAt(j)){
                j++;
                count++;
            }
            maxCount = Math.max(maxCount, count);
            count = 0;
            i = j;
        }

        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int res = maxRepetitions(s);
        System.out.println(res);

        sc.close();
    }
}

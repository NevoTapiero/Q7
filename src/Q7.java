import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int[]num1 = new int[20];
        int num2,a,b,num3;
        Scanner s = new Scanner(System.in);
        for(int i = 0;i < 20;i++) {
            System.out.println("give me two positive numbers pls");
            num1[i] = s.nextInt();
            num1[i + 1] = s.nextInt();
            i++;
        }
        for(int t = 0;t < 20;t++){
            a = num1[t];
            b = num1[t+1];
            num2 = num1[t] + num1[t+1];
            System.out.println("firs + second = " + num2);
            if(b == 0)
                System.out.println("indivisible");
            else {
                num3 = a / b;
                System.out.println("a / b = " + num3);
            }
            t++;
        }
    }
}

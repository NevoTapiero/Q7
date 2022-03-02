import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("how mach did you bought");
        int num1 = s.nextInt();
        boolean finalnum = shoping(num1);
        System.out.println(finalnum);
        int finalnum1 = shoping2();
        System.out.println(finalnum1 + " people have to pay postage");
    }
    public static boolean shoping(int num){
        Scanner s = new Scanner(System.in);
        int []prise1 = new int[num];
        int newNum = 0,counter = 0,prise2 = 0;
        for(int t = 0;t < num;t++) {
            System.out.println("how mach every single product cost to you");
            prise1[t] = s.nextInt();
        }
        for(int i = 0;i < prise1.length;i++)
            prise2 = prise2 + prise1[i];
        newNum = num * prise2;
        if(newNum >= 150)
            return true;
        else
            return false;
    }
    public static int shoping2(){
        Scanner s = new Scanner(System.in);
        int count = 0;
        boolean num;
        for(int i = 0;i < 850;i++){
            System.out.println("how mach did you bought");
            int num1 = s.nextInt();
            num = shoping(num1);
            if(num == false)
                count++;
        }
        return count;
    }
}

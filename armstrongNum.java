import java.util.Scanner;

public class armstrongNum {
    public static boolean armstrong(int n){
        int temp = n;
        int arm = 0;
        while(n>0){
            int last =n%10;
            arm = arm+(last*last*last);
            n = n/10;
        }
        if(arm == temp){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrong(n));
    }
}

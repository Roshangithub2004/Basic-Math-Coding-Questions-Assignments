import java.util.Scanner;

public class palindromeNum {
    public static boolean palindrome(int n){
        int num = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            num = (num*10) + rem;
            n= n/10;
        }
        if(num == temp){
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindrome(n));
        
    }
}

import java.util.Scanner;

public class primeNum {
    public static boolean prime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i ==0){
                count++;
                if(n/i==i){
                    count++;
                }
            }
        }
        if(count == 2) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
}

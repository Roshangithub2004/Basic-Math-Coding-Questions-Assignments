import java.util.*;

public class GCD {

    // Method 3:Here we are using a Eculidean Algorithm, the method 1 and method 2 is not optimize approach,
    // thid method 3 gives better time comlexity than method 1 and method 2.

    public static int gcd(int n, int m){
        while(n > 0 && m > 0){
            if(n > m){
                n = n% 10;
            }
            else{
                m = m%10;
            }
        }
        if(n==0) return m;
        return n;
    }
   
// Method 2 : here time complexity is O(min(m,n)), it is better approach than Method 1, it gives correct ans  
// public static int gcd(int n, int m){
//     int gcd = 1;
//     for(int i=Math.min(n,m); i>=1; i--){
//         if(n%i == 0 && m%i == 0){
//             gcd = i;
//             break;
//         }
//     }
//     return gcd;
// }

    // Method 1 : here time complexity is O(min(m,n))  but it is not  better approach
    // public static int gcd(int n, int m){
    //     int gcd = 1;
    //     for(int i=1; i<Math.min(n,m); i++){
    //         if(n%i == 0 && m%i == 0){
    //             gcd = i;
    //         }
    //     }
    //     return gcd;
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(gcd(n,m));
    }
}

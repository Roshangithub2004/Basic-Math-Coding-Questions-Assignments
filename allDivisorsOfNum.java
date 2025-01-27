import java.util.*;

public class allDivisorsOfNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // div(num);
        divisors(num);
    }

    // This fun gives O(n) time complexity

    // static void div(int n){
    //     for(int i=1;i<n;i++){
    //         if(n%i==0){
    //             System.out.println(i);
    //         }
    //     }
    // }

    // This fun gives O(qart) + O(num of fun) + O(num of fun)) time compexity 
    public static void divisors(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<Math.sqrt(n); i++){
            if(n%i == 0){
                list.add(i);
                
                if(n/i != i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+ " ");
        }
    
    }
}
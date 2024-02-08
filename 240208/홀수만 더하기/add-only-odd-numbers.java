import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        
        int sum = 0;

        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            if(s%2==1 && s%3==0){
                sum += s;
            }
        }
        System.out.print(sum);
    }
}
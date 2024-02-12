import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while(true){
            if(n>1){
            if(n%2==0){
                n=n/2;
                sum++;
            }
            else{
                n=n*3+1;
                sum++;
            }
            }
            if(n<=1){
                break;
            }
        }
        System.out.print(sum);
    }
}
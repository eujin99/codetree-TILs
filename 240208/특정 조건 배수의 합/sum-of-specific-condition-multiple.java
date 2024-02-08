import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = 0;


        if(a<b){
        for(int i=a; i<=b; i++){
            if(i%5==0){
                num+=i;
            }
        }
    }

        if(a>b){
         for(int i=b; i<=a; i++){
            if(i%5==0){
                num+=i;
            }
         }
    }
    System.out.print(num);
    }
}
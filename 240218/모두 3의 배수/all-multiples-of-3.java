import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean ss= false;
        int a;

        for(int i=1;i<=5;i++){
            a = sc.nextInt();
            if(a%3==0){
                ss=true;
            }
        }

        if(ss){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
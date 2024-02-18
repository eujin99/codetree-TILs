import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean ss= true;
        int a;

        for(int i=1;i<=5;i++){
            a = sc.nextInt();
            if(a%3!=0){
                ss=false;
                break;
            }
        }

        if(ss==true){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
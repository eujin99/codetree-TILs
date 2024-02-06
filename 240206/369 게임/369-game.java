import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            boolean z = false;
            if(i%10==3||i%10==6||i%10==9){
                z = true;
            }
            if(i%3==0){
                z = true;
            }
            if(z){
            System.out.print("0" + " ");
        }
        else{
            System.out.print(i + " ");
        }
        }
    
    }
}
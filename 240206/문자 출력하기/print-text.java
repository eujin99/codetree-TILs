import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        for(int i=1; i<=16; i++){
            System.out.print(a);
            i++;
        }
    }
}
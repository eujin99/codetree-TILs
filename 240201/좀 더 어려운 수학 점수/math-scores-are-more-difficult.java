import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int a_math = sc.nextInt();
        int a_eng = sc.nextInt();
        int b_math = sc.nextInt();
        int b_eng = sc.nextInt();

        int top_math = a_math;
        if (top_math < b_math){
            top_math = b_math;
        }
        
        if (top_math == a_math){
            System.out.println("A");
        }else if (top_math == b_math){
            System.out.println("B");
        }

        if(a_math == b_math){
            int top_eng = a_eng;
            if(top_eng < b_eng){
                System.out.println("B");
            } if(top_eng == a_eng){
                System.out.println("A");
            }
        }

    }
}
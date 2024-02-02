import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a_state = sc.next();
        int a_tem = sc.nextInt();

        String b_state = sc.next();
        int b_tem = sc.nextInt();

        String c_state = sc.next();
        int c_tem = sc.nextInt();

        if(a_state.equals("Y") && a_tem >=37){

            if((b_state.equals("Y") && b_tem >=37) || (c_state.equals("Y") && c_tem >=37))
                System.out.println("E");
                else
                System.out.println("N");
                
            }
            else{
                if((b_state.equals("Y") &&b_tem >=37) && (c_state.equals("Y") && c_tem >=37))
                    System.out.println("E");
                else
                System.out.println("N");
                
            }

        }




    }
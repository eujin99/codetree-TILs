import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int garo = sc.nextInt();
            int sero = sc.nextInt();
            String string = sc.next();

            int area = garo * sero;
            System.out.println(area);

            if(string.equals("C")) {
                break;
            }
        }
        sc.close();
    }
}
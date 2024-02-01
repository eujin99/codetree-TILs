import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        if(price>=3000){
            System.out.println("book");
        }else if(price>=1000){
            System.out.println("mask");
        }else if(price >=500){
            System.out.println("pen");
        }else{
            System.out.println("no");
        }
    }
}
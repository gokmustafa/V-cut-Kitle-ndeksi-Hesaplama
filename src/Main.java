import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        float boy, kilo;
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        boy = input.nextFloat();
        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextFloat();

        float index = kilo/(boy*boy);
        System.out.print(index);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter:");
float pogoda = scanner.nextFloat();

        if (pogoda < 0){
            System.out.println("cold");
         }else{
            System.out.println("hot");
    }
scanner.close();
}
}




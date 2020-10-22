import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Cześć! Program zakończy działanie, kiedy podasz własciwą liczbę całkowitą :)");
        Operations operations = new Operations(100, 200, 3);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Podaj liczbę: ");
        }while(operations.checkNumber(scanner.nextInt()));
    }
}

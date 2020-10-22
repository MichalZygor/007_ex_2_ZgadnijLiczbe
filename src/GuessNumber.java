import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.print("Cześć! Program zakończy działanie, kiedy podasz własciwą liczbę całkowitą :)");
        Operations operations = new Operations();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(operations.getComment());
            System.out.print("Podaj liczbę: ");
            operations.checkNumber(scanner.nextInt());
        }while(!operations.isStatus());
        System.out.println(operations.getComment());
    }
}

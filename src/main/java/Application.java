import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Informe o número da conta:");
      int accountNumber = scanner.nextInt();
      AccountNumberFormatter formatter = new AccountNumberFormatter();
      String accNumberToString = formatter.formatAccountNumber(accountNumber);
      System.out.printf("Número da conta: %s\n", accNumberToString);
    } catch (InputMismatchException e) {
      System.out.println("Número da conta inválido!");
    }

    scanner.close();

  }

}

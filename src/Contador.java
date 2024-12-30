import java.util.Scanner;
import java.util.Locale;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o primeiro número: ");
    int parametro1 = terminal.nextInt();  

    System.out.println("Digite o segundo número: ");                
    int parametro2 = terminal.nextInt();

    try {
      contar(parametro1, parametro2);
    } catch (ParametrosInvalidosException e) {
      System.out.println(e.getMessage());
    }
  }
  
  static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
    if(parametro1 > parametro2) {
      throw new ParametrosInvalidosException( "O primeiro parâmetro deve ser menor que o segundo." );
    }

    int contador = parametro2 - parametro1;

    for(int i = 1; i <= contador; i++){
      System.out.println("imprimindo numero: " + i);
    }
  }
}

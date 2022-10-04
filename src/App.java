import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner resultado = new Scanner(System.in);
       
       System.out.println("Digite um numero!"); 
       numero = resultado.nextInt(); 
        resultado.close();
      
        System.out.println("o numero informado foi:" +numero);
       
    }
}

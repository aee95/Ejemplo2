package bedu.ejemploclases;
import java.util.Scanner;
import java.io.Console;
public class Clases {
    public static void main(String[] args){
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero;
        numero = teclado.nextInt();
        System.out.println("Escriba otro numero: ");
        int numero2;
        numero2 = teclado.nextInt();
        System.out.println("La suma de los numero es: " + (numero+numero2));*/

        String user;
        char pss[];

        Console console = System.console();
        System.out.println("Ingrese un nombre de usuario: ");
        user = console.readLine();

        System.out.println("Ingrese un password: ");
        pss = console.readPassword();
        String a = String.valueOf(pss);

        System.out.println("Usuario: " + user + "\n" +"Contraseña: " + a + pss);
    }
}

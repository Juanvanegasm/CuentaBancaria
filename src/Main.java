import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo = 0;
        double saldoc;
        String nombre;
        String dir;
        String tel;
        int op;

        System.out.println("CUENTA BANCARIA");
        System.out.print("Ingrese su Nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese su Direccion: ");
        dir = teclado.next();
        System.out.print("Ingrese su Telefono: ");
        tel = teclado.next();

        do {
            System.out.println("""
            MENU DE OPCIONES
            1.Consignar
            2.Retirar
            3.Extraccion rapida 20%
            4.Consultar saldo
            5.Salir
            """);

            System.out.print("Elija una opción: ");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Ingrese valor a consignar: ");
                    saldoc = teclado.nextDouble();
                    saldo = saldo + saldoc;
                    System.out.println("Su saldo actual es: " + saldo);
                    break;


                case 2:
                    System.out.print("Ingrese valor a retirar: ");
                    saldoc = teclado.nextDouble();
                    if (saldoc <= saldo) {
                        saldo = saldo - saldoc;
                        System.out.println("Su saldo actual es: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;



                case 3:
                    saldoc = saldo * 0.2;
                    if (saldoc <= saldo) {
                        saldo = saldo - saldoc;
                        System.out.println("Se retiró el 20% de su saldo.");
                        System.out.println("Saldo actual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para extracción rápida.");
                    }
                    break;


                case 4:
                    System.out.println("Su saldo actual es: " + saldo);
                    break;



                case 5:
                    System.out.println("Hasta pronto");


                    System.out.println("Su saldo es: " + saldo);
                    System.out.println("Su nombre es: "+ nombre);
                    System.out.println("Su telefono es: "+ tel);
                    System.out.println("Su direccion es: " + dir);

                    break;

            }
        } while (op != 5);

        teclado.close();







    }
}






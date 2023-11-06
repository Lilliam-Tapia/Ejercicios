import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        CuentaBancaria banco = new CuentaBancaria();
        
        banco.setSaldo(1000);

        System.out.println("Cual es su nombre?: ");
        String nombre = lector.nextLine();
        banco.setNombre(nombre);
        System.out.println("Cual es su email?: ");
        String email = lector.nextLine();
        banco.setEmail(email);
        System.out.println("Introduzca el numero de cuenta: ");
        int numeroCuenta = lector.nextInt();
        banco.setNumeroCuenta(numeroCuenta);
        System.out.println("Introduzca su numero de telefono: ");
        int numeroTelefono = lector.nextInt();
        banco.setNumeroTelefono(numeroTelefono);
        
        
        System.out.println("Desea depositar o retirar?");
        System.out.println("Ingrese una opcion:");
        int  opc = lector.nextInt();
        switch(opc){
          case 1:
          System.out.println("Ingrese el monto a depositar: ");
          double monto = lector.nextDouble();
          if(monto <= 0){
            System.out.println("Ingrese un monto a depositar valido.");
          }
          case 2:
          System.out.println("Ingrese el monto a retirar: ");
           monto = lector.nextDouble();
          if(monto > 0 || monto < 1000){
            System.out.println("Su monto no es suficiente");
          }
          
        }
    }
    public static void depositar(double saldo){
    System.out.println("Saldo depositado: "+banco.getSaldo);
    }
}

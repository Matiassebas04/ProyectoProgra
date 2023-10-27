import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el número de cédula del cliente: ");
        String cedulaCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nombreCliente, cedulaCliente);

        System.out.print("Ingrese el tipo de vehículo (automovil o motocicleta): ");
        String tipoAuto = scanner.nextLine();

        System.out.print("Ingrese la placa del vehículo: ");
        String placaAuto = scanner.nextLine();

        System.out.print("Ingrese el tiempo en horas que se quedará el vehículo en el estacionamiento: ");
        int tiempoHoras = scanner.nextInt();

        Vehiculo vehiculo = new Vehiculo(tipoAuto, placaAuto);

        Estacionamiento estacionamiento = new Estacionamiento();
        estacionamiento.ingresarVehiculo(cliente, vehiculo, tiempoHoras);

        scanner.close();
    }
}

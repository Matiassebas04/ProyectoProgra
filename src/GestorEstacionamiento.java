
    import java.util.ArrayList;
import java.util.Scanner;

    public class GestorEstacionamiento {
        private Estacionamiento estacionamiento;
        private ArrayList<Cliente> clientesRegistrados;
        private ArrayList<Vehiculo> vehiculosEstacionados;
        private int tiempoHoras;

        public GestorEstacionamiento() {
            estacionamiento = new Estacionamiento();
            clientesRegistrados = new ArrayList<>();
            vehiculosEstacionados = new ArrayList<>();
            tiempoHoras = 0;
        }

        public void ejecutar() {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;

            while (continuar) {
                System.out.print("Ingrese el nombre del cliente (nombre y apellido): ");
                String nombreCliente = scanner.nextLine();

                System.out.print("Ingrese el número de cédula del cliente: ");
                int cedulaCliente = scanner.nextInt();
                scanner.nextLine();
                Cliente cliente = new Cliente(nombreCliente, cedulaCliente);
                clientesRegistrados.add(cliente);

                System.out.print("Ingrese el tipo de vehículo (automóvil o motocicleta): ");
                String tipoAuto = scanner.next();

                System.out.print("Ingrese la placa del vehículo: ");
                String placaAuto = scanner.next();

                System.out.print("Ingrese el tiempo en horas que se quedará el vehículo en el estacionamiento: ");
                tiempoHoras = scanner.nextInt();
                scanner.nextLine();

                Vehiculo vehiculo = new Vehiculo(tipoAuto, placaAuto);
                vehiculosEstacionados.add(vehiculo);

                estacionamiento.ingresarVehiculo(cliente, vehiculo, tiempoHoras);

                System.out.print("¿Desea ingresar otro cliente? (S/N): ");
                String respuesta = scanner.next();
                scanner.nextLine();

                if (respuesta.equalsIgnoreCase("N")) {
                    continuar = false;
                }
            }

            System.out.println("Factura o lista de clientes y costos:");
            for (int i = 0; i < clientesRegistrados.size(); i++) {
                Cliente cliente = clientesRegistrados.get(i);
                Vehiculo vehiculo = vehiculosEstacionados.get(i);
                double costo = estacionamiento.calcularCosto(vehiculo, tiempoHoras);
                System.out.println("Cliente: " + cliente.getNombreCliente() + " - Cédula: " + cliente.getCedulaCliente());
                System.out.println("Vehículo: " + vehiculo.getTipoAuto() + " - Placa: " + vehiculo.getPlacaAuto());
                System.out.println("Costo: $" + costo);
                System.out.println("--------");
            }

            scanner.close();
        }
}

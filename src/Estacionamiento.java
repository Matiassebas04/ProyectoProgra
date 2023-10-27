import java.util.ArrayList;

public class Estacionamiento {
    private ArrayList<Vehiculo> vehiculosEstacionados;
    private ArrayList<Cliente> clientes;

    public Estacionamiento() {
        vehiculosEstacionados = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void ingresarVehiculo(Cliente cliente, Vehiculo vehiculo, int tiempoHoras) {
        clientes.add(cliente);
        vehiculosEstacionados.add(vehiculo);
    }

    public double calcularCosto(Vehiculo vehiculo, int tiempoHoras) {
        double costoPorHora = (vehiculo.getTipoAuto().equalsIgnoreCase("automovil")) ? 1.0 : 0.5;
        return costoPorHora * tiempoHoras;
    }

    public ArrayList<Vehiculo> getVehiculosEstacionados() {
        return vehiculosEstacionados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}

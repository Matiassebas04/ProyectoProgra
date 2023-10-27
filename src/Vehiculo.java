public class Vehiculo {
    private String tipoAuto;
    private String placaAuto;

    public Vehiculo(String tipoAuto, String placaAuto) {
        this.tipoAuto = tipoAuto;
        this.placaAuto = placaAuto;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getPlacaAuto() {
        return placaAuto;
    }

    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }
}

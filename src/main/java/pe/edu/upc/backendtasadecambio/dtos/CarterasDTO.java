package pe.edu.upc.backendtasadecambio.dtos;

import pe.edu.upc.backendtasadecambio.entities.Letrasdecambio;

import java.time.LocalDate;

public class CarterasDTO {
    private int id_cartera;
    private String moneda;
    private String acreedor;
    private LocalDate fechad;
    private float tcea;

    public int getId_cartera() {
        return id_cartera;
    }

    public void setId_cartera(int id_cartera) {
        this.id_cartera = id_cartera;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getAcreedor() {
        return acreedor;
    }

    public void setAcreedor(String acreedor) {
        this.acreedor = acreedor;
    }

    public LocalDate getFechad() {
        return fechad;
    }

    public void setFechad(LocalDate fechad) {
        this.fechad = fechad;
    }

    public float getTcea() {
        return tcea;
    }

    public void setTcea(float tcea) {
        this.tcea = tcea;
    }
}

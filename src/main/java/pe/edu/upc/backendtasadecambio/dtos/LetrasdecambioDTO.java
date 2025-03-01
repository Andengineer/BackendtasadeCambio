package pe.edu.upc.backendtasadecambio.dtos;

import pe.edu.upc.backendtasadecambio.entities.Carteras;

import java.time.LocalDate;
import java.time.LocalTime;

public class LetrasdecambioDTO {
    private int id_letra;
    private float monto;
    private float tea;
    private LocalDate fechav;
    private String deudor;
    private float monto_recibido;
    private float monto_entregado;
    private float importe_descontado;
    private float importe_retenido;
    private int dias_descontado;
    private Carteras cartera;

    public int getId_letra() {
        return id_letra;
    }

    public void setId_letra(int id_letra) {
        this.id_letra = id_letra;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getTea() {
        return tea;
    }

    public void setTea(float tea) {
        this.tea = tea;
    }

    public LocalDate getFechav() {
        return fechav;
    }

    public void setFechav(LocalDate fechav) {
        this.fechav = fechav;
    }

    public String getDeudor() {
        return deudor;
    }

    public void setDeudor(String deudor) {
        this.deudor = deudor;
    }

    public float getMonto_recibido() {
        return monto_recibido;
    }

    public void setMonto_recibido(float monto_recibido) {
        this.monto_recibido = monto_recibido;
    }

    public float getMonto_entregado() {
        return monto_entregado;
    }

    public void setMonto_entregado(float monto_entregado) {
        this.monto_entregado = monto_entregado;
    }

    public float getImporte_descontado() {
        return importe_descontado;
    }

    public void setImporte_descontado(float importe_descontado) {
        this.importe_descontado = importe_descontado;
    }

    public float getImporte_retenido() {
        return importe_retenido;
    }

    public void setImporte_retenido(float importe_retenido) {
        this.importe_retenido = importe_retenido;
    }

    public int getDias_descontado() {
        return dias_descontado;
    }

    public void setDias_descontado(int dias_descontado) {
        this.dias_descontado = dias_descontado;
    }

    public Carteras getCartera() {
        return cartera;
    }

    public void setCartera(Carteras cartera) {
        this.cartera = cartera;
    }
}

package pe.edu.upc.backendtasadecambio.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class LetrasdecambioDTO {
    private int id_letra;
    private String moneda;
    private float monto;
    private float tea;
    private LocalDate fechav;
    private LocalTime fechad;
    private String deudor;
    private String acreedor;
    private float monto_recibido;
    private float monto_entregado;
    private float importe_descontado;
    private float importe_retenido;

    public int getId_letra() {
        return id_letra;
    }

    public void setId_letra(int id_letra) {
        this.id_letra = id_letra;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
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

    public LocalTime getFechad() {
        return fechad;
    }

    public void setFechad(LocalTime fechad) {
        this.fechad = fechad;
    }

    public String getDeudor() {
        return deudor;
    }

    public void setDeudor(String deudor) {
        this.deudor = deudor;
    }

    public String getAcreedor() {
        return acreedor;
    }

    public void setAcreedor(String acreedor) {
        this.acreedor = acreedor;
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
}

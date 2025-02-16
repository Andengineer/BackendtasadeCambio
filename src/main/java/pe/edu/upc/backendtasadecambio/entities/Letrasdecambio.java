package pe.edu.upc.backendtasadecambio.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDate;

//No se toca a menos que se modifique la base de datos
@Entity
@Table(name = "Letrasdecambio")
public class Letrasdecambio implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_letra;
    @Column(name="moneda",length = 100,nullable = false)
    private String moneda;
    @Column(name="monto",nullable = false)
    private float monto;
    @Column(name="tea",nullable = false)
    private float tea;
    @Column(name="fechav",nullable = false)
    private LocalDate fechav;
    @Column(name="fechad",nullable = false)
    private LocalDate fechad;
    @Column(name="deudor",length = 100,nullable = false)
    private String deudor;
    @Column(name="acreedor",length = 100,nullable = false)
    private String acreedor;
    @Column(name="monto_recibido",nullable = false)
    private float monto_recibido;
    @Column(name="monto_entregado",nullable = false)
    private float monto_entregado;
    @Column(name="importe_descontado",nullable = false)
    private float importe_descontado;
    @Column(name="importe_retenido",nullable = false)
    private float importe_retenido;
    public Letrasdecambio() {}

    public Letrasdecambio(int id_letra, String moneda, float monto, float tea, LocalDate fechav, LocalDate fechad, String deudor, String acreedor, float monto_recibido, float monto_entregado, float importe_descontado, float importe_retenido) {
        this.id_letra = id_letra;
        this.moneda = moneda;
        this.monto = monto;
        this.tea = tea;
        this.fechav = fechav;
        this.fechad = fechad;
        this.deudor = deudor;
        this.acreedor = acreedor;
        this.monto_recibido = monto_recibido;
        this.monto_entregado = monto_entregado;
        this.importe_descontado = importe_descontado;
        this.importe_retenido = importe_retenido;
    }

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

    public LocalDate getFechad() {
        return fechad;
    }

    public void setFechad(LocalDate fechad) {
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

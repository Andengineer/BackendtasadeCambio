package pe.edu.upc.backendtasadecambio.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Carteras")
public class Carteras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cartera;
    @Column(name="moneda",length = 100,nullable = false)
    private String moneda;
    @Column(name="acreedor",length = 100,nullable = false)
    private String acreedor;
    @Column(name="fechad",nullable = false)
    private LocalDate fechad;
    @Column(name="tcea",nullable = false)
    private float tcea;
    public Carteras() {}

    public Carteras(int id_cartera, String moneda, String acreedor, LocalDate fechad, float tcea) {
        this.id_cartera = id_cartera;
        this.moneda = moneda;
        this.acreedor = acreedor;
        this.fechad = fechad;
        this.tcea = tcea;
    }

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

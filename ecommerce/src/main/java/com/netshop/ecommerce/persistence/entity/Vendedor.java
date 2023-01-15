package com.netshop.ecommerce.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="vendedor")
public class Vendedor {

    //Columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Permite que JAVA genere de manera automatica el autoIncrement
    @NotNull
    @Column(name="vend_id")
    private Integer id;

    @Column(name="tienda_id")
    private Integer tiendaId;

    @Column(name="vend_nombre")
    private String nombre;

    //Relaciones
    @OneToMany(mappedBy = "vendedor")
    private List<MedioPago> mediosPago;

    @OneToOne //Está dando problemas
    @JoinColumn(name = "tienda_id", referencedColumnName = "tienda_id",insertable = false, updatable = false)
    private Tienda tienda;

    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTiendaId() {
        return tiendaId;
    }

    public void setTiendaId(Integer idTienda) {
        this.tiendaId = idTienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<MedioPago> getMediosPago() {
        return mediosPago;
    }

    public void setMediosPago(List<MedioPago> mediosPago) {
        this.mediosPago = mediosPago;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
}


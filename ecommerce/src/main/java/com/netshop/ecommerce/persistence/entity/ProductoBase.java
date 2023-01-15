package com.netshop.ecommerce.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "producto_base")
public class ProductoBase {

    //Columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Permite que JAVA genere de manera automatica el autoIncrement
    @NotNull
    @Column(name="prodb_id")
    private Integer id;

    @Column(name="prodb_nombre")
    private String nombre;

    @Column(name="prodb_descripcion")
    private String descripcion;

    @Column(name="prodb_precio")
    private double precio;

    @Column(name="prodb_tiempoFabricacion")
    private double tiempoFabricacion;

    //Relaciones

    @OneToMany(mappedBy = "productoBase")
    private List<AreaPersonalizacion> areasPersonalizacion;

    //Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getTiempoFabricacion() {
        return tiempoFabricacion;
    }

    public void setTiempoFabricacion(double tiempoFabricacion) {
        this.tiempoFabricacion = tiempoFabricacion;
    }

    public List<AreaPersonalizacion> getAreasPersonalizacion() {
        return areasPersonalizacion;
    }

    public void setAreasPersonalizacion(List<AreaPersonalizacion> areasPersonalizacion) {
        this.areasPersonalizacion = areasPersonalizacion;
    }
}


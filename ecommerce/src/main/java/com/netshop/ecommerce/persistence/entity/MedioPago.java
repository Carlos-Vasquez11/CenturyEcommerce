package com.netshop.ecommerce.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="medio_pago")
public class MedioPago {

    //Columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name="medp_id")
    private Integer id;

    @Column(name="vend_id")
    private Integer vendedorId;

    @Column(name="medio_pago_nombre")
    private String medioPago;

    @Column(name="cbu")
    private String cbu;

    //Relaciones
    @ManyToOne
    @JoinColumn(name="vend_id", insertable = false , updatable = false)
    private Vendedor vendedor;

    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(Integer vendedorId) {
        this.vendedorId = vendedorId;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}


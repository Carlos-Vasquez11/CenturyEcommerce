package com.netshop.ecommerce.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name="producto")
public class Producto {

        //Columnas
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @NotNull
        @Column(name = "prod_id")
        private Integer id;

        @Column(name="prod_foto_url")
        private String fotoUrl;

        @Column(name="prodb_id")
        private Integer productoBaseId;

        //Relaciones
        @ManyToOne
        @JoinColumn(name = "prodb_id", referencedColumnName = "prodb_id",insertable = false,updatable = false)
        private ProductoBase productoBase;

        @OneToMany(mappedBy = "producto")
        private List<Personalizacion> personalizaciones;

        //Getters y Setters
        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public Integer getProductoBaseId() {
                return productoBaseId;
        }

        public void setProductoBaseId(Integer productoBaseId) {
                this.productoBaseId = productoBaseId;
        }

        public ProductoBase getProductoBase() {
                return productoBase;
        }

        public void setProductoBase(ProductoBase productoBase) {
                this.productoBase = productoBase;
        }

        public List<Personalizacion> getPersonalizaciones() {
                return personalizaciones;
        }

        public void setPersonalizaciones(List<Personalizacion> personalizaciones) {
                this.personalizaciones = personalizaciones;
        }

        public String getFotoUrl() {
                return fotoUrl;
        }

        public void setFotoUrl(String fotoUrl) {
                this.fotoUrl = fotoUrl;
        }
}

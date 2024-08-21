package com.principal.dojoflix.models;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "directors")
public class Director {

    @Id // Indica atributo de llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el valor de la llave primaria es autogenerado
    private Long id; // Atributo de llave primaria

    @Size(min = 2, max = 200, message = "El nombre debe contener entre 2 y 200 caracteres") // Indica el tamaño mínimo y máximo del atributo
    private String name;

    @CreationTimestamp // Indica que el atributo es de fecha de creación
    @Column(name = "created_at") // Indica el nombre de la columna en la base de datos
    private Date createdAt; // Atributo de fecha de creación

    /* RELACION 1:M */

    @OneToMany(mappedBy = "director", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Movie> movies;

    @UpdateTimestamp // Indica que el atributo es de fecha de actualización
    @Column(name = "updated_at") // Indica el nombre de la columna en la base de datos
    private Date updatedAt; // Atributo de fecha de actualización

}

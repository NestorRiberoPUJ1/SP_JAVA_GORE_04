package com.principal.dojoflix.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "movies")
public class Movie {

    @Id // Indica atributo de llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el valor de la llave primaria es autogenerado
    private Long id; // Atributo de llave primaria

    private String title;
    private Integer duration;
    private String gender;
    private String synopsis;
    private String poster;

    @Column(name = "created_at") // Indica el nombre de la columna en la base de datos
    private Date createdAt; // Atributo de fecha de creación
    @Column(name = "updated_at") // Indica el nombre de la columna en la base de datos
    private Date updatedAt; // Atributo de fecha de actualización

}

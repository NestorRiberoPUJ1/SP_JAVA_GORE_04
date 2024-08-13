package com.principal.data1.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // Genera los getters
@Setter // Genera los setters
@AllArgsConstructor // Genera el constructor con todos los argumentos
@NoArgsConstructor // Genera el constructor vacío
@Entity // Entidad de la base de datos
@Table(name = "movies") // Nombre de la tabla en la base de datos
public class Movie {

    @Id // Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrementable
    private Long id; // LLave primaria

    private String title;
    private String gender;
    private String studio;
    private String director;
    private Integer duration;
    private String classification;
    private String language;

    @Temporal(TemporalType.DATE) // Solo fecha
    @Column(name = "release_date") // Nombre de la columna en la base de datos
    private Date releaseDate;

    private String country;

    @Temporal(TemporalType.TIMESTAMP) // Fecha y hora
    @Column(name = "created_at") // Nombre de la columna en la base de datos
    private Date createdAt; // Fecha de creación

    @Temporal(TemporalType.TIMESTAMP) // Fecha y hora
    @Column(name = "updated_at") // Nombre de la columna en la base de datos
    private Date updatedAt; // Fecha de actualización

}

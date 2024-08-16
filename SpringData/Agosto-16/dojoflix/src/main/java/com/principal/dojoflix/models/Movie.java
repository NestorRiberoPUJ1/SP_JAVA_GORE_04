package com.principal.dojoflix.models;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.URL;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotNull(message = "El titulo no puede ser nulo") // Indica que el atributo no puede ser nulo
    @Size(min = 4, max = 100,message = "El titulo debe contener entre 4 y 100 caracteres") // Indica el tamaño mínimo y máximo del atributo
    private String title;

    @NotNull(message = "La duración no puede ser nula") // Indica que el atributo no puede ser nulo
    @Min(value = 60,message = "Duración menor a 60 es cortometraje") // Indica el valor mínimo del atributo
    private Integer duration;

    @NotNull(message = "El genero no puede ser nulo") // Indica que el atributo no puede ser nulo
    @Size(min = 4, max = 48, message = "El genero debe ser entre 4 y 48 caracteres") // Indica el tamaño mínimo y máximo del atributo
    private String gender;

    @NotNull(message = "La sinopsis no puede ser nula") // Indica que el atributo no puede ser nulo
    @Size(min = 30, max = 500,message = "La sinopsis no debe ser menor a 30 ni mayor a 500 caracteres") // Indica el tamaño mínimo y máximo del atributo
    private String synopsis;

    @NotNull(message = "El poster no puede ser nulo") // Indica que el atributo no puede ser nulo
    @NotBlank(message = "El poster no puede estar vacío") // Indica que el atributo no puede estar vacío
    @URL(message = "Formato de URL inválido") // Indica que el atributo es una URL
    private String poster;
    
    @CreationTimestamp // Indica que el atributo es de fecha de creación
    @Column(name = "created_at") // Indica el nombre de la columna en la base de datos
    private Date createdAt; // Atributo de fecha de creación

    @UpdateTimestamp // Indica que el atributo es de fecha de actualización
    @Column(name = "updated_at") // Indica el nombre de la columna en la base de datos
    private Date updatedAt; // Atributo de fecha de actualización

}

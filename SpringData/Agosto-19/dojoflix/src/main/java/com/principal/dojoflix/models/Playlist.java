package com.principal.dojoflix.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "playlists")
public class Playlist {

    @Id // Indica atributo de llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el valor de la llave primaria es autogenerado
    private Long id; // Atributo de llave primaria

    @Column(name = "songs") // Indica el nombre de la columna en la base de datos
    @Size(min = 2, max = 200, message = "La lista de canciones debe contener entre 2 y 200 caracteres") // Indica el tamaño mínimo y máximo del atributo
    private String songs;

    @CreationTimestamp // Indica que el atributo es de fecha de creación
    @Column(name = "created_at") // Indica el nombre de la columna en la base de datos
    private Date createdAt; // Atributo de fecha de creación

    /* RELACION 1:1 */
    @NotNull(message = "La playlist debe tener una película") // Indica que el atributo no puede ser nulo
    @OneToOne
    @JoinColumn(name = "movie_id") // Indica el nombre de la columna en la base de datos
    private Movie movie;


    @UpdateTimestamp // Indica que el atributo es de fecha de actualización
    @Column(name = "updated_at") // Indica el nombre de la columna en la base de datos
    private Date updatedAt; // Atributo de fecha de actualización

}

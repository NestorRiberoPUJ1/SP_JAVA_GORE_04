package com.principal.dojoflix.models;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "songs")
public class Song {

    @Id // Indica atributo de llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el valor de la llave primaria es autogenerado
    private Long id; // Atributo de llave primaria

    @NotNull(message = "El nombre es requerido") // Indica que el atributo no puede ser nulo
    @Size(min = 3, max = 100,message = "El nombre debe ser entre 3 y 100 caracteres" ) // Indica el tamaño mínimo y máximo del atributo
    private String name; // Atributo de nombre de la canción



    /* RELACION N:M */
    @ManyToMany // Indica la relación muchos a muchos con la tabla playlists
        @JoinTable(
        name = "playlists_songs", // Nombre de la tabla intermedia
        joinColumns = @JoinColumn(name = "song_id"), // Nombre de la columna de la tabla intermedia que hace referencia a la tabla actual
        inverseJoinColumns = @JoinColumn(name = "playlist_id") // Nombre de la columna de la tabla intermedia que hace referencia a la tabla con la que se relaciona
    )
    private List<Playlist> playlists; // Atributo de lista de playlists

    @CreationTimestamp // Indica que el atributo es de fecha de creación
    @Column(name = "created_at") // Indica el nombre de la columna en la base de datos
    private Date createdAt; // Atributo de fecha de creación

    @UpdateTimestamp // Indica que el atributo es de fecha de actualización
    @Column(name = "updated_at") // Indica el nombre de la columna en la base de datos
    private Date updatedAt; // Atributo de fecha de actualización

}

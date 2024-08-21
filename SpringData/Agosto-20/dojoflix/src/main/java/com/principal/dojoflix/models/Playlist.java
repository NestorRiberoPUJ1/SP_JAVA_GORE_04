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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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

    /* RELACION 1:1 */
    @NotNull(message = "La playlist debe tener una película") // Indica que el atributo no puede ser nulo
    @OneToOne
    @JoinColumn(name = "movie_id") // Indica el nombre de la columna en la base de datos
    private Movie movie;

    /* RELACION M:N */
    @ManyToMany
    @JoinTable(
        name = "playlists_songs", // Nombre de la tabla intermedia
        joinColumns = @JoinColumn(name = "playlist_id"), // Nombre de la columna de la tabla intermedia que hace referencia a la tabla actual
        inverseJoinColumns = @JoinColumn(name = "song_id") // Nombre de la columna de la tabla intermedia que hace referencia a la tabla con la que se relaciona
    )
    private List<Song> songs; // Atributo de lista de canciones

    
    @CreationTimestamp // Indica que el atributo es de fecha de creación
    @Column(name = "created_at") // Indica el nombre de la columna en la base de datos
    private Date createdAt; // Atributo de fecha de creación

    @UpdateTimestamp // Indica que el atributo es de fecha de actualización
    @Column(name = "updated_at") // Indica el nombre de la columna en la base de datos
    private Date updatedAt; // Atributo de fecha de actualización

}

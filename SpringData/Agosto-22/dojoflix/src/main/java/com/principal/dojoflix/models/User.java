package com.principal.dojoflix.models;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
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
@Table(name = "users")
public class User {
    
    @Id // Indica atributo de llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el valor de la llave primaria es autogenerado
    private Long id; // Atributo de llave primaria

    @NotNull(message = "El email es requerido") // Indica que el atributo no puede ser nulo
    @Email // Indica que el atributo debe ser un email
    private String email; // Atributo de email

    @NotNull(message = "La fecha de nacimiento es requerida") // Indica que el atributo no puede ser nulo
    @Past(message = "No se puede nacer en el futuro") // Indica que el atributo debe ser una fecha pasada
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Indica el formato de la fecha
    @Temporal(TemporalType.DATE) // Indica el tipo de dato de la fecha
    private Date birthdate; // Atributo de fecha de nacimiento

    @NotNull(message = "La contraseña es requerida") // Indica que el atributo no puede ser nulo
    @NotBlank(message = "La contraseña no puede estar vacía") // Indica que el atributo no puede estar vacío
    @Size(min=8, message = "La contraseña debe ser minimo 8 caracteres") // Indica el tamaño mínimo y máximo del atributo
    @Pattern( regexp="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*(),.?\":{}|<>])[A-Za-z\\d!@#$%^&*(),.?\":{}|<>]{8,}$", message = "La contraseña debe tener al menos una mayúscula, una minúscula, un número y un caracter especial") // Indica el patrón que debe cumplir el atributo
    private String password; // Atributo de contraseña


    @Transient // Indica que el atributo no se mapea a la base de datos
    private String passwordConfirmation; // Atributo de confirmación de contraseña


    @CreationTimestamp // Indica que el atributo es de fecha de creación
    @Column(name = "created_at") // Indica el nombre de la columna en la base de datos
    private Date createdAt; // Atributo de fecha de creación

    @UpdateTimestamp // Indica que el atributo es de fecha de actualización
    @Column(name = "updated_at") // Indica el nombre de la columna en la base de datos
    private Date updatedAt; // Atributo de fecha de actualización




    /* MIDDLEWARES */

    @PrePersist // Indica que el método se ejecuta antes de persistir el objeto
    public void prePersist() {
               
    }

    @PreUpdate // Indica que el método se ejecuta antes de actualizar el objeto
    public void preUpdate() {
        password = BCrypt.hashpw(password, BCrypt.gensalt()); // Encripta la contraseña
    }
}

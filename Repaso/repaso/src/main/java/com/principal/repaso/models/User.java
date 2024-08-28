package com.principal.repaso.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
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
public class User extends Base {
    
    @NotNull(message = "El nombre es requerido")
    @Size(min=3,message = "El nombre debe tener al menos 3 caracteres")
    private String name;

    @NotNull(message = "El email es requerido")
    @Email(message = "El email no es valido")
    private String email;


    private String password;

    @NotNull(message = "La contraseña es requerida")
    @Size(min=8,message = "La contraseña debe tener al menos 8 caracteres")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$",message = "La contraseña debe tener al menos una mayuscula, una minuscula y un numero")
    @Transient
    private String passwordForm;

    @Transient
    private String passwordConfirm;

}

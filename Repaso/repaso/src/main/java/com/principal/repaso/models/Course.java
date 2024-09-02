package com.principal.repaso.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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
@Table(name = "courses")
public class Course extends Base {
    

    @NotBlank(message = "El nombre es requerido")
    @Size(min=3,message = "El nombre debe tener al menos 3 caracteres")
    private String name;

    @NotBlank(message =" El instructor es requerido")
    private String instructor;

    @NotNull(message = "La capacidad es requerida")
    @Min(value = 1,message = "La capacidad debe ser mayor a 0")
    private Integer capacity;


    /* RELACIONES */

    @ManyToMany
    @JoinTable(
        name = "inscriptions", //nombre de la tabla intermedia
        joinColumns= @JoinColumn(name = "course_id"),   //nombre de la columna de la tabla intermedia que hace referencia a la tabla actual
        inverseJoinColumns = @JoinColumn(name = "user_id")  //nombre de la columna de la tabla intermedia que hace referencia a la tabla con la que se relaciona
    )
    private List<User> users;





    //Método para ver si un estudiante ya está inscrito en el curso
    public boolean hasStudentById(Long id){
        for(User user: this.users){
            if(user.getId() == id){
                return true;
            }
        }
        return false;
    }

    //Método para ver si el curso está lleno
    public boolean isFull(){
        return this.users.size() >= this.capacity;
    }

}

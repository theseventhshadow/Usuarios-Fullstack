package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario") // Match table name exactly
public class Usuario {

    @Id
    @Column(name = "rut") // Explicitly map to column name
    private int rut;

    @Column(name = "dv_rut", nullable = false, length = 1)
    private String dvRut;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int telefono;

    @Column(name = "nombre_empresa", nullable = false)
    private String nombreEmpresa;

    @ManyToOne
    @JoinColumn(name = "id_rrss", nullable = false) // Explicitly map join column
    private RedSocial redSocial;

    @Column(name = "usuario_red_social", nullable = false)
    private String usuarioRedSocial;

    @Column(nullable = false)
    private String ciudad;

    @Column(name = "fecha_incorporacion")
    private Date fechaIncorporacion;

    // No need for explicit constructor/getters/setters with @Data, @AllArgsConstructor, @NoArgsConstructor
}
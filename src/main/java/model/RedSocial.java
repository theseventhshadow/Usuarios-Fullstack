package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "redSocial") // Match table name exactly
public class RedSocial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rrss") // Explicitly map column name
    private Long idRrss;

    @Column(name = "nombre_red_social", nullable = false)
    private String nombreRedSocial;

    @OneToMany(mappedBy = "redSocial", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Usuario> usuarios;

    // No need for explicit constructor/getters/setters with @Data, @AllArgsConstructor, @NoArgsConstructor
}

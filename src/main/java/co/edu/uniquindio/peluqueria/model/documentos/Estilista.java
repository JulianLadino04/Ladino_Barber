package co.edu.uniquindio.peluqueria.model.documentos;

import co.edu.uniquindio.peluqueria.model.vo.Horario;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("estilistas")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Estilista {
    @Id
    private String id;
    private String nombreEstilista;
    private String especialidad;

    public Estilista(@NotNull(message = "El id del Cliente es obligatoria") String nombre, @NotNull(message = "El id del Servicio es obligatorio") String especialidad) {
    }
}


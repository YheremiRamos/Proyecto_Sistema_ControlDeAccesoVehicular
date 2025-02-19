package cibertec.edu.pe.sistema_vehicular.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    private String nombres;
    private String apellidos;
    private String dni;
    private String login;
    private String password;
    private String correo;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date fechaRegistro;

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" , timezone = "America/Lima")
    private Date fechaNacimiento;

    public String getNombreCompleto() {
        if (nombres != null && apellidos != null) {
            return nombres.concat(" ").concat(apellidos);
        }else {
            return "";
        }
    }


}

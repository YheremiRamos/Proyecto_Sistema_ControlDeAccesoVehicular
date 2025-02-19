package cibertec.edu.pe.sistema_vehicular;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@CommonsLog
public class SistemaVehicularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SistemaVehicularApplication.class, args);
        log.info("Carga completa, vamos si se puede !!!");
    }

}

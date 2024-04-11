package edu.pe.cibertec.grupo2.DAWI_CL1_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ejercicio")
public class EjercicioController {

    @GetMapping("/uno")
    public String ejercicioEstacionamiento(){
        return "ejercicio/frmestacionamiento";
    }

    @GetMapping("/dos")
    public String ejercicioPromedio(){
        return "ejercicio/frmnotasalumno";
    }

    @GetMapping("/tres")
    public String ejercicioDNI(){
        return "ejercicio/frmverificaciondni";
    }

    @GetMapping("/cuatro")
    public String ejercicioNumerosPares(){
        return "ejercicio/frmnumerosparesdesc";
    }
}

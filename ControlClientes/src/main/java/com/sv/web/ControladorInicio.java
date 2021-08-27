package com.sv.web;

import com.sv.domain.Persona;
import com.sv.servicio.PersonaService;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model){

        ArrayList<Persona> personas = (ArrayList) personaService.listarPersonas();
        
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        
        return "index";
    }
}
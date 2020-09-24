package cl.toballatorre.simtres.controladores;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import cl.toballatorre.simtres.modelos.Alumno;
import cl.toballatorre.simtres.modelos.Curso;
import cl.toballatorre.simtres.repositorios.CursoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path = "/")
public class HomeController {


    /** Objeto {@link Logger} que contiene los métodos de depuración */
    private static final Logger logger = LogManager.getLogger(HomeController.class);

    // AUTOWIRED REPOSITORY
    @Autowired
    CursoRepository cr;
   
    @GetMapping
    public String paginaInicio(HttpServletRequest request, Model modelo) {
        // Depuración
        logger.info("Solicitud GET: {}", request.getRequestURI());
        
        // Obtiene la lista de cursos y lo deja en una lista Opcional
        Optional<List<Curso>> listaOC = Optional.of(cr.findAll());
        
        // Si hay elementos en la lista envía la lista a la vista
        if (listaOC.isPresent()) {
        	List<Curso> listaCursos = listaOC.get();
			modelo.addAttribute("listaCurso", listaCursos);
			logger.info("Se obtiene la lista de cursos. Cantidad {}", listaCursos.size());
		} else {
			logger.info("No se pudo obtener la lista de Cursos o no existe");
		}
        
        // Mostrar página
        return "home";
    }
    
    /**
     * Consume el recurso Rest para mostrar el listado de alumnos
     * @param curso
     * @param request
     * @param modelo
     * @return
     */
    @GetMapping("/curso/{curso}")
    public String mostrarListadoAlumnos(@PathVariable int curso, HttpServletRequest request, Model modelo) {
    	
    	// Depuración
        logger.info("Solicitud Lista Alumnos GET: {}", request.getRequestURI());
        
        // Rescantando la lista de Alumnos del curso consumiendo el servicio REST
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8086/simtres/api/curso/"+curso;
        ResponseEntity<Alumno[]> response = restTemplate.getForEntity(url, Alumno[].class);
        Alumno[] listaAlumno = response.getBody();
        
        Optional<Curso> c = cr.findById(curso);
        
        modelo.addAttribute("curso", c.get());
        modelo.addAttribute("listaAlumno", listaAlumno);
    	
    	return "listaAlumnos";
    }

}

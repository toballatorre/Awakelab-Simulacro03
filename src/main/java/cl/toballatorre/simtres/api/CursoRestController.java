package cl.toballatorre.simtres.api;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.toballatorre.simtres.modelos.Alumno;
import cl.toballatorre.simtres.modelos.Curso;
import cl.toballatorre.simtres.repositorios.CursoRepository;

@RestController
@RequestMapping(path="api/curso", produces = MediaType.APPLICATION_JSON_VALUE)
public class CursoRestController {

	 private static final Logger logger = LogManager.getLogger(CursoRestController.class);
	
	@Autowired
	CursoRepository cr;
	
	/**
	 * Recibe la id del curso a mostrar
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public List<Alumno> listadoAlumnosCurso(@PathVariable int id, HttpServletRequest request, Model modelo) {
		
		logger.info("Solicitud REST GET: {}", request.getRequestURI());
		
		Optional<Curso> oc = cr.findById(id);
		if(oc.isPresent()) {
			return oc.get().getListaAlumnos();
		}
		
		return null;
	}
}

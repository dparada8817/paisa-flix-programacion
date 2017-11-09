package io.swagger.api;

import io.swagger.model.Programa;
import io.swagger.model.Programacion;

import io.swagger.annotations.*;

import io.swagger.model.Utiles;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T01:33:59.673Z")

@Controller
public class ProgramacionApiController implements ProgramacionApi {

    public ResponseEntity<List<Programacion>> buscarProgramacion(@ApiParam(value = "Ingrese el id por el cual desea buscar") @RequestParam(value = "idProgramacion", required = false) String idProgramacion) {
        List<Programacion> programacion = Utiles.getSingletonInstance().getProgramaciones();

        return new ResponseEntity<List<Programacion>>(programacion,HttpStatus.OK);
    }

    public ResponseEntity<Void> crearProgramacion(@ApiParam(value = "Programación a crear"  ) @RequestBody Programacion programacion) {
        Utiles.getSingletonInstance().agregarProgramacion(programacion);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

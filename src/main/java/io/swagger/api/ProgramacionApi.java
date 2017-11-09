package io.swagger.api;

import io.swagger.model.Programa;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T01:01:59.715Z")

@Api(value = "programacion", description = "the programacion API")
public interface ProgramacionApi {

    @ApiOperation(value = "Se consulta toda la programacion disponible en PaisaFlix(Series y Películas)", notes = "Se consulta toda la programacion disponible en PaisaFlix(Series y Películas) ", response = Programa.class, responseContainer = "List", tags={ "administradores","programadores","clientes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resultados de toda la programacion PaisaFlix", response = Programa.class),
        @ApiResponse(code = 400, message = "Parametros de entrada erroneos", response = Programa.class) })
    @RequestMapping(value = "/programacion",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Programa>> buscarProgramacion();

}

package io.swagger.api;

import io.swagger.model.Programacion;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T01:33:59.673Z")

@Api(value = "programacion", description = "the programacion API")
public interface ProgramacionApi {

    @ApiOperation(value = "Consultar programación", notes = "Con los parametros adecuados busca una programación ", response = Programacion.class, responseContainer = "List", tags={ "administradores","programadores","clientes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resultados de la busqueda", response = Programacion.class),
        @ApiResponse(code = 400, message = "Parametros de entrada erroneos", response = Programacion.class) })
    @RequestMapping(value = "/programacion",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Programacion>> buscarProgramacion(@ApiParam(value = "Ingrese el id por el cual desea buscar") @RequestParam(value = "idProgramacion", required = false) String idProgramacion);


    @ApiOperation(value = "Adiciona un registro a la programación", notes = "Adiciona un registro a la programación", response = Void.class, tags={ "administradores","programadores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Programación creada", response = Void.class),
        @ApiResponse(code = 400, message = "Entrada erronea, objeto no válido", response = Void.class),
        @ApiResponse(code = 409, message = "La programación ya existe", response = Void.class) })
    @RequestMapping(value = "/programacion",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> crearProgramacion(@ApiParam(value = "Programación a crear"  ) @RequestBody Programacion programacion);

}

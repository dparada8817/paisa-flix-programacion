package io.swagger.api;

import io.swagger.model.Capitulo;

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

@Api(value = "capitulo", description = "the capitulo API")
public interface CapituloApi {

    @ApiOperation(value = "Consultar capitulo por id", notes = "Con el parametro adecuado buscar un capitulo ", response = Object.class, tags={ "administradores","programadores","clientes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resultado de la busqueda", response = Object.class),
        @ApiResponse(code = 400, message = "Parametros de entrada erroneos", response = Object.class) })
    @RequestMapping(value = "/capitulo/{idCapitulo}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> buscarCapituloPorId(@ApiParam(value = "Ingrese el id del capitulo por el cual desea buscar",required=true ) @PathVariable("idCapitulo") String idCapitulo);


    @ApiOperation(value = "Crea/Actualiza un capitulo", notes = "Crea/Actualiza una capitulo", response = Void.class, tags={ "administradores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "pelicula Creado/Actualizado", response = Void.class),
        @ApiResponse(code = 400, message = "Entrada erronea, objeto no válido", response = Void.class) })
    @RequestMapping(value = "/capitulo/{idCapitulo}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> crearActualizarCapituloPorId(@ApiParam(value = "Ingrese el id del capitulo a crear/actualizar",required=true ) @PathVariable("idCapitulo") String idCapitulo,
        @ApiParam(value = "Capitulo a crear"  ) @RequestBody Capitulo capitulo);

}

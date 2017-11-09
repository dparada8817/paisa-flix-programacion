package io.swagger.api;

import io.swagger.model.Capitulo;
import io.swagger.model.Serie;

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

@Api(value = "serie", description = "the serie API")
public interface SerieApi {

    @ApiOperation(value = "Consultar todos los capitulos de una serie", notes = "Con el parametro adecuado busca todos los capitulos de la serie ", response = Capitulo.class, responseContainer = "List", tags={ "administradores","programadores","clientes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resultado de la busqueda", response = Capitulo.class),
        @ApiResponse(code = 400, message = "Parametros de entrada erroneos", response = Capitulo.class) })
    @RequestMapping(value = "/serie/{idSerie}/capitulo",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Capitulo>> buscarCapitulosPorIdSerie(@ApiParam(value = "Ingrese id de la serie por el cual desea buscar capitulos",required=true ) @PathVariable("idSerie") String idSerie);


    @ApiOperation(value = "Consultar una serie mediante su id", notes = "Consultar una serie mediante su id ", response = Object.class, tags={ "administradores","programadores","clientes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resultado de la busqueda de serie por id", response = Object.class),
        @ApiResponse(code = 400, message = "Parametros de entrada erroneos", response = Object.class) })
    @RequestMapping(value = "/serie/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> buscarSeriePorId(@ApiParam(value = "Ingrese el id por el cual buscar la serie",required=true ) @PathVariable("id") String id);


    @ApiOperation(value = "Consultar lista de todas las series disponibles", notes = "Consultar lista de todas las series disponibles ", response = Serie.class, responseContainer = "List", tags={ "administradores","programadores","clientes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resultados de la consulta de todas las series", response = Serie.class),
        @ApiResponse(code = 400, message = "Parametros de entrada erroneos", response = Serie.class) })
    @RequestMapping(value = "/serie",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Serie>> buscarSeries();


    @ApiOperation(value = "Crea/Actualiza una serie", notes = "Crea/Actualiza una serie", response = Void.class, tags={ "administradores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Serie Creada/Actualizada", response = Void.class),
        @ApiResponse(code = 400, message = "Entrada erronea, objeto no válido", response = Void.class) })
    @RequestMapping(value = "/serie/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> crearActualizarSerie(@ApiParam(value = "Ingrese el id que desea actualizar",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Serie a crear"  ) @RequestBody Serie serie);

}

package io.swagger.api;

import io.swagger.model.Pelicula;

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

@Api(value = "pelicula", description = "the pelicula API")
public interface PeliculaApi {

    @ApiOperation(value = "Consultar pelicula por id", notes = "Con el parametro adecuado busca una pelicula ", response = Object.class, tags={ "administradores","programadores","clientes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resultado de la busqueda", response = Object.class),
        @ApiResponse(code = 400, message = "Parametros de entrada erroneos", response = Object.class) })
    @RequestMapping(value = "/pelicula/{idPelicula}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> buscarPeliculaPorId(@ApiParam(value = "Ingrese el id de la pelicula por el cual desea buscar",required=true ) @PathVariable("idPelicula") String idPelicula);


    @ApiOperation(value = "Consultar todas las peliculas", notes = "Consulta todas las peliculas disponibles ", response = Pelicula.class, responseContainer = "List", tags={ "administradores","programadores","clientes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resultado de la busqueda", response = Pelicula.class),
        @ApiResponse(code = 400, message = "Parametros de entrada erroneos", response = Pelicula.class) })
    @RequestMapping(value = "/pelicula",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Pelicula>> buscarPeliculas();


    @ApiOperation(value = "Crea/Actualiza una pelicula", notes = "Crea/Actualiza una pelicula", response = Void.class, tags={ "administradores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "pelicula Creado/Actualizado", response = Void.class),
        @ApiResponse(code = 400, message = "Entrada erronea, objeto no válido", response = Void.class) })
    @RequestMapping(value = "/pelicula/{idPelicula}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> crearActualizarPelicula(@ApiParam(value = "Ingrese el id de la pelicula por el cual desea actualizar",required=true ) @PathVariable("idPelicula") String idPelicula,
        @ApiParam(value = "Pelicula a crear"  ) @RequestBody Pelicula pelicula);

}

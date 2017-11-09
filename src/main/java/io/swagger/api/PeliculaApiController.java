package io.swagger.api;

import io.swagger.model.Pelicula;

import io.swagger.annotations.*;

import io.swagger.model.Utiles;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-09T01:33:59.673Z")

@Controller
public class PeliculaApiController implements PeliculaApi {

    public ResponseEntity<Object> buscarPeliculaPorId(@ApiParam(value = "Ingrese el id de la pelicula por el cual desea buscar",required=true ) @PathVariable("idPelicula") String idPelicula) {
        Pelicula peliculaEncontrada = Utiles.getSingletonInstance().getPelicula(idPelicula);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<Object>(peliculaEncontrada, responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<List<Pelicula>> buscarPeliculas() {
        List<Pelicula> peliculasEncontradas = Utiles.getSingletonInstance().getPeliculas();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<List<Pelicula>>(peliculasEncontradas, responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<Void> crearActualizarPelicula(@ApiParam(value = "Ingrese el id de la pelicula por el cual desea actualizar",required=true ) @PathVariable("idPelicula") String idPelicula,
        @ApiParam(value = "Pelicula a crear"  ) @RequestBody Pelicula pelicula) {
        Utiles.getSingletonInstance().putPelicula(pelicula);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

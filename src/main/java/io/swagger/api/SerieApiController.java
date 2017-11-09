package io.swagger.api;

import io.swagger.model.Capitulo;
import io.swagger.model.Serie;

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
public class SerieApiController implements SerieApi {

    public ResponseEntity<Object> buscarCapituloPorId(@ApiParam(value = "Ingrese el id del capitulo por el cual desea buscar",required=true ) @PathVariable("idCapitulo") String idCapitulo,
        @ApiParam(value = "Ingrese el id de la serie por el cual desea buscar",required=true ) @PathVariable("idSerie") String idSerie) {
        Capitulo capituloEncontrado = Utiles.getSingletonInstance().getCapitulo(idCapitulo,idSerie);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<Object>(capituloEncontrado, responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<List<Capitulo>> buscarCapitulosPorIdSerie(@ApiParam(value = "Ingrese el id de la serie por el cual desea buscar",required=true ) @PathVariable("idSerie") String idSerie) {
        List<Capitulo> capitulosEncontrados = Utiles.getSingletonInstance().getCapitulosPorSerie(idSerie);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<List<Capitulo>>(capitulosEncontrados, responseHeaders,HttpStatus.OK);
    }

    public ResponseEntity<List<Serie>> buscarSerie() {
        List<Serie> seriesEncontradas = Utiles.getSingletonInstance().getSeries();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<List<Serie>>(seriesEncontradas, responseHeaders, HttpStatus.OK);

    }

    public ResponseEntity<Object> buscarSeriePorId(@ApiParam(value = "Ingrese el id por el cual desea buscar",required=true ) @PathVariable("id") String id) {
        Serie serieEncontrada = Utiles.getSingletonInstance().getSerie(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<Object>(serieEncontrada, responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<Void> crearActualizarCapitulo(@ApiParam(value = "Ingrese el id del capitulo por el cual desea actualizar",required=true ) @PathVariable("idCapitulo") String idCapitulo,
        @ApiParam(value = "Ingrese el id de la serie por el cual desea actualizar",required=true ) @PathVariable("idSerie") String idSerie,
        @ApiParam(value = "Capitulo a crear"  ) @RequestBody Capitulo capitulo) {
        Utiles.getSingletonInstance().putCapitulo(idSerie, capitulo);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> crearActualizarSerie(@ApiParam(value = "Ingrese el id que desea actualizar",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Serie a crear"  ) @RequestBody Serie serie) {
        Utiles.getSingletonInstance().putSerie(serie);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

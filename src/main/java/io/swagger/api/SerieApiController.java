package io.swagger.api;

import io.swagger.model.Capitulo;
import io.swagger.model.Serie;

import io.swagger.annotations.*;

import io.swagger.model.Utiles;
import org.springframework.hateoas.Link;
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

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T01:01:59.715Z")

@Controller
public class SerieApiController implements SerieApi {

    public ResponseEntity<List<Capitulo>> buscarCapitulosPorIdSerie(@ApiParam(value = "Ingrese id de la serie por el cual desea buscar capitulos",required=true ) @PathVariable("idSerie") String idSerie) {
        List<Capitulo> capitulosEncontrados = Utiles.getSingletonInstance().getCapitulosPorSerie(idSerie);

        for(Capitulo capitulo: capitulosEncontrados){
            Link selfLinkC = linkTo(methodOn(CapituloApiController.class).buscarCapituloPorId(capitulo.getIdCapitulo())).withSelfRel();
            capitulo.removeLinks();
            capitulo.add(selfLinkC);
        }

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<List<Capitulo>>(capitulosEncontrados, responseHeaders,HttpStatus.OK);
    }

    public ResponseEntity<Object> buscarSeriePorId(@ApiParam(value = "Ingrese el id por el cual buscar la serie",required=true ) @PathVariable("id") String id) {
        Serie serieEncontrada = Utiles.getSingletonInstance().getSerie(id);

        Link selfLink = linkTo(methodOn(SerieApiController.class).buscarSeriePorId(serieEncontrada.getIdSerie())).withSelfRel();
        serieEncontrada.removeLinks();
        serieEncontrada.add(selfLink);

        for(Capitulo capitulo: serieEncontrada.getCapitulos()){
            Link selfLinkC = linkTo(methodOn(CapituloApiController.class).buscarCapituloPorId(capitulo.getIdCapitulo())).withSelfRel();
            capitulo.removeLinks();
            capitulo.add(selfLinkC);
        }

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<Object>(serieEncontrada, responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<List<Serie>> buscarSeries() {
        List<Serie> seriesEncontradas = Utiles.getSingletonInstance().getSeries();

        for(Serie serie: seriesEncontradas) {
            Link selfLink = linkTo(methodOn(SerieApiController.class).buscarSeriePorId(serie.getIdSerie())).withSelfRel();
            serie.removeLinks();
            serie.add(selfLink);
            for (Capitulo capitulo : serie.getCapitulos()) {
                Link selfLinkC = linkTo(methodOn(CapituloApiController.class).buscarCapituloPorId(capitulo.getIdCapitulo())).withSelfRel();
                capitulo.removeLinks();
                capitulo.add(selfLinkC);
            }
        }

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<List<Serie>>(seriesEncontradas, responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<Void> crearActualizarSerie(@ApiParam(value = "Ingrese el id que desea actualizar",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Serie a crear"  ) @RequestBody Serie serie) {
        Utiles.getSingletonInstance().putSerie(serie);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

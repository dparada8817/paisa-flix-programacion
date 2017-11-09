package io.swagger.api;

import io.swagger.model.Capitulo;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T01:01:59.715Z")

@Controller
public class CapituloApiController implements CapituloApi {

    public ResponseEntity<Object> buscarCapituloPorId(@ApiParam(value = "Ingrese el id del capitulo por el cual desea buscar",required=true ) @PathVariable("idCapitulo") String idCapitulo) {
        Capitulo capituloEncontrado = Utiles.getSingletonInstance().getCapitulo(idCapitulo);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Codigo", "Java");
        return new ResponseEntity<Object>(capituloEncontrado, responseHeaders, HttpStatus.OK);
    }

    public ResponseEntity<Void> crearActualizarCapituloPorId(@ApiParam(value = "Ingrese el id del capitulo a crear/actualizar",required=true ) @PathVariable("idCapitulo") String idCapitulo,
        @ApiParam(value = "Capitulo a crear"  ) @RequestBody Capitulo capitulo) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}

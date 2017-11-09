package io.swagger.api;

import io.swagger.model.Programa;

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

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T01:01:59.715Z")

@Controller
public class ProgramacionApiController implements ProgramacionApi {

    public ResponseEntity<List<Programa>> buscarProgramacion() {
        List<Programa> programacion = Utiles.getSingletonInstance().getProgramacion().getProgramas();
        return new ResponseEntity<List<Programa>>(programacion,HttpStatus.OK);
    }

}

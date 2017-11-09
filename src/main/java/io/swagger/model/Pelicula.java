package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.api.PeliculaApiController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Pelicula
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-06T16:51:18.406Z")

public class Pelicula extends Programa   {
  @JsonProperty("idPelicula")
  private String idPelicula = null;

  public Pelicula() {
  }

  public Pelicula idPelicula(String idPelicula) {
    this.idPelicula = idPelicula;
    return this;
  }


  public Pelicula(String idPelicula) {
    this.idPelicula = idPelicula;
    add(linkTo(methodOn(PeliculaApiController.class).buscarPeliculaPorId(getIdPelicula())).withSelfRel());
  }

  /**
   * Get idPelicula
   * @return idPelicula
   **/
  @ApiModelProperty(example = "pl1", required = true, value = "")
  public String getIdPelicula() {
    return idPelicula;
  }

  public void setIdPelicula(String idPelicula) {
    this.idPelicula = idPelicula;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pelicula pelicula = (Pelicula) o;
    return Objects.equals(this.idPelicula, pelicula.idPelicula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPelicula);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pelicula {\n");

    sb.append("    idPelicula: ").append(toIndentedString(idPelicula)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


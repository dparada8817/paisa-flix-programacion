package io.swagger.model;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.api.SerieApiController;
import io.swagger.model.Capitulo;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Serie
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-06T16:51:18.406Z")

public class Serie extends ResourceSupport {
  @JsonProperty("idSerie")
  private String idSerie = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("numeroCapitulos")
  private Integer numeroCapitulos = null;

  @JsonProperty("numeroTemporadas")
  private Integer numeroTemporadas = null;

  @JsonProperty("capitulos")
  private List<Capitulo> capitulos = null;

  public Serie() {
  }

  public Serie idSerie(String idSerie) {
    this.idSerie = idSerie;
    return this;
  }

  public Serie(String idSerie) {
    this.idSerie = idSerie;
    add(linkTo(methodOn(SerieApiController.class).buscarSeriePorId(getIdSerie())).withSelfRel());
  }

  /**
   * Get idSerie
   * @return idSerie
   **/
  @ApiModelProperty(example = "s1", required = true, value = "")
  public String getIdSerie() {
    return idSerie;
  }

  public void setIdSerie(String idSerie) {
    this.idSerie = idSerie;
  }

  public Serie nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @ApiModelProperty(example = "Game of thrones", required = true, value = "")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Serie numeroCapitulos(Integer numeroCapitulos) {
    this.numeroCapitulos = numeroCapitulos;
    return this;
  }

  /**
   * Get numeroCapitulos
   * @return numeroCapitulos
   **/
  @ApiModelProperty(example = "6", required = true, value = "")
  public Integer getNumeroCapitulos() {
    return numeroCapitulos;
  }

  public void setNumeroCapitulos(Integer numeroCapitulos) {
    this.numeroCapitulos = numeroCapitulos;
  }

  public Serie numeroTemporadas(Integer numeroTemporadas) {
    this.numeroTemporadas = numeroTemporadas;
    return this;
  }

  /**
   * Get numeroTemporadas
   * @return numeroTemporadas
   **/
  @ApiModelProperty(example = "2", required = true, value = "")
  public Integer getNumeroTemporadas() {
    return numeroTemporadas;
  }

  public void setNumeroTemporadas(Integer numeroTemporadas) {
    this.numeroTemporadas = numeroTemporadas;
  }

  public Serie capitulos(List<Capitulo> capitulos) {
    this.capitulos = capitulos;
    return this;
  }

  /**
   * Get capitulos
   * @return capitulos
   **/
  @ApiModelProperty(value = "")
  public List<Capitulo> getCapitulos() {
    return capitulos;
  }

  public void setCapitulos(List<Capitulo> capitulos) {
    this.capitulos = capitulos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Serie serie = (Serie) o;
    return Objects.equals(this.idSerie, serie.idSerie) &&
            Objects.equals(this.nombre, serie.nombre) &&
            Objects.equals(this.numeroCapitulos, serie.numeroCapitulos) &&
            Objects.equals(this.numeroTemporadas, serie.numeroTemporadas) &&
            Objects.equals(this.capitulos, serie.capitulos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSerie, nombre, numeroCapitulos, numeroTemporadas, capitulos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Serie {\n");

    sb.append("    idSerie: ").append(toIndentedString(idSerie)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    numeroCapitulos: ").append(toIndentedString(numeroCapitulos)).append("\n");
    sb.append("    numeroTemporadas: ").append(toIndentedString(numeroTemporadas)).append("\n");
    sb.append("    capitulos: ").append(toIndentedString(capitulos)).append("\n");
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


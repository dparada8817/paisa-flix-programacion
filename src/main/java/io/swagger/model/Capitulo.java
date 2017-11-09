package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * Capitulo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-06T16:51:18.406Z")

public class Capitulo extends ResourceSupport {
  @JsonProperty("idCapitulo")
  private String idCapitulo = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("numroEpisodio")
  private Integer numroEpisodio = null;

  @JsonProperty("numeroTemporada")
  private Integer numeroTemporada = null;

  public Capitulo idCapitulo(String idCapitulo) {
    this.idCapitulo = idCapitulo;
    return this;
  }

  /**
   * Get idCapitulo
   * @return idCapitulo
   **/
  @ApiModelProperty(example = "T1E1", required = true, value = "")
  public String getIdCapitulo() {
    return idCapitulo;
  }

  public void setIdCapitulo(String idCapitulo) {
    this.idCapitulo = idCapitulo;
  }

  public Capitulo nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @ApiModelProperty(example = "Titulo primer capitulo", required = true, value = "")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Capitulo numroEpisodio(Integer numroEpisodio) {
    this.numroEpisodio = numroEpisodio;
    return this;
  }

  /**
   * Get numroEpisodio
   * @return numroEpisodio
   **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getNumroEpisodio() {
    return numroEpisodio;
  }

  public void setNumroEpisodio(Integer numroEpisodio) {
    this.numroEpisodio = numroEpisodio;
  }

  public Capitulo numeroTemporada(Integer numeroTemporada) {
    this.numeroTemporada = numeroTemporada;
    return this;
  }

  /**
   * Get numeroTemporada
   * @return numeroTemporada
   **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getNumeroTemporada() {
    return numeroTemporada;
  }

  public void setNumeroTemporada(Integer numeroTemporada) {
    this.numeroTemporada = numeroTemporada;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitulo capitulo = (Capitulo) o;
    return Objects.equals(this.idCapitulo, capitulo.idCapitulo) &&
            Objects.equals(this.nombre, capitulo.nombre) &&
            Objects.equals(this.numroEpisodio, capitulo.numroEpisodio) &&
            Objects.equals(this.numeroTemporada, capitulo.numeroTemporada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCapitulo, nombre, numroEpisodio, numeroTemporada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitulo {\n");

    sb.append("    idCapitulo: ").append(toIndentedString(idCapitulo)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    numroEpisodio: ").append(toIndentedString(numroEpisodio)).append("\n");
    sb.append("    numeroTemporada: ").append(toIndentedString(numeroTemporada)).append("\n");
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


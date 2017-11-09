package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * Programa
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-07T01:01:59.715Z")

public class Programa extends ResourceSupport {
  @JsonProperty("idPrograma")
  private String idPrograma = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("tipo")
  private String tipo = null;

  @JsonProperty("categoria")
  private String categoria = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  @JsonProperty("horaInicio")
  private String horaInicio = null;

  @JsonProperty("horaFin")
  private String horaFin = null;

  public Programa idPrograma(String idPrograma) {
    this.idPrograma = idPrograma;
    return this;
  }

   /**
   * Get idPrograma
   * @return idPrograma
  **/
  @ApiModelProperty(example = "p1", required = true, value = "")
  public String getIdPrograma() {
    return idPrograma;
  }

  public void setIdPrograma(String idPrograma) {
    this.idPrograma = idPrograma;
  }

  public Programa nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(example = "Game of Thrones", required = true, value = "")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Programa tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(example = "serie", required = true, value = "")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Programa categoria(String categoria) {
    this.categoria = categoria;
    return this;
  }

   /**
   * Get categoria
   * @return categoria
  **/
  @ApiModelProperty(example = "Infantil,  Acción, ficción", required = true, value = "")
  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public Programa descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

   /**
   * Get descripcion
   * @return descripcion
  **/
  @ApiModelProperty(example = "Serie medieval de fantasía y acción", required = true, value = "")
  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Programa horaInicio(String horaInicio) {
    this.horaInicio = horaInicio;
    return this;
  }

   /**
   * Get horaInicio
   * @return horaInicio
  **/
  @ApiModelProperty(example = "10:30", required = true, value = "")
  public String getHoraInicio() {
    return horaInicio;
  }

  public void setHoraInicio(String horaInicio) {
    this.horaInicio = horaInicio;
  }

  public Programa horaFin(String horaFin) {
    this.horaFin = horaFin;
    return this;
  }

   /**
   * Get horaFin
   * @return horaFin
  **/
  @ApiModelProperty(example = "12:00", required = true, value = "")
  public String getHoraFin() {
    return horaFin;
  }

  public void setHoraFin(String horaFin) {
    this.horaFin = horaFin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Programa programa = (Programa) o;
    return Objects.equals(this.idPrograma, programa.idPrograma) &&
        Objects.equals(this.nombre, programa.nombre) &&
        Objects.equals(this.tipo, programa.tipo) &&
        Objects.equals(this.categoria, programa.categoria) &&
        Objects.equals(this.descripcion, programa.descripcion) &&
        Objects.equals(this.horaInicio, programa.horaInicio) &&
        Objects.equals(this.horaFin, programa.horaFin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPrograma, nombre, tipo, categoria, descripcion, horaInicio, horaFin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Programa {\n");
    
    sb.append("    idPrograma: ").append(toIndentedString(idPrograma)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    horaInicio: ").append(toIndentedString(horaInicio)).append("\n");
    sb.append("    horaFin: ").append(toIndentedString(horaFin)).append("\n");
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


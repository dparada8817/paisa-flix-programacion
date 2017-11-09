package io.swagger.model;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Programa;
import org.springframework.hateoas.ResourceSupport;

/**
 * Programacion
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-06T16:51:18.406Z")

public class Programacion extends ResourceSupport {
  @JsonProperty("idProgramacion")
  private String idProgramacion = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("fecha")
  private String fecha = null;

  @JsonProperty("programas")
  private List<Programa> programas = null;

  public Programacion idProgramacion(String idProgramacion) {
    this.idProgramacion = idProgramacion;
    return this;
  }

  /**
   * Get idProgramacion
   * @return idProgramacion
   **/
  @ApiModelProperty(example = "pr1", required = true, value = "")
  public String getIdProgramacion() {
    return idProgramacion;
  }

  public void setIdProgramacion(String idProgramacion) {
    this.idProgramacion = idProgramacion;
  }

  public Programacion nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @ApiModelProperty(example = "Programación lunes festivo", required = true, value = "")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Programacion fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Get fecha
   * @return fecha
   **/
  @ApiModelProperty(example = "2016-08-29", required = true, value = "")
  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public Programacion programas(List<Programa> programas) {
    this.programas = programas;
    return this;
  }

  /**
   * Get programas
   * @return programas
   **/
  @ApiModelProperty(value = "")
  public List<Programa> getProgramas() {
    return programas;
  }

  public void setProgramas(List<Programa> programas) {
    this.programas = programas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Programacion programacion = (Programacion) o;
    return Objects.equals(this.idProgramacion, programacion.idProgramacion) &&
            Objects.equals(this.nombre, programacion.nombre) &&
            Objects.equals(this.fecha, programacion.fecha) &&
            Objects.equals(this.programas, programacion.programas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProgramacion, nombre, fecha, programas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Programacion {\n");

    sb.append("    idProgramacion: ").append(toIndentedString(idProgramacion)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    programas: ").append(toIndentedString(programas)).append("\n");
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


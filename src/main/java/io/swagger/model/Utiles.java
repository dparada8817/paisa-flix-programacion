package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davicalo on 2017/10/28.
 */
public class Utiles {
  List<Programacion> programaciones = new ArrayList<Programacion>();
  List<Serie> series = new ArrayList<Serie>();
  List<Pelicula> peliculas = new ArrayList<Pelicula>();
  private Programacion programacion ;
  private static Utiles utiles;

  public List<Programacion> getProgramaciones(){
    return programaciones;
  }

  public void agregarProgramacion(Programacion programacion){
      programaciones.add(programacion);
  }

  public Programacion getProgramacion() {
    return programacion;
  }

  private Utiles(){
    programacion = new Programacion();
    programacion.setNombre("Programacion PaisaFlix");
    programacion.setIdProgramacion("1");
    programacion.setFecha("02/02/2017");
    programacion.setProgramas(listaProgramas());
    //programaciones.add(programacion);
      agregarProgramacion(programacion);
      poblarSeries();
      poblarPeliculas();

  }

  public static Utiles getSingletonInstance(){
    if (utiles == null){
      utiles = new Utiles();
    }
    return utiles;
  }


  public List<Pelicula> getPeliculas(){
    return peliculas;
  }

  public Pelicula getPelicula(String id){
    Pelicula peliculaEncontrada= null;
    for(Pelicula prog : peliculas){
        if(((Pelicula) prog).getIdPelicula().compareTo(id) == 0) {
          peliculaEncontrada = (Pelicula)prog;
        }
    }
    return peliculaEncontrada;
  }

  public void putPelicula(Pelicula peliculaInicial){

    boolean encontrada=false;
    Pelicula peliculaEncontrada= null;
    for(Pelicula prog : peliculas){

        if(((Pelicula) prog).getIdPelicula().compareTo(peliculaInicial.getIdPelicula()) == 0) {
          peliculaEncontrada = (Pelicula)prog;
          encontrada=true;
          peliculaEncontrada.setIdPrograma(peliculaInicial.getIdPrograma());
          peliculaEncontrada.setIdPelicula(peliculaInicial.getIdPelicula());
          peliculaEncontrada.setCategoria(peliculaInicial.getCategoria());
          peliculaEncontrada.setTipo(peliculaInicial.getTipo());
          peliculaEncontrada.setDescripcion(peliculaInicial.getDescripcion());
          peliculaEncontrada.setHoraFin(peliculaInicial.getHoraFin());
          peliculaEncontrada.setHoraInicio(peliculaInicial.getHoraInicio());
          peliculaEncontrada.setNombre(peliculaInicial.getNombre());
          break;
        }

    }
    if(!encontrada){
        peliculas.add(peliculaInicial);
    }

  }

  public void putSerie(Serie serieInicial){
    boolean encontrada=false;
    Serie serieEncontrada= null;
    for(Serie prog : series){

        if(((Serie) prog).getIdSerie().compareTo(serieInicial.getIdSerie()) == 0) {
          encontrada = true;
          serieEncontrada = (Serie) prog;

          serieEncontrada.setIdSerie(serieInicial.getIdSerie());

          serieEncontrada.setNombre(serieInicial.getNombre());
          serieEncontrada.setNumeroTemporadas(serieInicial.getNumeroTemporadas());
          serieEncontrada.setNumeroCapitulos(serieInicial.getNumeroCapitulos());
          break;
        }

    }
    if(!encontrada){
      series.add(serieInicial);
    }

  }

  public List<Serie> getSeries(){
    return series;
  }

  public Serie getSerie(String id){
    for(Serie prog : series){
        if(((Serie) prog).getIdSerie().compareTo(id) == 0) {
          return (Serie) prog;
        }
    }
    return null;
  }

  public Capitulo getCapitulo(String idCap, String idSerie){
      Serie serie = getSerie(idSerie);
      if(serie!=null) {
        for (Capitulo cap : serie.getCapitulos()) {
          if (cap.getIdCapitulo().compareTo(idCap) == 0) {
            return cap;
          }
        }
      }

    return null;
  }

    public void putCapitulo(String idSerie, Capitulo capitulo) {
        Serie serie = getSerie(idSerie);
        if(serie!=null) {
            serie.getCapitulos().add(capitulo);
        }
    }

  public List<Capitulo> getCapitulosPorSerie(String idSerie){
    List<Capitulo> capitulosEncontrados = new ArrayList<>();
    for(Serie prog :series){
      if(prog instanceof Serie && ((Serie) prog).getIdSerie().compareTo(idSerie) == 0) {
        for (Capitulo cap : ((Serie) prog).getCapitulos()) {
          capitulosEncontrados.add(cap);
        }
      }
    }
    return capitulosEncontrados;
  }


  private Serie crearSerie(String idPrograma, String idSerie, String categoria, String tipo, String descripcion,
                           String horaFin, String horaInicio, String nombre,
                           int numeroTemporadas, int numeroCapitulos){
    Serie s1 = new Serie(idSerie);
    s1.setIdSerie(idSerie);
    s1.setNombre(nombre);
    s1.setNumeroTemporadas(numeroTemporadas);
    s1.setNumeroCapitulos(numeroCapitulos);
    List<Capitulo> capitulos= new ArrayList<>();
    for(int i = 0 ; i < numeroTemporadas; i++){
      for(int j = 0 ; j < numeroCapitulos/numeroTemporadas; j++){
        capitulos.add(crearCapitulo(idSerie,nombre,i+1,j+1));
      }
    }
    s1.setCapitulos(capitulos);
    return  s1;
  }

  private Capitulo crearCapitulo(String idSerie,String nombreSerie, int temporada, int episodio){
      String idCapitulo = idSerie + "T" + temporada + "E" + episodio;
      Capitulo capitulo=new Capitulo(idCapitulo,idSerie);

      capitulo.setIdCapitulo(idCapitulo);
    capitulo.setNombre("Capitulo: " + "Episodio " + episodio + " de la temporada " + temporada +" de "+nombreSerie);
    capitulo.setNumeroTemporada(temporada);
    capitulo.setNumroEpisodio(episodio);
    return capitulo;
  }



  private Pelicula crearPelicula(String idPrograma, String idPelicula, String categoria, String tipo, String descripcion,
                                 String horaFin, String horaInicio, String nombre){
    Pelicula p1 = new Pelicula(idPelicula);
    p1.setIdPrograma(idPrograma);
    p1.setIdPelicula(idPelicula);
    p1.setCategoria(categoria);
    p1.setTipo(tipo);
    p1.setDescripcion(descripcion);
    p1.setHoraFin(horaFin);
    p1.setHoraInicio(horaInicio);
    p1.setNombre(nombre);
    return  p1;
  }

  public void poblarSeries(){
      series.add(
              crearSerie("pr1","se1","Humor","Serie","Amigos y su vida",
                      "10:20","11:20","Friends",3,12));
      series.add(
              crearSerie("pr2","se2","Drama","Serie","Historia antigua",
                      "10:20","11:20","Encricijada",4,20));
      series.add(
              crearSerie("pr3","se3","Accion","Serie","Nacimiento de guerreros",
                      "10:20","11:20","Vikingos",4,12));
      series.add(
              crearSerie("pr4","se4","Accion","Serie","Super heroe",
                      "10:20","11:20","Superman",3,12));
      series.add(
              crearSerie("pr5","se5","Infantil","Serie","Los Pitufos",
                      "10:20","11:20","Los Pitufos",6,18));
    }


    public void poblarPeliculas(){
        peliculas.add(
                crearPelicula("pr6","pe1","Aventuras","pelicula",
                        "Super heroe en la tierra","11:20","10:00","Superman II"));
        peliculas.add(
                crearPelicula("pr7","pe2","Accion","pelicula",
                        "Pelicula futurista","11:20","10:00","Terminator"));
        peliculas.add(
                crearPelicula("pr8","pe3","Miedo","pelicula",
                        "Niña del mas alla","11:20","10:00","El aro"));
        peliculas.add(
                crearPelicula("pr9","pe4","Drama","pelicula",
                        "II Guerra mundial","11:20","10:00","Espias"));
        peliculas.add(
                crearPelicula("pr10","pe5","Ficcion","pelicula",
                        "Viaje a las estrellas","11:20","10:00","Star Trek"));
    }

  private List<Programa> listaProgramas(){
    List<Programa> programas = new ArrayList<>();


    programas.add(
            crearSerie("pr1","se1","Humor","Serie","Amigos y su vida",
                    "10:20","11:20","Friends",3,12).getCapitulos().get(5));
    programas.add(
            crearSerie("pr2","se2","Drama","Serie","Historia antigua",
                    "10:20","11:20","Encricijada",4,20).getCapitulos().get(10));
    programas.add(
            crearSerie("pr3","se3","Accion","Serie","Nacimiento de guerreros",
                    "10:20","11:20","Vikingos",4,12).getCapitulos().get(6));
    programas.add(
            crearSerie("pr4","se4","Accion","Serie","Super heroe",
                    "10:20","11:20","Superman",3,12).getCapitulos().get(7));
    programas.add(
            crearSerie("pr5","se5","Infantil","Serie","Los Pitufos",
                    "10:20","11:20","Los Pitufos",6,18).getCapitulos().get(1));
    programas.add(
            crearPelicula("pr6","pe1","Aventuras","pelicula",
                    "Super heroe en la tierra","11:20","10:00","Superman II"));
    programas.add(
            crearPelicula("pr7","pe2","Accion","pelicula",
                    "Pelicula futurista","11:20","10:00","Terminator"));
    programas.add(
            crearPelicula("pr8","pe3","Miedo","pelicula",
                    "Niña del mas alla","11:20","10:00","El aro"));
    programas.add(
            crearPelicula("pr9","pe4","Drama","pelicula",
                    "II Guerra mundial","11:20","10:00","Espias"));
    programas.add(
            crearPelicula("pr10","pe5","Ficcion","pelicula",
                    "Viaje a las estrellas","11:20","10:00","Star Trek"));

    return programas;
  }



}

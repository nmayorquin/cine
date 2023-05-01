import javax.swing.*;


public class Pelicula {

    private String nombrePelicula;
    private String director;
    private Genero genero;

    private int duracion;

    private int year;
    private double score;

    public Pelicula() {
    }

    public Pelicula(String nombrePelicula, String director, Genero genero, int duracion, int year, double score) {
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.year = year;
        this.score = score;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    private void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public Genero getGenero() {
        return genero;
    }

    private void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

        public void imprimir(){
            System.out.println("nombre Película: " + this.nombrePelicula + " director: " + this.director +  " género: " + this.genero + " duración: " + this.duracion + " año: " + this.year + " puntuación: " + this.score);
    }
//con esta estructura es un método de clase
    public static boolean esPeliculaEpica(int duracion){
        if(duracion >= 3) //simplificar con operadores ternarios
            return true;
        return false;
    }

    public static String calcularValoracion(double score){

        if(score >= 0 && score <= 2){
            return "muy mala";
        } else if (score > 2 && score <= 5) {
            return "mala";
        } else if (score > 5 && score <=7) {
            return "regular";
        } else if (score >7 && score <= 8) {
           return "buena";
        } else if (score >8 && score <= 10)  {
            return "excelente";
        }else
            return "ingrese valor válido";
    }

    //El método privado boolean esSimilar() compara la película actual con otra película que se le pasa
    //como parámetro. Si ambas películas son del mismo género y tienen la misma valoración
    //METODO DE INSTANCIA:
   public boolean esSimilar(Pelicula pelicula2){
        if(pelicula2.getGenero()==this.getGenero() && pelicula2.getScore()== this.getScore())
            return true;
        return false;
    }

    //METODO DE CLASE: es mejor hacerlo con método de clase porque no debe depender de los valores del objeto
    public static boolean esSimilarClase(Pelicula pelicula, Pelicula pelicula2){
        if(pelicula2.getGenero()== pelicula.getGenero() && pelicula2.getScore()== pelicula.getScore())
            return true;
        return false;
    }
}

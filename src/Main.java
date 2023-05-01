public class Main {
    public static void main(String[] args) {

        Pelicula pelicula = new Pelicula("Ana Frank", "Ana Frank",Genero.DRAMA , 3, 1989, 6.0);
        Pelicula pelicula2 = new Pelicula("Bob espoja", "nn",Genero.DRAMA , 5, 2015, 8.0);


        pelicula.imprimir();
        System.out.println(Pelicula.esPeliculaEpica(pelicula.getDuracion())); //llamada de un metodo de clase
        System.out.println(Pelicula.calcularValoracion(pelicula.getScore()));
        System.out.println(pelicula.esSimilar(pelicula2)); //llamada de un metodo de instancia
        System.out.println(Pelicula.esSimilarClase(pelicula, pelicula2)); //llamada de un metodo de clase
    }


}


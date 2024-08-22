import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Magazine;

public class methods {
    public static void verMenu(){
        System.out.println("MENÚ");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Day");
        System.out.println("0. Exit");
        System.out.print("Selecciona una opción: ");
    }

    public static void subMenuMovie(){
        System.out.println("MENÚ MOVIES");
        System.out.println("1. Show Movies");
        System.out.println("2. Add Movies");
        System.out.println("0. Exit");
        System.out.print("Selecciona una opción: ");
    }
    public static void subMenuSeries(){
        System.out.println("MENÚ SERIES");
        System.out.println("1. Show Series");
        System.out.println("2. Add Series");
        System.out.println("0. Exit");
        System.out.print("Selecciona una opción: ");
    }
    public static void subMenuBook(){
        System.out.println("MENÚ BOOKS");
        System.out.println("1. Show Book");
        System.out.println("2. Add Book");
        System.out.println("0. Exit");
        System.out.print("Selecciona una opción: ");
    }
    public static void subMenuMagazines(){
        System.out.println("MENÚ MAGAZINES");
        System.out.println("1. Show Magazines");
        System.out.println("2. Add Magazines");
        System.out.println("0. Exit");
        System.out.print("Selecciona una opción: ");
    }


    public class methodMovie{
        private static List<Movie> movies = new ArrayList<>();

        public static void addMovie(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el título de la película:");
            String title = scanner.nextLine();

            System.out.println("Ingrese el género:");
            String genre = scanner.nextLine();

            System.out.println("Ingrese el creador:");
            String creator = scanner.nextLine();

            System.out.println("Ingrese la duración:");
            int duration = scanner.nextInt();

            System.out.println("Ingrese el año:");
            int year = scanner.nextInt();

            System.out.println("¿Ya viste esta pelicula?:");
            Boolean viewed = scanner.nextBoolean();

            System.out.println("Ingrese el tiempo que viste la película:");
            int timeViewed = scanner.nextInt();

            Movie newMovie = new Movie(title, genre, creator, duration, year, viewed, timeViewed);
            movies.add(newMovie);
            System.out.println("Película agregada con éxito");
        }

        public static void watchMovies() {
            if (movies.isEmpty()) { // verifica que si hay datos dentro de este y continua
                System.out.println("No hay películas disponibles.");
            } else {
                System.out.println("Lista de películas:");
                for (Movie movie : movies) {
                    System.out.println("ID: " + movie.getId());
                    System.out.println("Título: " + movie.getTitle());
                    System.out.println("Género: " + movie.getGender());
                    System.out.println("Creador: " + movie.getCreator());
                    System.out.println("Duración: " + movie.getDuration() + " minutos");
                    System.out.println("Año: " + movie.getYear());
                    System.out.println("Visto: " + (movie.getViewed() ? "Sí" : "No"));
                    System.out.println("Tiempo visto: " + movie.getTimeViewed() + " minutos");
                    System.out.println();
                }
            }
        }
    }

    public class methodSerie{
        private static List<Serie> series = new ArrayList<>();

        public static void watchSeries() {
            if (series.isEmpty()) { // verifica que si hay datos dentro de este y continua
                System.out.println("No hay series disponibles.");
            } else {
                System.out.println("Lista de películas:");
                for (Serie serie : series) {
                    System.out.println("Id: " + serie.getId());
                    System.out.println("Título: " + serie.getTitle());
                    System.out.println("Género: " + serie.getGender());
                    System.out.println("Creador: " + serie.getCreator());
                    System.out.println("Duración: " + serie.getDuration() + " minutos");
                    System.out.println("Año: " + serie.getYear());
                    System.out.println("Visto: " + (serie.getViewed() ? "Sí" : "No"));
                    System.out.println("Tiempo visto: " + serie.getTimeViewed() + " minutos");
                    System.out.println("Temporadas: " + serie.getsessionQuantity());
                    System.out.println();
                }
            }
        }
    }

    public class methodBook{
        private static List<Book> books = new ArrayList<>();

        public static void watchBooks() {
            if (books.isEmpty()){ // verifica que si hay datos dentro de este y continua
                System.out.println("No hay libros disponibles.");
            } else {
                System.out.println("Lista de libros:");
                for(Book book : books){
                    System.out.println("id:" + book.getId());
                    System.out.println("Título: " + book.getTitle());
                    System.out.println("Fecha edicion:" + book.getEditionDate());
                    System.out.println("Editorial: " + book.getEditorial());
                    System.out.println("Autor:" + book.getAuthors());
                    System.out.println("Isbn:" + book.getisbn());
                    System.out.println("Leido: " + (book.getReaded() ? "Sí" : "No"));
                    System.out.println("Tiempo de lectura: " + book.getTimeReaded() + " minutos");
                }
            }
        }
    }

    public class methodMagazines{
        private static List<Magazine> magazines = new ArrayList<>();

        public static void watchMagazines() {
            if (magazines.isEmpty()) { // verifica que si hay datos dentro de este y continua
                System.out.println("No hay revistas disponibles. ");
            } else {
                System.out.println("Lista de revitas: ");
                for (Magazine magazine : magazines) {
                    System.out.println("id:" + magazine.getId());
                    System.out.println("Título: " + magazine.getTitle());
                    System.out.println("Fecha edicion: " + magazine.getEditionDate());
                    System.out.println("Editorial: " + magazine.getEditorial());
                    System.out.println("Autor: " +magazine.getAuthors());
                }
            }
        }
    }





}
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

        public static void addMovie() {
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

            Movie newMovie = new Movie(title, genre, creator, duration, year);


            System.out.println("Ingrese el Id:");
            int Id = scanner.nextInt();
            newMovie.setId(Id);

            System.out.println("¿la has visto?(true/false):");
            boolean visto = scanner.nextBoolean();
            scanner.nextLine();
            newMovie.setViewed(visto);

            System.out.println("¿Cuántos minutos has tardado en vertela ?");
            int tiempo = scanner.nextInt();
            scanner.nextLine();
            newMovie.setTimeViewed(tiempo);

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

        public static void addSeries() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el título de la serie:");
            String title = scanner.nextLine();

            System.out.println("Ingrese el género:");
            String gender = scanner.nextLine();

            System.out.println("Ingrese el creador:");
            String creator = scanner.nextLine();

            System.out.println("Ingrese la duración:");
            int duration = scanner.nextInt();

            System.out.println("Ingrese la duración:");
            int timeViewed = scanner.nextInt();

            System.out.println("Ingrese la duración:");
            int sessionQuantity = scanner.nextInt();

            Serie newSerie = new Serie(title, gender, creator, duration, timeViewed, sessionQuantity);
            series.add(newSerie);
            System.out.println("Serie agregada con éxito");
        }


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

       public static void addBook() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el título del libro:");
            String title = scanner.nextLine();

            System.out.println("Ingrese la fecha de edición (YYYY-MM-DD):");
            String editionDate = scanner.nextLine();

            System.out.println("Ingrese la editorial:");
            String editorial = scanner.nextLine();

            System.out.println("Ingrese el ISBN:");
            int isbn = scanner.nextInt();

            System.out.println("Ingrese el id:");
          int id = scanner.nextInt();

           System.out.println("Ingrese la editorial:");
           boolean readed = scanner.nextBoolean();

           System.out.println("Ingrese la editorial:");
           int timeReaded = scanner.nextInt();
           scanner.nextLine();

           Book newBook = new Book(title, editionDate, editorial, isbn, id, readed, timeReaded);
           books.add(newBook);
            System.out.println("Libro agregado con éxito");
        }


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

        public static void addMagazines() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el título de la revista:");
            String title = scanner.nextLine();

            System.out.println("Ingrese la fecha de edición:");
            int edititionDate = scanner.nextInt();

            System.out.println("Ingrese la editorial:");
            String editorial = scanner.nextLine();

            Magazine newMagazine = new Magazine(title, edititionDate, editorial);
            magazines.add(newMagazine);
            System.out.println("Revista agregada con éxito");
        }

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
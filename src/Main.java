import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import edu.misena.senaviewer.model.Movie;
import edu.misena.senaviewer.model.Serie;
import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Magazine;

public class Main {
    // Array para guardar datos
    private static List<Movie> movies = new ArrayList<>(); //array que almacenara datos dentro de movies
    private static List<Serie> series = new ArrayList<>();
    private static List<Book> books = new ArrayList<>();
    private static List<Magazine> magazines = new ArrayList<>();

    public static void main(String[] args) {
        // menu y switch

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("MENÚ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Day");
            System.out.println("0. Exit");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMovies();
                    break;
                case 2:
                    mostrarSeries();
                    break;
                case 3:
                    mostrarBooks();
                    break;
                case 4:
                    mostrarMagazines();
                    break;
                case 5:
                    mostrarReport();
                    break;
                case 6:
                    mostrarReportDay();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 0 al 6.");
            }
        }
        scanner.close();
    }


    private static void mostrarMovies() {
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

    private static void mostrarSeries() {
        if (series.isEmpty()) {
            System.out.println("No hay series disponibles.");
        } else {
            System.out.println("Lista de series:");
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

    private static void mostrarBooks() {
        if (books.isEmpty()){
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

    private static void mostrarMagazines() {
        if (magazines.isEmpty()) {
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

    private static void mostrarReport() {
        System.out.println("Generando reporte general...");
    }

    private static void mostrarReportDay() {
        System.out.println("Generando reporte del día...");
    }
    //continuacion
}
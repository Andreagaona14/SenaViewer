import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu= -1;
        int opcionSubMenu= -1;
        while(opcionMenu != 0) {
            methods.verMenu();
            opcionMenu= scanner.nextInt();
            switch (opcionMenu) {
                case 1:
                    methods.subMenuMovie();
                    opcionSubMenu=scanner.nextInt();
                    while (opcionSubMenu != 0){
                        switch (opcionSubMenu){
                            case 1:
                                methods.methodMovie.watchMovies();
                                break;
                            case 2:
                                break;
                        }
                    }

                    break;
                case 2:
                    methods.subMenuSeries();
                    opcionSubMenu=scanner.nextInt();
                    while (opcionSubMenu != 0){
                        switch (opcionSubMenu){
                            case 1:
                                methods.methodSerie.watchSeries();
                                break;
                            case 2:
                                break;
                        }
                    }
                    break;
                case 3:
                    methods.subMenuBook();
                    opcionSubMenu=scanner.nextInt();
                    while (opcionSubMenu != 0){
                        switch (opcionSubMenu){
                            case 1:
                                methods.methodBook.watchBooks();
                                break;
                            case 2:
                                break;
                        }
                    }
                    break;
                case 4:
                    methods.subMenuMagazines();
                    opcionSubMenu=scanner.nextInt();
                    while (opcionSubMenu != 0){
                        switch (opcionSubMenu){
                            case 1:
                                methods.methodMagazines.watchMagazines();
                                break;
                            case 2:
                                break;
                        }
                    }
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
}
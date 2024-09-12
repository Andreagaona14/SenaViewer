import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = -1;
        int opcionSubMenu = -1;

        while (opcionMenu != 0) {
            methods.verMenu();
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    do {
                        methods.subMenuMovie();
                        opcionSubMenu = scanner.nextInt();

                        switch (opcionSubMenu) {
                            case 1:
                                methods.methodMovie.watchMovies();
                                break;
                            case 2:
                                methods.methodMovie.addMovie();
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    } while (opcionSubMenu != 0);
                    break;

                case 2:
                    do {
                        methods.subMenuSeries();
                        opcionSubMenu = scanner.nextInt();

                        switch (opcionSubMenu) {
                            case 1:
                                methods.methodSerie.watchSeries();
                                break;
                            case 2:
                                methods.methodSerie.addSeries();
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    } while (opcionSubMenu != 0);
                    break;

                case 3:
                    do {
                        methods.subMenuBook();
                        opcionSubMenu = scanner.nextInt();

                        switch (opcionSubMenu) {
                            case 1:
                                methods.methodBook.watchBooks();
                                break;
                            case 2:
                                methods.methodBook.addBook();
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    } while (opcionSubMenu != 0);
                    break;

                case 4:
                    do {
                        methods.subMenuMagazines();
                        opcionSubMenu = scanner.nextInt();

                        switch (opcionSubMenu) {
                            case 1:
                                methods.methodMagazines.watchMagazines();
                                break;
                            case 2:
                                methods.methodMagazines.addMagazines();
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }
                    } while (opcionSubMenu != 0);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 0 al 4.");
            }
        }

        scanner.close();
    }
}

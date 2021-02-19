import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

    private static final String EXIT = "0";
    private static final String LOAD_VEHICLE_INFORMATION_AND_ADD_TO_QUEUE = "1";
    private static final String NEXT_VEHICLE = "2";


    @SuppressWarnings("checkstyle:Indentation")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;
        Queue<Vehicle> queue = new LinkedList<>();

        do {
            options();
            switch (option = scanner.nextLine()) {
                case EXIT:
                    System.out.println("Wyjście z programu");
                    break;
                case LOAD_VEHICLE_INFORMATION_AND_ADD_TO_QUEUE:
                    System.out.println("Podaj typ pojazdu: ");
                    String type = scanner.nextLine();
                    System.out.println("Podaj marke: ");
                    String brand = scanner.nextLine();
                    System.out.println("Podaj model: ");
                    String model = scanner.nextLine();
                    System.out.println("Podaj rocznik: ");
                    int year = scanner.nextInt();
                    System.out.println("Podaj przebieg: ");
                    int mileage = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Podaj numer Vin: ");
                    String vinNumber = scanner.nextLine();
                    Vehicle vehicle = new Vehicle(type, brand, model, year, mileage, vinNumber);
                    queue.offer(vehicle);
                    break;
                case NEXT_VEHICLE:
                    Vehicle nextVehicle = queue.poll();
                    System.out.println(nextVehicle + " proszony na przegląd");
                    System.out.println(nextVehicle + " obsłużony");
                    break;
                default:
                    throw new IllegalArgumentException("Podano złą opcję");
            }
        } while (!option.equals(EXIT));
    }

    private static void options() {
        System.out.println("Masz następujące opcje do wybrania: ");
        System.out.println("- Wyjście z programu: " + EXIT);
        System.out.println("- Wczytanie informacji o nowym pojeździe i dodanie go do kolejki: "
                + LOAD_VEHICLE_INFORMATION_AND_ADD_TO_QUEUE);
        System.out.println("- Pobranie kolejnego pojazdu, który zostanie poddany przeglądowi: " + NEXT_VEHICLE);
    }
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Vehicle> queue = new LinkedList<>();
        DataReader dataReader = new DataReader();
        dataReader.loadingData(scanner, queue);
    }
}

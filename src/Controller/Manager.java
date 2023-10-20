package Controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import Common.Algorithm;
import Common.Library;
import Views.Menu;

public class Manager extends Menu<String> {
    static String[] options = { "Validate Phone",
            "Validate Email",
            "Validate Date", "Exit" };
    Algorithm algorithm = new Algorithm();
    Library library = new Library();

    public Manager() {
        super("====== Validate Progaram ======", options);
    }

    @Override
    public void execute(int n) throws FileNotFoundException, IOException {
        switch (n) {
            case 1:
                System.out.println(algorithm.checkInputPhone());
                break;
            case 2:
                System.out.println(algorithm.checkInputEmail());
                break;
            case 3:
                System.out.println(algorithm.checkInputDate());
                break;
            case 4:
                System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException {
        new Manager().run();
    }
}

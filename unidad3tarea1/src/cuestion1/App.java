package cuestion1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main (String[] args) throws FileNotFoundException {
        String aux="";
        Scanner scanner= new Scanner(new File("palabras.txt"));
        while(scanner.hasNextLine()){
            aux.concat(scanner.nextLine());
        }
        scanner.close();

        System.out.println(aux);
    }

}

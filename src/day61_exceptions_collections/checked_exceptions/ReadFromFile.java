package day61_exceptions_collections.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {   // eger declare edersek yanlis yazarsak handle etmez ve code durur

        String filePath = "src/day61_exceptions_collections/checked_exceptions/data.txt";
        Files.readAllLines(Paths.get(filePath));

        List<String> data = Files.readAllLines(Paths.get(filePath));

        for(String line: data){
            System.out.println(line);
        }
    }
}

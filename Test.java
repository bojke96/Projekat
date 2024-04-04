import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            // Putanja do datoteke
            String filePath = "Primer/test.txt";

            // Otvaranje datoteke za pisanje
            FileWriter fileWriter = new FileWriter(filePath);

            // Korišćenje BufferedWriter za efikasniji rad sa tekstualnim podacima
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Tekst koji želimo da upišemo u datoteku
            String textToWrite = "Ovo je tekst koji želimo da upišemo u datoteku.";

            // Upisivanje teksta u datoteku
            bufferedWriter.write(textToWrite);

            // Zatvaranje BufferedWriter i FileWriter objekata
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Tekst uspešno upisan u datoteku.");
        } catch (IOException e) {
            System.out.println("Greška prilikom upisa u datoteku: " + e.getMessage());
        }
    }
}
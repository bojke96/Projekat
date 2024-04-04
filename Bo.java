import java.io.*;
import java.util.Scanner;

public class Bo {
    public static void main(String[] args) {
        try {
            // Putanja do datoteke
            Scanner sc=new Scanner(System.in);
            String filePath = sc.nextLine();

            // Otvaranje datoteke za pisanje
            FileWriter fileWriter = new FileWriter(filePath);

            // Korišćenje BufferedWriter za efikasniji rad sa tekstualnim podacima
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
         
            // Tekst koji želimo da upišemo u datoteku
            String textToWrite = sc.nextLine();

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
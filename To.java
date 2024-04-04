import java.io.*;
public class To {
    public static void main(String[] args) {
        try {
            // Putanja do datoteke
            String filePath = "test.txt";

            // Otvaranje datoteke za čitanje
            FileReader fileReader = new FileReader(filePath);

            // Korišćenje BufferedReader za efikasniji rad sa tekstualnim podacima
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Čitanje linija iz datoteke
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Zatvaranje BufferedReader i FileReader objekata
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Greška prilikom čitanja iz datoteke: " + e.getMessage());
        }
    }
}
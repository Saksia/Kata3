
package kata3;
import java.io.BufferedReader;
import java.io.FileReader;

public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> histo = new Histogram<>();
        String pathName = "/Users/Saskia/Desktop/email.txt";
        
        try{
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            String mail;
            while((mail = fileIn.readLine()) != null){
                if(!mail.contains("@")) continue;
            }
            histo.increment(mail.split("@")[1].toLowerCase());
        } catch (Exception e) {
            System.out.println("El fichero no existe");
        }
        HistogramDisplay histoDisplay = new HistogramDisplay(histo);
        histoDisplay.execute();
    }

import java.io.File;
import java.util.Scanner;

public class DateiHandler {
  Scanner s;
  DateiHandler(File f) {
    try {
      {
        s = new Scanner(f);
      }
    } catch(FileNotFoundException e) {
      e.printStackTrace();
    }
  } // end of DateiHandler
  public Mensch lesen() {
    if (s.hasNext()) {
      int id = s.nextInt();
      String nachname = s.next();
      String vornahme = s.next();
      String klasse = s.next();
      String email = s.next();
      String wahleins = s.next();
      String wahlzwei = s.next();
      String wahldrei = s.next();
      String wahlvier = s.next();
      String datum = s.next();
      String uhrzeit = s.next();
      return new Mensch(id, nachname, vorname, klasse, email, wahleins, wahlzwei, wahldrei, wahlvier, datum, uhrzeit);
    } // end of if
    return null;
  } // end of public mensch
  public void schliessen () { //Datei wird geschlossen
    s.close();
  } 
} // end of class DateiHandler

public class Teilnehmer {
  public static void main(String args[]) {
    file f = new File("H://Dokumente//Probetabelle.csv");
    DateiHandel dh = new DateiHandel(f);
    Mensch a = dh.lesen();
    Mensch b = dh.lesen();
    Mensch g = dh.lesen();
    Mensch m = dh.lesen();
    Mensch ä = dh.lesen();
    Mensch s = dh.lesen();
    Mensch y = dh.lesen();
    Mensch z = dh.lesen();
    
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(g.toString());
    System.out.println(m.toString());
    System.out.println(ä.toString());
    System.out.println(s.toString());
    System.out.println(y.toString());
    System.out.println(z.toString());
    dh.schliessen();
  }
  while (scanIn.hasNextLine()) { 
  InputLine = scanIn.nextLine();
  String[] InArray = InputLine.split(",");
  for (int x = 0; x < InArray.length; x++) {
    myArray[Rowc] [x] = Double.parseDouble(InArray[x]);
  } // end of for
  Rowc++;
  } // end of while
}
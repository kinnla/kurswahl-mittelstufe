/* Autor: Zemke
   Version: 1.0   , Datum: 25.01.2019
   Beschreibung: Die Klasse Kurs hat als Attribute einen Kursnamen, die Anzahl
                  der Teilnehmer, die maximale Anzahl verf�gbarer Pl�tze, 
                  den Namen des Kursleiters, das Halbjahr, in dem er stattfindet,
                  den Status, ob der Kurs voll ist oder nicht, und die Namen und
                  Vornamen der Kursteilnehmer/innen
                  
                  Bei einem Objekt Kurs k�nnen die Attributwerte abgerufen, ein-
                  gegeben und ge�ndert werden (get-/set-Methoden), zudem die Na-
                  men der Kursteilnehmer/innen eingef�gt werden und angegeben 
                  werden, ob der Kurs voll ist oder wie viele Pl�tze noch frei 
                  sind. */
                 
public class Kurs {
  String kursname;                  // der Kurs hat einen Namen
  String[] teilnehmerVornamen = new String[20];    // der Kurs hat Teilnehmer mit Vor-
  String[] teilnehmerNachnamen = new String[20];   // und Nachnamen
  int teilnehmerzahl;              // es gibt eine Teilnehmerzahl
  String kursleiter;                // der Kurs hat einen Leiter
  int halbjahr;                    // der Kurs wird im 1. oder 2. Halbjahr angeboten
  boolean belegtstatus;             // der Kurs ist voll oder nicht
  int maximalzahl;                 // es gibt eine maximale Teilnehmerzahl, ist diese 
                                    // erreicht, dann ist der Kurs voll
  // Konstruktor
  Kurs(String k, String l, int tz, int hj, int m){    // ein Kurs wird angelegt
    kursname = k;
    kursleiter = l;
    teilnehmerzahl = tz;
    halbjahr = hj;
    maximalzahl = m;
    belegtstatus = true;
  }
// weitere Methoden deklarieren
/*   public DT Methodenname (DT Parameter){
     Anweisungen
     }    */
  public String gibKursname( ){
    return kursname;
  }
  
  public String gibKursleitername( ){
    return kursleiter;
  }
  
  public int gibTeilnehmerzahl( ){
    return teilnehmerzahl;
  }
  
  public int gibHalbjahr( ){
    return halbjahr;
  }  
  
  public void setKursleiter(String l){
    kursleiter = l;  
  }
  
  public void setHalbjahr(int hj){
    halbjahr = hj;  
  }
  
  public void setTeilnehmerzahl(int tz ){
    teilnehmerzahl = tz;
  } 
  
  public void setKursname(String k){
    kursname = k;
  } 
  
  public void istVoll(){
    
    if (teilnehmerzahl >= maximalzahl) {      // if (status == false) {
      System.out.println("Kurs ist voll.");
    } else {
      System.out.println("Kurs kann noch "+(maximalzahl-teilnehmerzahl)+ " Schueler aufnehmen.");  
    }
  }

    // Kursteilnehmer wird in die Namensliste eingef�gt
    // Teilnehmeranzahl wird um 1 erh�ht
    // wenn maximalzahl erreicht, dann kein einf�gen mehr m�glich

  public void einfuegen (String tv, String tn){                        //wenn nichts enthalten, dann name einf�gen
    int n=maximalzahl; // Methode length hier besser
    for (int i=0;i<=n-1 ;i++) {
      if (teilnehmerVornamen[i]==null&& teilnehmerNachnamen[i]==null){
        teilnehmerVornamen[i]= tv;
        /*    }  
        else {
        System.out.println("Der Kurs ist voll, kein weiterer Eintrag m�glich.");
        }   
        }
        m=maximalzahl; // Methode length hier besser  --> Arrayl�nge
        for (j=0;j<=m-1 ;j++) {
        if (teilnehmerNachnamen[j]==0){    */
        teilnehmerNachnamen[i]= tn;
        teilnehmerzahl ++;
      }
      else {
        System.out.println("Der Kurs ist voll, kein weiterer Eintrag m�glich.");
      } // end of if-else
    }
    
  } // end of for
 

    


  public static void main (String[] args){
    Kurs kurs = new Kurs ("test", "nn", 15, 1, 20);
    kurs.istVoll();
    kurs.einfuegen( "Nina","Musterfrau");
    System.out.println(kurs.teilnehmerNachnamen[0]);
    System.out.println(kurs.teilnehmerVornamen[0]);
  }
}


//   Random --> Zufallszahlen
//   util.sort --> Arrays und Listen sortieren 

/*public void einfuegen (String tv, String tn){                        //wenn nichts enthalten, dann name einf�gen
    int n=maximalzahl; // Methode length hier besser
    for (int i=0;i<=n-1 ;i++) {
      if (teilnehmerVornamen[i]==null&& teilnehmerNachnamen[i]==null){
        teilnehmerVornamen[i]= tv;
      -----      }  
        else {
        System.out.println("Der Kurs ist voll, kein weiterer Eintrag m�glich.");
        }   
        }
        m=maximalzahl; // Methode length hier besser  --> Arrayl�nge
        for (j=0;j<=m-1 ;j++) {
        if (teilnehmerNachnamen[j]==0){    ------
        teilnehmerNachnamen[i]= tn;
        teilnehmerzahl ++;
      }
      else {
        System.out.println("Der Kurs ist voll, kein weiterer Eintrag m�glich.");
      } // end of if-else
    }
    
  } 
  */
/* Autor: Zemke
   Version: 1.0   , Datum: 30.01.2019
   Beschreibung:  Die Klasse ...
                  
                  Bei einem Objekt ...  */
                 
public class Teilnehmer {
  String[] vornamen = new String[200];    // Teilnehmer haben Vor-
  String[] nachnamen = new String[200];   // und Nachnamen
  String[] klasse = new String[200];      // Klassenangabe
  String[] email = new String[200];       // E-Mail-Adressen
  String[] wunschA = new String[200];     // 1.Wunsch
  String[] wunschB = new String[200];     // 2.Wunsch
  String[] wunschC = new String[200];     // 3.Wunsch
  String[] wunschD = new String[200];     // 4.Wunsch
  String[] wahlA = new String[200];       // 1. belegter Kurs
  String[] wahlB = new String[200];       // 2. belegter Kurs
  String[] wahlDatum = new String[200];   // Datum der Wunschabgabe

  // Konstruktor
Teilnehmer(String nn, String vn, String k, String e, String wA, String wB, String wC,String wD){    // ein Teilnehmer wird angelegt
    nachname = nn;
    vorname = vn;
    klasse = k;
    email= e;
    wunschA = wA;
    wunschB = wB;
    wunschC = wC;
    wunschD = wD;
  }
// weitere Methoden deklarieren


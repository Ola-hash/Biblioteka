import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteka {
    private ArrayList<Ksiazka> ksiazki;
    private String adres;
    private String nazwaBiblioteki;


    public Biblioteka(String adres) {
        this.adres = adres;
        ksiazki = new ArrayList<>();
    }

    public String dajNazweBiblioteki() {
        return nazwaBiblioteki;
    }

    public String dajAdres() {
        return adres;
    }

    public String godzinyOtwarcia() {
        return "Biblioteki są otwarte codzinennie od 9:00 do 17:00";
    }


    public void wypozycz(Ksiazka ksiazka) {
        if (ksiazki.contains(ksiazka)) {
            if (ksiazka.czyWypozyczona()) {
                System.out.println("Nie mozna wypozyczyć, książka została już wypożyczona.");
            } else {
                ksiazka.setCzyWypozyczona(true);
                System.out.println("Ksiązka została wypożyczona.");
            }
        } else {
            System.out.println("Książki nie ma w bibliotece.");
        }
    }

    public void zwrocKsiazke(Ksiazka ksiazka) {
        if (ksiazki.contains(ksiazka)) {
            ksiazka.setCzyWypozyczona(false);
            System.out.println("Ksiązka została zwrocona.");
        } else {
            System.out.println("Podanej książki nie ma w bibiotece.");
        }
    }

    public void ksiazkiWBibliotece() {
        for (Ksiazka ksiazka1 : ksiazki) {
            System.out.println(ksiazka1);
        }
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        ksiazki.add(ksiazka);
    }

    public void wczytajKsiazkiZPliku(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String array[] = data.split(";");
                for (int i = 0; i < array.length; i++) {
                    String[] books = array[i].split("-");
                    String autor = books[0];
                    String tytul = books[1];
                    //          Ksiazka ksiazka = new Ksiazka(tytul, autor, );
                    //        dodajKsiazke(ksiazka);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku.");
        }

    }


}

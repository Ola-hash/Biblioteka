import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteka {
    private ArrayList<Ksiazka> ksiazki;
    private String adres;
    private String nazwaBiblioteki;


    public Biblioteka(String adres, String nazwaBiblioteki) {
        this.adres = adres;
        this.nazwaBiblioteki = nazwaBiblioteki;

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
                    String opis = books[2];
                    String rodzaj = books[3];
                    Ksiazka ksiazka = stworzKsiazke(autor, tytul, opis, rodzaj);
                    ksiazki.add(ksiazka);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku.");
        }catch (NoElementFoundExeption e){
            e.getMessage();
        }
    }

    public Ksiazka stworzKsiazke(String autor, String tytul, String opis, String rodzaj) throws NoElementFoundExeption {

        switch (rodzaj) {
            case "Epopeja":
                return new Epopeja(autor, tytul, opis, rodzaj);
            case "Kryminal":
                return new Kryminal(autor, tytul, opis, rodzaj);
            case "Ksiazka Fantastyczna":
                return new KsiazkaFantastyczna(autor, tytul, opis, rodzaj);
            case "Ksiazka naukowa":
                return new KsiazkaNaukowa(autor, tytul, opis, rodzaj);
            default:
                throw new NoElementFoundExeption("Nie znaleziono rodzaju" + rodzaj);
        }


    }


}

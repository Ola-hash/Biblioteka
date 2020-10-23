import java.util.ArrayList;

public class Biblioteka {
    ArrayList<Ksiazka> ksiazki;

    public Biblioteka() {
        ksiazki = new ArrayList<>();
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


}

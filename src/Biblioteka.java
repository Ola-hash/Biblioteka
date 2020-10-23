import java.util.ArrayList;

public class Biblioteka {
    ArrayList<Ksiazka> ksiazki;

    public Biblioteka() {
        ksiazki = new ArrayList<>();
    }

    public void wypozycz(Ksiazka ksiazka) {
        for (Ksiazka ksiazka1 : ksiazki) {
            if (ksiazka.getTytul().contains(ksiazka1.getTytul())) {
                if (ksiazka.czyWypozyczona()) {
                    System.out.println("Nie mozna wypozyczyć, książka została już wypożyczona.");
                    return;
                } else {
                    ksiazka.setCzyWypozyczona(true);
                    System.out.println("Ksiązka została wypożyczona.");
                    return;
                }
            } else {
                System.out.println("Książki nie ma w bibliotece.");
                return;
            }
        }
    }

    public void zwrocKsiazke(Ksiazka ksiazka) {
        ksiazka.setCzyWypozyczona(false);
        System.out.println("Ksiązka .");
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

public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", "epopeja", "o panu");
        Ksiazka ksiazka1 = new Ksiazka("Lalka", "Boleslaw Prus", "kryminal", "o lalce");

        Biblioteka pierwsza = new Biblioteka("Armii Krajowej 1");
        Biblioteka druga = new Biblioteka("Armii Krajowej 16");
        pierwsza.dodajKsiazke(ksiazka);
        pierwsza.dodajKsiazke(ksiazka1);
        pierwsza.ksiazkiWBibliotece();
        druga.dodajKsiazke(ksiazka1);
        System.out.println("  ----");
        druga.ksiazkiWBibliotece();


    }
}

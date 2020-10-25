public class Main {
    public static void main(String[] args) throws NoElementFoundExeption {
        Ksiazka ksiazka = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", "epopeja", "o panu");
        Ksiazka ksiazka1 = new Ksiazka("Lalka", "Boleslaw Prus", "kryminal", "o lalce");

       Biblioteka biblioteka=new Biblioteka("as","sdd");
       biblioteka.wczytajKsiazkiZPliku("file.txt");
       biblioteka.ksiazkiWBibliotece();

    }
}

import java.util.ArrayList;
import java.util.Objects;

public class Ksiazka {
    private String tytul;
    private String autor;
    private String rodzaj;
    private String opis;
    private boolean czyWypozyczona;

    public Ksiazka(String tytul, String autor, String rodzaj, String opis) {
        this.tytul = tytul;
        this.autor = autor;
        this.rodzaj = rodzaj;
        this.opis = opis;
        czyWypozyczona = false;
    }

    public boolean czyWypozyczona() {
        return czyWypozyczona;
    }

    public String dajTytul() {
        return tytul;
    }

    public String dajRodzaj() {
        return rodzaj;
    }

    public String dajOpis() {
        return opis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ksiazka)) return false;
        Ksiazka ksiazka = (Ksiazka) o;
        return Objects.equals(tytul, ksiazka.tytul) &&
                Objects.equals(autor, ksiazka.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytul, autor);
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isCzyWypozyczona() {
        return czyWypozyczona;
    }

    public void setCzyWypozyczona(boolean czyWypozyczona) {
        this.czyWypozyczona = czyWypozyczona;
    }

    @Override
    public String toString() {
        return "Tytul: " + tytul + ", autor: " + autor;
    }
}

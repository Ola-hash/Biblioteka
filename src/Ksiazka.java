import java.util.ArrayList;
import java.util.Objects;

public class Ksiazka {
    private String tytul;
    private String autor;
    private boolean czyWypozyczona;

    public Ksiazka(String tytul) {
        this.tytul = tytul;
        czyWypozyczona=false;
    }


    public boolean czyWypozyczona() {
        return czyWypozyczona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ksiazka)) return false;
        Ksiazka ksiazka = (Ksiazka) o;
        return Objects.equals(tytul, ksiazka.tytul);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tytul);
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
        return tytul;
    }
}

public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        }
    }

    public void wypiszDostepneKsiazki() {
        System.out.println("Dostepne ksiazki:");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }

    public int policzDostepneKsiazki() {
        int n = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                n++;
            }
        }
        return n;
    }
    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka k = znajdzKsiazkePoTytule(tytul);
        if (k == null) {
            System.out.println("Brak ksiazki o tytule: " + tytul);
            return;
        }
        if (!k.isDostepna()) {
            System.out.println("Ksiazka juz wypozyczona");
            return;
        }
        k.wypozycz();
        czytelnik.zwiekszLiczbeWypozyczen();
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka k = znajdzKsiazkePoTytule(tytul);
        if (k == null) {
            System.out.println("Brak ksiazki o tytule: " + tytul);
            return;
        }
        if (k.isDostepna()) {
            System.out.println("Ksiazka nie byla wypozyczona");
            return;
        }
        k.zwroc();
        czytelnik.zmniejszLiczbeWypozyczen();
    }

}

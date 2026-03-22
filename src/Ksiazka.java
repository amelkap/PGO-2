public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;
    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Strony: " + liczbaStron);
        System.out.println("Dostepna:" + dostepna);
    }

    public void wypozycz(){
        if (dostepna) {
            dostepna = false;
            System.out.println("Wypozyczono ksiazke");
        }
        else {
            System.out.println("Ksiazka jest juz wypozyczona");
        }
    }
    public void zwroc(){
        dostepna = true;
        System.out.println("Ksiazka zostala zwrocona");
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}

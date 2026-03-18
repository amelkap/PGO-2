public class Main {
    public static void main(String[] args) {
        //ZAD1
        Ksiazka k1 = new Ksiazka("Upadek", "Camus", 300, true);
        Ksiazka k2 = new Ksiazka("Zatracenie", "Dazai", 150, true);
        Ksiazka k3 = new Ksiazka("Mroki", "Borszewicz", 400, true);

        k1.wypiszInfo();
        System.out.println();

        k1.wypozycz();
        System.out.println();

        k1.zwroc();
        k1.wypiszInfo();
        System.out.println();
        //ZAD2
        Czytelnik c1 = new Czytelnik("Amelia", "Pawlowska", "103");
        Czytelnik c2 = new Czytelnik("Anna", "Jachymiak", "305");

        c1.wypiszDane();
        c2.wypiszDane();

        c1.zwiekszLiczbeWypozyczen();
        c2.zwiekszLiczbeWypozyczen();

        c2.zmniejszLiczbeWypozyczen();
        System.out.println("Po wypozyczeniu:");
        c1.wypiszDane();
        c2.wypiszDane();
    }
}

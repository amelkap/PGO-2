public class Main {
    public static void main(String[] args) {

        Ksiazka k1 = new Ksiazka("Upadek", "Camus", 300, true);
        Ksiazka k2 = new Ksiazka("Zatracenie", "Dazai", 150, true);
        Ksiazka k3 = new Ksiazka("Mroki", "Borszewicz", 400, true);

        k1.wypiszInfo();
        System.out.println();

        k1.wypozycz();
        System.out.println();

        k1.zwroc();
        k1.wypiszInfo();


    }
}

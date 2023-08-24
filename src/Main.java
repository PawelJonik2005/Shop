import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produkt produkt1 = new Produkt("Monitor", 899, "Monitor gamingowy 144hz");
        Produkt produkt2 = new Produkt("Klawiatura", 200, "Klawiatura z podświetlenuiem");
        Koszyk koszyk = new Koszyk();

        while (true) {
            System.out.println("Lista produktów: ");
            System.out.println(produkt1.getNazwa() + " - " + produkt1.getCena() + "zł (" + produkt1.getOpis() + ")");
            System.out.println(produkt2.getNazwa() + " - " + produkt2.getCena() + "zł (" + produkt2.getOpis() + ")");
            System.out.println("1. Dodaj produkt do koszyka");
            System.out.println("2. Usun produkt z koszyka");
            System.out.println("3. Zawartość koszyka");
            System.out.println("4. Wyjście");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Który produkt chcesz dodać do koszyka?");
                    System.out.println("1. " + produkt1.getNazwa());
                    System.out.println("2. " + produkt2.getNazwa());
                    int addProduct = scanner.nextInt();
                    switch (addProduct) {
                        case 1:
                            koszyk.dodajProdukt(produkt1);
                            System.out.println("Dodano " + produkt1.getNazwa() + " do koszyka.");
                            break;
                        case 2:
                            koszyk.dodajProdukt(produkt2);
                            System.out.println("Dodano " + produkt2.getNazwa() + " do koszyka.");
                            break;
                        default:
                            System.out.println("Nieprawidłowy wybór produktu.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Który produkt chcesz usunąć z koszyka?");
                    System.out.println("1. " + produkt1.getNazwa());
                    System.out.println("2. " + produkt2.getNazwa());
                    int removeProduct = scanner.nextInt();
                    switch (removeProduct) {
                        case 1:
                            koszyk.usunProdukt(produkt1);
                            System.out.println("Usunięto " + produkt1.getNazwa() + " z koszyka.");
                            break;
                        case 2:
                            koszyk.usunProdukt(produkt2);
                            System.out.println("Usunięto " + produkt2.getNazwa() + " z koszyka.");
                            break;
                        default:
                            System.out.println("Nieprawidłowy wybór produktu.");
                    }
                    break;
                case 3:
                    System.out.println("Zawartość koszyka: ");
                    for (Produkt produkt : koszyk.getProdukty()) {
                        System.out.println(produkt.getNazwa() + " - " + produkt.getCena() + " zł");
                    }
                    System.out.println("Cena całkowita zamówienia: " + koszyk.obliczCeneCalkowita() + " zł");
                    break;
                case 4:
                    System.out.println("Dziękujemy za wizytę. Do widzenia!");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór opcji.");
            }
        }
    }
}

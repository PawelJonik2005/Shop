import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    private List<Produkt> produkty;

    public Koszyk() {
        this.produkty = new ArrayList<>();
    }
    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }
    public void usunProdukt(Produkt produkt) {
        produkty.remove(produkt);
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }
    public double obliczCeneCalkowita() {
        double suma = 0;
        for (Produkt produkt : produkty) {
            suma += produkt.getCena();
        }
        return suma;
    }
}

public class Zamówienie {
    private Koszyk koszyk;
    private double cenaCalkowita;

    public Zamówienie(Koszyk koszyk) {
        this.koszyk = koszyk;
        this.cenaCalkowita = koszyk.obliczCeneCalkowita();
    }

    public Koszyk getKoszyk() {
        return koszyk;
    }

    public double getCenaCalkowita() {
        return cenaCalkowita;
    }

}

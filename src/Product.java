public class Product {
    private String nazwa;
    private String producent;
    private double cena;

    public Product(String nazwa, String producent, double cena) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Produkt: " + nazwa + " (producent: " + producent + ", cena: " + cena + ")";
    }
}

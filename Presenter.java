public class Presenter {
    private ServiceSale serviceSale;

    public Presenter() {
    }

    public double addSale(String name, double value, int stock, boolean iva, ETypeProduct typeProduct) {
        return serviceSale.getSale().getTotalSale();
    }

    public String showSale() {
        System.out.println(serviceSale.getSale().toString());
        System.out.println("\n Descuento: " + serviceSale.getSale().calcDiscount());
        System.out.println("\n Iva: " + serviceSale.getSale().calcIva());
        return showSale();
    }
}

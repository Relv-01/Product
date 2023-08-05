public class Presenter {
    private ServiceSale serviceSale;

    public Presenter() {
    }

    public double addSale(Sale sale) {
        return sale.getTotalSale();
    }

    public String showSale() {
        System.out.println(serviceSale.getSale().toString());
        System.out.println("\n Descuento: " + serviceSale.getSale().calcDiscount());
        System.out.println("\n Iva: " + serviceSale.getSale().calcIva());
        return showSale();
    }
}

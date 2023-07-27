public class ServiceSale {
    private Sale Sale;

    public ServiceSale(Sale sale) {
        Sale = sale;
    }

    public Sale getSale() {
        return Sale;
    }

    public void setSale(Sale sale) {
        Sale = sale;
    }
}

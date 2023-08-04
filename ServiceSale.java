public class ServiceSale {
    private Product Sale;

    public ServiceSale(Product Product, int cant ) {
        Sale = Product;
    }

    public Product getSale() {
        return Sale;
    }

    public void setSale(Product sale) {
        Sale = sale;
    }
}

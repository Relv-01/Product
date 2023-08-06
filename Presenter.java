public class Presenter {
    private ServiceSale serviceSale;
    private String name;
    private double value;
    private int stock;
    private boolean iva;
    private ETypeProduct typeProduct;
    public Presenter() {
    }

    public double addSale(String name , double value, int stock, boolean iva, ETypeProduct typeProduct) {
        this.name = name; this.value = value; this.stock = stock; this.iva = iva; this.typeProduct = typeProduct; 
        Product product = new Product(name, value, stock, iva, typeProduct);
        Sale sale = new Sale(stock, product);
        return sale.getTotalSale();
    }

    public String showSale() {
        Product product = new Product(name, value, stock, iva, typeProduct);
        Sale sale = new Sale(stock, product);
        return product.toString() + "\nDescuento: " + sale.calcDiscount() + "\nIva: " + sale.calcIva();  
    }
}

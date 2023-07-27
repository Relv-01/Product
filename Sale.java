public class Sale {
    private int cant;
    private Product Product;
    
    public Sale(int cant, Product product) {
        this.cant = cant;
        Product = product;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product product) {
        Product = product;
    }
    public int calcDiscount (){
        return 0;
    }

    public double getTotalSale(){
        return 0.0;
    }

    public double calcIva (){
         double calcIva = Product.getValue() * 0.16;
        return calcIva;
    }
}

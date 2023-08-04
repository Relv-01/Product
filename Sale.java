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

    public double calcDiscount() {
        double discount = 1;
        if (Product.getStock() == 5 && Product.getStock() == 10){
           discount =  Product.getValue() * Product.getStock() * 0.05;
        }else if (Product.getStock() == 11 && Product.getStock() == 20){
            discount = Product.getValue() * Product.getStock() * 0.10;
        }else if (Product.getStock() == 21 && Product.getStock() == 50){
            discount = Product.getValue() * Product.getStock() * 0.20;
        }else{
            discount = Product.getValue() * Product.getStock() * 0.30; 
        }
        return discount;
    }

    public double getTotalSale() { 
         double totalSale = ((Product.getValue() * Product.getStock()) - calcDiscount()) + calcIva();
        return totalSale;
    }

    public double calcIva() {
        switch (Product.getTypeProduct()) {
            case LICORES:
                double calcIva = Product.getValue() * 0.19;
                break;
            case VIVERES:
                calcIva = Product.getValue() * 0.08;
                break;
            case MEDICINAS:
                calcIva = Product.getValue();
                break;
            case ASEO:
                calcIva = Product.getValue() * 0.14;
                break;
            case RANCHO:
                calcIva = Product.getValue() * 0.19;
                break;
        }

        return calcIva();
    }
}

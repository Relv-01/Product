public class Sale {
    private int cant;
    private Product product;

    public Sale(int cant, Product product) {
        this.cant = cant;
        this.product = product;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double calcDiscount() {
        double discount = 1;
        if (product.getStock() == 5 && product.getStock() == 10) {
            discount = product.getValue() * product.getStock() * 0.05;
        } else if (product.getStock() == 11 && product.getStock() == 20) {
            discount = product.getValue() * product.getStock() * 0.10;
        } else if (product.getStock() == 21 && product.getStock() == 50) {
            discount = product.getValue() * product.getStock() * 0.20;
        } else {
            discount = product.getValue() * product.getStock() * 0.30;
        }
        return discount;
    }

    public double getTotalSale() {
        double totalSale = ((product.getValue() * product.getStock()) - calcDiscount()) + calcIva();
        return totalSale;
    }

    public double calcIva() {
        double calcIva = 1;
        switch (product.getTypeProduct()) {
            case LICORES:
                calcIva = product.getValue() * 0.19;
                break;
            case VIVERES:
                calcIva = product.getValue() * 0.08;
                break;
            case MEDICINAS:
                calcIva = product.getValue();
                break;
            case ASEO:
                calcIva = product.getValue() * 0.14;
                break;
            case RANCHO:
                calcIva = product.getValue() * 0.19;
                break;
        }

        return calcIva;
    }
}

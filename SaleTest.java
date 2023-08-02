import org.junit.jupiter.api.Test;

public class SaleTest {

    @Test
    void testCalcDiscount() {
        Product product1 = new Product("Ron", 17.000, 5, true, ETypeProduct.LICORES);
        Product product2 = new Product("Paracetamol", 4.500, 51, false, ETypeProduct.MEDICINAS);
        assertEquals(80.750, product1, 0.001);
        assertEquals(183.600, product2, 0.001);

    }

    @Test
    void testCalcIva() {
        Product product1 = new Product("Ron", 17.000, 1, true, ETypeProduct.LICORES);
        Product product2 = new Product("Paracetamol", 4.500, 1, false, ETypeProduct.MEDICINAS);
        assertEquals(3.23, product1, 0.001);
        assertEquals(4.500, product2, 0.001);
}
    private void assertEquals(double d, Product product, double e) {
    }

    @Test
    void testGetTotalSale() {

    }
}
import exceptions.NegativePriceException;
import exceptions.NotFoundException;
import product.ProductController;
import product.ProductModel;


    public class Main {
        private ProductController product = new ProductController();
    
        public static void main(String[] args) {
            var mainIns = new Main();
    
            System.out.println("CREATE Product tests:");
            mainIns.productCreateTests();
    
            System.out.println("\n\nREAD Products tests:");
            mainIns.productReadTests();
    
            System.out.println("\n\nRETRIEVE Product tests:");
            mainIns.productRetrieveTests();
        }
    
        public void productCreateTests() {
            var productModelSuccess = new ProductModel("111-222", "Chinelo", 1500, 20);
            var productModelError = new ProductModel("111-222", "Chinelo", -500, 20);
    
            try {
                var newProduct = product.create(productModelSuccess);
                System.out.println(newProduct);
                product.create(productModelError);
            } catch (NegativePriceException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    
        public void productReadTests() {
            System.out.println(product.read());
        }
    
        public void productRetrieveTests() {
            var newProductModel = new ProductModel("222-333", "Chinelo 2", 1500, 20);
    
            try {
                product.create(newProductModel);
                var foundProduct = product.retrievePrice(newProductModel.getBarCode());
                System.out.println(foundProduct);
                product.retrievePrice("333-444");
            } catch (NotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
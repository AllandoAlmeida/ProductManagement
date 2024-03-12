package exceptions;

public class NotFoundException extends Exception {

    public NotFoundException(String productName) {
        super("Produto com código de barras '" + productName + "' não encontrado.");
    }

}

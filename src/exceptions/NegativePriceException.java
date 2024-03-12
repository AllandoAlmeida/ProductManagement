package exceptions;

public class NegativePriceException extends Exception{
    public NegativePriceException() {
        super("O preço do produto precisa ser um número positivo.");
    }

    public NegativePriceException(String msg) {
        super(msg);
    }
    
}

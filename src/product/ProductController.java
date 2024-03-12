package product;

import java.util.ArrayList;

import exceptions.NegativePriceException;
import exceptions.NotFoundException;

public class ProductController {
    private ArrayList<ProductModel> products = new ArrayList<>();

    public String create(ProductModel payload) throws Exception {

        if (payload.getPriceInCents() < 0) {
            throw new NegativePriceException("O preço do produto precisa ser um número positivo.");
        }

        products.add(payload);

        return "Produto '" + payload.getName() + "' adicionado.";
    }

    public ArrayList<ProductModel> read() {
        return products;
    }

    public Integer retrievePrice(String barCode) throws Exception {

        for (ProductModel product : products) {
            if (product.getBarCode().equals(barCode)) {
                return product.getPriceInCents();
            }
        }

        throw new NotFoundException("Produto com código de barras '" + barCode + "' não encontrado.");
    }
}

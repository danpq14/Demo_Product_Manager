package manager.product;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product> {

    @Override
    public int compare(Product product, Product t1) {
        if (product.getPrice() > t1.getPrice()) {
            return 1;
        }
        else if (product.getPrice() == t1.getPrice()) {
            return 0;
        }
        else return -1;
    }

}

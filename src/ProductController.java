import java.util.Arrays;

public class ProductController {

    public int add(Product[] list) {
        int sum = 0;

        for (Product prod : list) {
            prod.discounting();
            sum += prod.getPrice();
        }

        return sum;
    }

    public Product[] filter(Product[] list){
        int index = 0;
        Product[] filtered = new Product[100];

        for(Product prod : list){
            prod.discounting();

            if(prod.getPrice() > 100)
                filtered[index++] = prod;
        }

        return filtered;
    }

    public void sorted(Product[] list){

        for(Product prod : list)
            prod.discounting();

        Arrays.sort(list, (prod1, prod2) -> {
            if(prod1.getPrice() < prod2.getPrice())
                return 0;
            return 1;
        });
    }

    public Product findMax(Product[] list){
        Product max = new Product(Float.MIN_VALUE,Integer.MIN_VALUE);

        for(Product prod : list) {
            if(prod.getPrice() > max.getPrice())
                max = prod;
        }

        return max;
    }

    public Product findMin(Product[] list){
        Product min = new Product(Float.MAX_VALUE,Integer.MAX_VALUE);

        for(Product prod : list) {
            if(prod.getPrice() < min.getPrice())
                min = prod;
        }

        return min;
    }
}

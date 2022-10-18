public class Main {
    public static void main(String[] args) {
        ProductController ctrl = new ProductController();

        Product prod1 = new Product(12,5);
        Product prod2 = new Product(100,10);
        Product prod3 = new Product(117,23);
        Product prod4 = new Product(99,9);
        Product prod5 = new Product(40,1);
        Product prod6 = new Product((float) 112.94,1);

        Product[] list = {prod1, prod2, prod3, prod4, prod5, prod6};

        System.out.println(ctrl.add(list));
        System.out.println('\n');

        Product prodMax = ctrl.findMax(list);
        System.out.println("Price: " + prodMax.getPrice() + ", Date: " + prodMax.getDays());
        System.out.println('\n');

        Product prodMin = ctrl.findMin(list);
        System.out.println("Price: " + prodMin.getPrice() + ", Date: " + prodMin.getDays());
        System.out.println('\n');
    }
}
public class Method {

    public static double calculateSum(Product[] products){
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum = sum + products[i].getCena();
        }
        return sum;
    }

    public static Product checkPrices (Product[] products) {
        Product mostExpensiveProduct = products[0];
        for (int i = 0; i < products.length; i++) {
            if(products[i].getCena() > mostExpensiveProduct.getCena()){
                mostExpensiveProduct = products[i];
            }
        }
        return mostExpensiveProduct;
    }
}


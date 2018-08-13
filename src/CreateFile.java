import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        File file = new File("produkty.csv");
        if(!file.exists()){
        file.createNewFile();}

        int i = 0;
        try{
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String nextLine = scan.nextLine();
                i++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Product[] products = new Product[i];

        try{
            int j = 0;
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String nextLine = scan.nextLine();
                String[] split = nextLine.split(";");
                double price = Double.valueOf(split[2]);
                products[j] = new Product(split[0], split[1], price);
                j++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        String array = Arrays.toString(products);
        System.out.println(array);

        double sum = Method.calculateSum(products);
        System.out.println("Suma cen wszystkich produktów to: " + sum);

        Product product = Method.checkPrices(products);
        System.out.println("Najdroższy produkt to: " + product.getNazwa() + ", " + product.getCena());

    }
}

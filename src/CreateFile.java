import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("produkty.csv");
        BufferedWriter bfw = new BufferedWriter(fw);

        String line1 = "Mleko;mlekovita;2.5";
        String line2 = "Czekolada;wedel;3.5";
        String line3 = "Sok;hortex;5";

        bfw.write(line1);
        bfw.newLine();
        bfw.write(line2);
        bfw.newLine();
        bfw.write(line3);
        bfw.newLine();
        bfw.close();

        String[] split1 = line1.split(";");
        double price1 = Double.valueOf(split1[2]);

        String[] split2 = line2.split(";");
        double price2 = Double.valueOf(split2[2]);

        String[] split3 = line3.split(";");
        double price3 = Double.valueOf(split3[2]);

        Product[] products = new Product[3];
        products[0] = new Product(split1[0], split1[1], price1);
        products[1] = new Product(split2[0], split2[1], price2);
        products[2] = new Product(split3[0], split3[1], price3);

        String array = Arrays.toString(products);
        System.out.println(array);

        double sum = Method.calculateSum(products);
        System.out.println("Suma cen wszystkich produktów to: " + sum);

        Product product = Method.checkPrices(products);
        System.out.println("Najdroższy produkt to: " + product.getNazwa() + ", " + product.getCena());

    }
}

package stolovka;

/**
 * Created by Юра on 12.10.2015.
 */
public class Shop2 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item(20, 7, "кетчуп");
        items[1] = new Item(25, 10, "майонез");
        items[2] = new Item(5, 16, "перець");
        items[3] = new Item(8, 28, "молотий перець");
        items[4] = new Item(2, 0, "приправа");


        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}


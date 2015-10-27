package stolovka;

/**
 * Created by Юра on 13.10.2015.
 */
public class Item {

    int price;
    int howmany;
    String name;
    String mark;

    public Item(int price, int howmany, String name) {
        this.price = price;
        this.howmany = howmany;
        this.name = name;

        this.mark = "Торчин";

    }

    public void changeMark(String mark) {
        this.mark = mark;

    }


    public String toString() {
        return String.format(
                "%3d гривень,назва родукту: %10s, штук залишилось %d. Марка товару: %s",
                this.price, this.name, this.howmany, this.mark
        );
    }

}



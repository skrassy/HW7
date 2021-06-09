public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 15, false),
                new Cat("Sima", 25, false),
                new Cat("Pushok", 12, false),
                new Cat("Maya", 20, false),
                new Cat("Murzik", 10, false)
        };
        Plate plate = new Plate(50);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].catInfo();
        }
    }
}

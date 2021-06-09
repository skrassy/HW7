public class Cat {
    private final String name;
    private final int appetite;
    private boolean isSatiated;

    public Cat(String name, int appetite, boolean isSatiated) {
        this.name = name;
        this.appetite = appetite;
        this.isSatiated = isSatiated;
    }

    public void catInfo() {
        System.out.println("Name: " + name + " satiety: " + isSatiated);
    }

    public void eat(Plate plate) {
        if (plate.checkFoodInPlate(appetite)) {
            plate.decreaseFood(appetite);
            this.setSatiety(!this.getSatiety());
            System.out.println("The cat has eaten and in now full!");
        } else {
            System.out.println("There's not enough food in the plate! The cat was left hungry! Food left in plate: " + plate.getFood());
            plate.setFood(100);
        }
    }

    public void setSatiety(boolean satiety) {
        this.isSatiated = satiety;
    }

    public boolean getSatiety() {
        return isSatiated;
    }
}

public class Food {
    String name;
    double gramsOfFat;
    double gramsOfCarbohydrates;

    Food (String name, double gramsOfFat, double gramsOfCarbohydrates) {
        this.name = name;
        this.gramsOfFat = gramsOfFat;
        this.gramsOfCarbohydrates = gramsOfCarbohydrates;
    }

    public String getName () {
        return this.name;
    }

    public double getGramsOfFat () {
        return this.gramsOfFat;
    }

    public double getGramsOfCarbohydrates () {
        return this.gramsOfCarbohydrates;
    }

    public double calories () {
        double calories = this.gramsOfFat * 9 + gramsOfFat * 4;
        return calories;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Food) {
            Food f = (Food)other;
            return this.gramsOfCarbohydrates == f.gramsOfCarbohydrates && this.gramsOfFat == f.gramsOfFat;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
    // <name> {#g fat, #g carbs, # calories}
        return this.name + " " + this.gramsOfFat + " " + this.gramsOfCarbohydrates + " " + calories();
    }

    public static void main(String[] args) {
        // "Twinkie {8g fat, 43g carbs, 244 calories}"
        Food food_1 = new Food ("Twinkie", 8.0, 43.0);
        System.out.println(food_1);
    }

}

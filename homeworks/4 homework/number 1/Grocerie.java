public class Grocerie {
    String name;
    int calories, proteins, fats, carbohydrates;

    public Grocerie(String name, int calories, int proteins, int fats, int carbohydrates) {
        this.name = name;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public boolean equals(Grocerie product) {
        if (product.name == this.name &&
         product.calories == this.calories &&
         product.proteins == this.proteins &&
         product.fats == this.fats &&
         product.carbohydrates == this.carbohydrates ) {
            return true;
        } return false;
    }
}

class Fridge{
    String name;
    int capacity;
    int current_сapacity = 0;
    Grocerie[] products;

    public Fridge(String name, int capasity) {
        //класс, предназначенный для хранения объектов типа Grocerie
        this.name = name;
        this.capacity = capacity;
        this.products = new Grocerie[capasity];
    }


    public void add_grocerie(Grocerie product) {
        if (this.current_сapacity < this.capacity) {
            this.products[this.current_сapacity] = product;
            this.current_сapacity++;
        } else {
            System.out.println("Your fridge is full");
        }
    }


    public Grocerie get_grocerie(int grocerie_id) {
        return this.products[grocerie_id];
    }


    public void print() {
        System.out.println(this.name + ", " + (this.capacity - this.current_сapacity) + " places left");
        for (int i=0; i < this.current_сapacity; i++) {
            System.out.println(this.products[i].name + ", " + this.products[i].calories
             + "(" + this.products[i].proteins + "p, " + this.products[i].fats
              + "f, " + this.products[i].carbohydrates + "c)");
        }
    }


    public void remove_grocerie(Grocerie product) {
        boolean flag = false;
        for (int i=this.current_сapacity - 1; i >= 0; i++) {
            if (this.products[i].equals(product)) {
                flag = true;
            }
            if (flag) {
                this.products[i] = this.products[i+1];
            }
        }
        if (this.products[this.current_сapacity-1].equals(product)) {
            this.products[this.current_сapacity-1] = null;
        }
        if (flag == false) {
            System.out.println("The product '" + product.name + "' is not in the fridge '" + this.name + "'");
        }
    }
}
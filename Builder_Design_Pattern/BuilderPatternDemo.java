// BuilderPatternDemo.java
class Burger {
    private String size;       // Required
    private boolean cheese;    // Optional
    private boolean lettuce;   // Optional
    private boolean tomato;    // Optional
    private String drink;      // Optional

    private Burger(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.drink = builder.drink;
    }

    @Override
    public String toString() {
        return "Burger [Size=" + size + ", Cheese=" + cheese +
               ", Lettuce=" + lettuce + ", Tomato=" + tomato +
               ", Drink=" + drink + "]";
    }

    public static class Builder {
        private String size;   // Required
        private boolean cheese;
        private boolean lettuce;
        private boolean tomato;
        private String drink;

        public Builder(String size) { this.size = size; }

        public Builder cheese(boolean value) { this.cheese = value; return this; }
        public Builder lettuce(boolean value) { this.lettuce = value; return this; }
        public Builder tomato(boolean value) { this.tomato = value; return this; }
        public Builder drink(String value) { this.drink = value; return this; }

        public Burger build() { return new Burger(this); }
    }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Burger myBurger = new Burger.Builder("Large")
                                .cheese(true)
                                .lettuce(false)
                                .tomato(true)
                                .drink("Coke")
                                .build();

        System.out.println(myBurger);
    }
}

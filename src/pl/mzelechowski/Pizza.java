package pl.mzelechowski;

public class Pizza {
    private String flour;
    private String cheese;
    private String tomato;
    private String ham;
    private String pineapple;
    private String beans;
    private String onion;

    public Pizza(Builder b) {
        this.flour = b.flour;
        this.cheese = b.cheese;
        this.tomato = b.tomato;
        this.ham = b.ham;
        this.pineapple = b.pineapple;
        this.beans = b.beans;
        this.onion = b.onion;
    }


    public static class Builder {
        private String flour;
        private String cheese;
        private String tomato;
        private String ham;
        private String pineapple;
        private String beans;
        private String onion;

        public Builder flour(String flour) {
            this.flour = flour;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder tomato(String tomato) {
            this.tomato = tomato;
            return this;
        }

        public Builder ham(String ham) {
            this.ham = ham;
            return this;
        }

        public Builder pineapple(String pineapple) {
            this.pineapple = pineapple;
            return this;
        }

        public Builder beans(String beans) {
            this.beans = beans;
            return this;
        }

        public Builder onion(String onion) {
            this.onion = onion;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "flour='" + flour + '\'' +
                ", cheese='" + cheese + '\'' +
                ", tomato='" + tomato + '\'' +
                ", ham='" + ham + '\'' +
                ", pineapple='" + pineapple + '\'' +
                ", beans='" + beans + '\'' +
                ", onion='" + onion + '\'' +
                '}';
    }
}

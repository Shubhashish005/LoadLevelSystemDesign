package org.designPattern.builder;

public class Burger {

    private String size;
    private Boolean egg;
    private Boolean extraCheese;
    private Boolean mayonese;
    private Boolean onion;
    private Boolean lettuce;

    public Burger(BurgerBuilder burgerBuilder) {
        // Initialize all fields and do all validation
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Boolean getEgg() {
        return egg;
    }

    public void setEgg(Boolean egg) {
        this.egg = egg;
    }

    public Boolean getExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(Boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public Boolean getMayonese() {
        return mayonese;
    }

    public void setMayonese(Boolean mayonese) {
        this.mayonese = mayonese;
    }

    public Boolean getOnion() {
        return onion;
    }

    public void setOnion(Boolean onion) {
        this.onion = onion;
    }

    public Boolean getLettuce() {
        return lettuce;
    }

    public void setLettuce(Boolean lettuce) {
        this.lettuce = lettuce;
    }

    public static class BurgerBuilder {
        private String size;
        private Boolean egg;
        private Boolean extraCheese;
        private Boolean mayonese;
        private Boolean onion;
        private Boolean lettuce;

        public  BurgerBuilder size(String size){
            this.size = size;
            return this;
        }

        public  BurgerBuilder egg(Boolean egg){
            this.egg = egg;
            return this;
        }

        public  BurgerBuilder extraCheese(Boolean extraCheese){
            this.extraCheese = extraCheese;
            return this;
        }

        public  BurgerBuilder mayonese(Boolean mayonese){
            this.mayonese = mayonese;
            return this;
        }

        public  BurgerBuilder onion(Boolean onion){
            this.onion = onion;
            return this;
        }

        public  BurgerBuilder lettuce(Boolean lettuce){
            this.lettuce = lettuce;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }

    }
}

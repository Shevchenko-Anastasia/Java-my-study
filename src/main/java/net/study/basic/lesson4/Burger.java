package net.study.basic.lesson4;

import java.util.Objects;

public class Burger {
    String bun;
    String onion;
    String salad;
    String tomato;
    String kotlette;
    String veganKotlette;

    public Burger (String bun, String onion, String salad, String tomato, String kotlette){
      this.bun = bun;
      this.onion = onion;
      this.salad = salad;
      this.tomato = tomato;
      this.kotlette = kotlette;

    }

    public Burger (String bun, String onion, String salad, String tomato) {
        this.bun = bun;
        this.onion = onion;
        this.salad = salad;
        this.tomato = tomato;
        this.veganKotlette = "veganKotlette";
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", onion='" + onion + '\'' +
                ", salad='" + salad + '\'' +
                ", tomato='" + tomato + '\'' +
                ", kotlette='" + kotlette + '\'' +
                ", veganKotlette='" + veganKotlette + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Burger burger = (Burger) o;
        return Objects.equals(bun, burger.bun) && Objects.equals(onion, burger.onion) && Objects.equals(salad, burger.salad) && Objects.equals(tomato, burger.tomato) && Objects.equals(kotlette, burger.kotlette) && Objects.equals(veganKotlette, burger.veganKotlette);
    }

    public boolean isDietician (){
        return kotlette == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bun, onion, salad, tomato, kotlette, veganKotlette);
    }
}


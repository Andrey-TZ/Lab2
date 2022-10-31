package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Pokemon pok1 = new Clefable("Клефф", 20);
        Pokemon pok2 = new Skiddo("Скидд", 20);
        Battle var1 = new Battle();
        var1.addAlly(pok1);
        var1.addFoe(pok2);
        var1.go();
    }
}

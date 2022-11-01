package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        battle.addAlly(new Reshiram("Реширам", 50));
        battle.addAlly(new Skiddo("Скиддо", 50));
        battle.addAlly(new Cleffa("Клефа", 50));

        battle.addFoe(new Clefable("Клефейбл", 50));
        battle.addFoe(new Gogoat("Гогоат", 50));
        battle.addFoe(new Clefairy("Клеф", 50));

        battle.go();
    }
}

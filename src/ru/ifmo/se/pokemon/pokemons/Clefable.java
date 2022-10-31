package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.moves.physicalMoves.DoubleSlap;

public class Clefable extends Clefairy {
    public Clefable(String name, int lvl) {
        super(name, lvl);
        this.setStats(95, 70, 73, 95, 90, 60);
        this.addMove(new DoubleSlap());
    }
}

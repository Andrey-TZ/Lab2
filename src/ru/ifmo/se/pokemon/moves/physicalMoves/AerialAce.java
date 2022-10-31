package ru.ifmo.se.pokemon.moves.physicalMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
// Never misses.

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, 1);
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }

    @Override
    protected String describe() {
        return "uses Aerial Ace";
    }

}

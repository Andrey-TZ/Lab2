package ru.ifmo.se.pokemon.moves.physicalMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class SeedBomb extends PhysicalMove {
    public SeedBomb(){super(Type.GRASS, 80, 1);}

    @Override
    protected String describe() {return "uses Seed Bomb";}
}

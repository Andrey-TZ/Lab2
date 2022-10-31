package ru.ifmo.se.pokemon.moves.physicalMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){super(Type.GROUND, 60, 1);}

    @Override
    protected void applyOppEffects(Pokemon pok) {
        pok.setMod(Stat.SPEED, -1);
        super.applyOppEffects(pok);
    }

    @Override
    protected String describe() {
        return "uses Bulldoze";
    }
}

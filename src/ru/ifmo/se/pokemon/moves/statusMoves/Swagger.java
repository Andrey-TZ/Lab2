package ru.ifmo.se.pokemon.moves.statusMoves;

import ru.ifmo.se.pokemon.*;

// Raises the target's Attack by two stages and confuses the target.
public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        pok.setMod(Stat.ATTACK, 2);
        Effect.confuse(pok);
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}

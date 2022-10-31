package ru.ifmo.se.pokemon.moves.statusMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

// Paralyzes the target.
public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 0.9);
    }

    @Override
    protected void applyOppEffects(Pokemon pok) {
        Effect.paralyze(pok);
    }

    @Override
    protected String describe() {return "uses Thunder Wave";}
}

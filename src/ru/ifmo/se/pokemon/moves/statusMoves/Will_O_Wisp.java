package ru.ifmo.se.pokemon.moves.statusMoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

// Burns the target.

public class Will_O_Wisp extends StatusMove {
    public Will_O_Wisp(){ super(Type.FIRE, 0, 0.85);}

    @Override
    protected void applyOppEffects(Pokemon pok) {
        Effect.burn(pok);
    }

    @Override
    protected String describe() {
        return "uses Will-O-Wisp";
    }

}

package ru.ifmo.se.pokemon.moves.statusMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

// Raises the user's Attack and Special Attack by one stage each.

public class WorkUp extends StatusMove {
    public WorkUp() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.ATTACK, 1);
        pok.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override
    protected String describe() {
        return "использует Work up";
    }
}

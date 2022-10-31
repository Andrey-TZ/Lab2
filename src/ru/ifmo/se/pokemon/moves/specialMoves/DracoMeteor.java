package ru.ifmo.se.pokemon.moves.specialMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


// Lowers the user's Special Attack by two stages after inflicting damage.

public class DracoMeteor extends SpecialMove {
    public DracoMeteor() {
        super(Type.DRAGON, 130, 0.9);
    }

    @Override
    protected void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.SPECIAL_ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "uses Draco Meteor";
    }

}

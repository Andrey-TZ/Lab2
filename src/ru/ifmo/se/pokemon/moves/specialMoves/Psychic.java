package ru.ifmo.se.pokemon.moves.specialMoves;

import ru.ifmo.se.pokemon.*;

// Has a 10% chance to lower the target's Special Defense by one stage.
public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pok){
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_ATTACK, -1);
        pok.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "атакует Psychic";
    }

}

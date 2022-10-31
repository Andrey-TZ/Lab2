package ru.ifmo.se.pokemon.moves.specialMoves;

import ru.ifmo.se.pokemon.*;

// Has a 10% chance to lower the target's Special Defense by one stage.
public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC, 90, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pok){
        Effect effect = new Effect();
        effect.chance(0.1);
        effect.stat(Stat.SPECIAL_DEFENSE, -1);
        pok.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "uses Psychic";
    }

}

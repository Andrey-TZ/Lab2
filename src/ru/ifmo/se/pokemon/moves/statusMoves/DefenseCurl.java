package ru.ifmo.se.pokemon.moves.statusMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;


// Raises user's Defense by one stage.
public class DefenseCurl extends StatusMove {
    public DefenseCurl() {super(Type.NORMAL, 0, 100);}

    @Override
    protected void applySelfEffects(Pokemon pok){
        pok.setMod(Stat.DEFENSE, 1);
    }

    @Override
    protected String describe() {return "активирует Defense Curl";}
}

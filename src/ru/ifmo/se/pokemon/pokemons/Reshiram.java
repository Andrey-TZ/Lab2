package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.moves.specialMoves.DracoMeteor;
import ru.ifmo.se.pokemon.moves.specialMoves.Psychic;
import ru.ifmo.se.pokemon.moves.statusMoves.Swagger;
import ru.ifmo.se.pokemon.moves.statusMoves.Will_O_Wisp;


public class Reshiram extends Pokemon {
    public Reshiram(String var1, int var2) {
        super(var1, var2);
        this.setType(Type.DRAGON, Type.FIRE);
        this.setStats(100, 120, 100, 150, 120, 90);


        this.addMove(new Psychic());
        this.addMove(new Swagger());
        this.addMove(new Will_O_Wisp());
        this.addMove(new DracoMeteor());
    }
}

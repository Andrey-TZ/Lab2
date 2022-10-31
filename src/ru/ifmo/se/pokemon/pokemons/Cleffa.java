package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.moves.specialMoves.Psychic;
import ru.ifmo.se.pokemon.moves.statusMoves.ThunderWave;
import ru.ifmo.se.pokemon.moves.statusMoves.WorkUp;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int lvl){
        super(name, lvl);
        this.setType(Type.FAIRY);
        this.setStats(50, 25, 28, 45, 55, 15);

        this.setMove(new Psychic(), new ThunderWave());
    }

}

package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.moves.physicalMoves.AerialAce;
import ru.ifmo.se.pokemon.pokemons.Skiddo;

public class Gogoat extends Skiddo {
    public Gogoat(String name, int lvl){
        super(name, lvl);
        this.setStats(123, 100, 62, 97, 81, 68);
        this.addMove(new AerialAce());
    }
}

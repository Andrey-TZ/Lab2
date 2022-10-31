package ru.ifmo.se.pokemon.pokemons;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.moves.physicalMoves.Bulldoze;
import ru.ifmo.se.pokemon.moves.physicalMoves.SeedBomb;
import ru.ifmo.se.pokemon.moves.statusMoves.WorkUp;

public class Skiddo extends Pokemon {
    public Skiddo(String name, int lvl){
        super(name, lvl);
        this.setType(Type.GRASS);
        this.setStats(66, 65, 48, 62, 57, 52);

        this.addMove(new WorkUp());
        this.addMove(new SeedBomb());
        this.addMove(new Bulldoze());
    }}


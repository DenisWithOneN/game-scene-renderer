package rpg.game.characters;

import rpg.game.characters.details.Ability;
import rpg.game.characters.details.Faction;

import java.util.Arrays;

public class Orc extends Character {

    public Orc(String name, int level, String faction) {
        super(name, level, Faction.HORDE, Arrays.asList(Ability.MELEE_ATTACK));
    }
}

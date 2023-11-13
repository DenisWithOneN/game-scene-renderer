package rpg.game.characters;

import rpg.game.characters.details.Ability;
import rpg.game.characters.details.Faction;
import java.util.Arrays;

public class Human extends Character {

    public Human(String name, int level, String faction) {
        super(name, level, Faction.ALLIANCE, Arrays.asList(Ability.MELEE_ATTACK, Ability.RANGED_ATTACK));
    }
}

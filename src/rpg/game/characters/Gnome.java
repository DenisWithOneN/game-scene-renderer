package rpg.game.characters;

import rpg.game.characters.details.Ability;
import rpg.game.characters.details.Faction;

import java.util.Arrays;

public class Gnome extends Character {

    public Gnome(String name, int level, String faction) {
        super(name, level, Faction.ALLIANCE, Arrays.asList(Ability.MELEE_ATTACK, Ability.FIREBALL, Ability.SHADOW_BOLT, Ability.WATER_BOLT, Ability.LIGHTING_BOLT));
    }
}

package rpg.game.characters;

import rpg.game.characters.details.Ability;
import rpg.game.characters.details.Faction;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private String name;
    private int level;
    private Faction faction;
    private List<Ability> abilities;
    private int x,y;

    public Character(String name, int level, Faction faction, List<Ability> abilities) {
        this.name = name;
        this.level = level;
        this.faction = faction;
        // setting abilities to an empty list if abilities is null, if not, setting it to an ArrayList of abilities
        this.abilities = abilities != null ? new ArrayList<>(abilities) : new ArrayList<>();

    }

    // returning a new ArrayList of abilities, so that the abilities of the character can't be modified from outside the class
    public List<Ability> getAbilities() {
        return new ArrayList<>(abilities);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Faction getFaction() {
        return faction;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }



}

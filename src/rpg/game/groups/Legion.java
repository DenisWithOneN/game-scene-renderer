package rpg.game.groups;

import java.util.ArrayList;
import java.util.List;
import rpg.game.characters.Character;

public class Legion {

    private List<Character> characters;


    public Legion() {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void moveGroup(int x, int y) {
        for (Character character : characters) {
            character.move(x, y);
        }

    }
}

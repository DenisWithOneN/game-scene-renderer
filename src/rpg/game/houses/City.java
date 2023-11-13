package rpg.game.houses;

import java.util.ArrayList;
import java.util.List;

public class City {

    private List<House> houses;

    public City() {
        houses = new ArrayList<>();
    }

    public void addHouse(House house) {
        houses.add(house);
    }

    public List<House> getHouses() {
        return houses;
    }
}

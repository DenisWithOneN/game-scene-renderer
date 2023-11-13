package rpg.game.houses;

public class HouseDirector {
    public House constructHouse(HouseBuilder builder) {
        builder.buildWalls();
        builder.buildRoof();
        return builder.getHouse();
    }
}

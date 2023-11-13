package rpg.game.houses;

public class OrgrimaarHouseBuilder implements HouseBuilder {

    private House house; // this is the object we're going to build

    public OrgrimaarHouseBuilder() {
        this.house = new OrgrimaarHouse();
    }

    @Override
    public void buildWalls() {
        house.setWalls("wood");
    }

    @Override
    public void buildRoof() {
        house.setRoof("hay");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}


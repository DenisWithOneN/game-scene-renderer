package rpg.game.houses;

public class IronforgeHouseBuilder implements HouseBuilder {
    private House house; // this is the object we're going to build

    public IronforgeHouseBuilder() {
        this.house = new IronforgeHouse();
    }

    @Override
    public void buildWalls() {
        house.setWalls("obsidian");
    }

    @Override
    public void buildRoof() {
        house.setRoof("slate");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}

package rpg.game.scenetype;

public class IronforgeHouseFactory implements HouseFactory {
    @Override
    public House createHouse() {
        HouseBuilder ironforgeHouseBuilder = new IronforgeHouseBuilder();
        HouseDirector director = new HouseDirector();
        return director.constructHouse(ironforgeHouseBuilder);
    }
}

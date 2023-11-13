package rpg.game.houses;

public class OrgrimaarHouse implements House {
    private String material;
    private String roofType;

    @Override
    public void setWalls(String material) {
        this.material = material;
    }

    @Override
    public void setRoof(String roofType) {
        this.roofType = roofType;
    }

    @Override
    public String toString() {
        return "Orgrimaar{" + "material=" + material + ", roofType=" + roofType + '}';
    }

}

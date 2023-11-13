package rpg.game.houses;

public class IronforgeHouse implements House {

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
        return "IronforgeHouse{" + "material=" + material + ", roofType=" + roofType + '}';
       }


}

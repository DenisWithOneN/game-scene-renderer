package rpg.game;

import rpg.game.characters.*;
import rpg.game.houses.*;

public class Main {
    public static void main(String[] args) {
//        Orc orc = new Orc("Thrall", 10, "HORDE");
//        System.out.println("Name of the orc: " + orc.getName() + ", level: " + orc.getLevel() + ", faction: " + orc.getFaction());
//        System.out.println(orc.getName() + " has the following : " + orc.getAbilities());
//
//        Human human = new Human("Jaina", 10, "ALLIANCE");
//        System.out.println("Name of the human: " + human.getName() + ", level: " + human.getLevel() + ", faction: " + human.getFaction());
//        System.out.println(human.getName() + " Has the following : " + human.getAbilities());
//
//
//        Elf elf = new Elf("Sylvanas", 10, "HORDE");
//        System.out.println("Name of the elf: " + elf.getName() + ", level: " + elf.getLevel() + ", faction: " + elf.getFaction());
//        System.out.println(elf.getName() + " has the following : " + elf.getAbilities());
//
//        Gnome gnome = new Gnome("Mekkatorque", 10, "ALLIANCE");
//        System.out.println("Name of the gnome: " + gnome.getName() + ", level: " + gnome.getLevel() + ", faction: " + gnome.getFaction());
//        System.out.println(gnome.getName() + " has the following : " + gnome.getAbilities());
//
//        Troll troll = new Troll("Vol'jin", 10, "HORDE");
//        System.out.println("Name of the troll: " + troll.getName() + ", level: " + troll.getLevel() + ", faction: " + troll.getFaction());
//        System.out.println(troll.getName() + " has the following : " + troll.getAbilities());



        HouseDirector director = new HouseDirector();

        HouseBuilder ironforgeHouseBuilder = new IronforgeHouseBuilder();
        House ironforgeHouse = director.constructHouse(ironforgeHouseBuilder);
        System.out.println(ironforgeHouse);

        HouseBuilder orgrimaarHouseBuilder = new OrgrimaarHouseBuilder();
        House orgrimaarHouse = director.constructHouse(orgrimaarHouseBuilder);
        System.out.println(orgrimaarHouse);

    }
}

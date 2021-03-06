package map.building;

import map.terrain.TerrainType;

/**
 * Created by bobvv on 7/9/17.
 */
public enum BuildingType
{
    BUILDING1(new Color(0,139, 120), TerrainType.GRASS,4500, 1),
    BUILDING2(new Color(51, 50, 41), TerrainType.SAND,5000, 2),
    BUILDING3(new Color(31, 50, 41), TerrainType.MOUNTAIN,5000, 3),
    BUILDING4(new Color(21, 50, 41), TerrainType.GRASS,5000, 4),
    BUILDING5(new Color(11, 50, 41), TerrainType.GRASS,5000, 5),
    BUILDING6(new Color(85, 50, 41), TerrainType.GRASS,5000, 6);

    private Color color;
    private TerrainType availableTerrain;

    private int maxhealth;
    public int getMaxhealth(){
        return maxhealth;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int health;

    private int index;

    /////////////////////

    BuildingType(Color color, TerrainType terrainType, int health, int index)
    {
        this.color = color;
        this.availableTerrain = terrainType;
        this.health = health;
        maxhealth = health;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public TerrainType getAvailableTerrain() {
        return availableTerrain;
    }

    public Color getColor() {
        return color;
    }
}
